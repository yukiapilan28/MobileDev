package com.example.gradeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtPrelim, txtMidterm, txtPreFinals, txtFinals;
    Button buttonClear, buttonCalculate;
    TextView textAverage;
    Double prelimFloat, midtermFloat,preFinalsFloat, finalsFloat,averagefloat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // edit text
        txtPrelim = findViewById(R.id.txtPrelim);
        txtMidterm= findViewById(R.id.txtMidterm);
        txtPreFinals= findViewById(R.id.txtPreFinals);
        txtFinals= findViewById(R.id.txtFinals);

        //button

        buttonClear=findViewById(R.id.buttonClear);
        buttonCalculate=findViewById(R.id.buttonCcalculate);

        //text view

        textAverage= findViewById(R.id.textAverage);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prelimFloat= Double.parseDouble(txtPrelim.getText().toString());
                midtermFloat= Double.parseDouble(txtMidterm.getText().toString());
                preFinalsFloat= Double.parseDouble(txtPreFinals.getText().toString());
                finalsFloat= Double.parseDouble(txtFinals.getText().toString());

                averagefloat = ((prelimFloat * .20) +(midtermFloat * .20) + (preFinalsFloat * .20) + (finalsFloat * .40));

                textAverage.setText(averagefloat.toString());

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPrelim.getText().clear();
                txtMidterm.getText().clear();
                txtPreFinals.getText().clear();
                txtFinals.getText().clear();
                textAverage.setText("0.0");
            }
        });




    }
}