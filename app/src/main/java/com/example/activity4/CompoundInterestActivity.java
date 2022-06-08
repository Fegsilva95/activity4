package com.example.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CompoundInterestActivity extends AppCompatActivity {
    Button btnCalculate;
    Double value;
    EditText periodValue;
    EditText compoundValue;
    Intent intent;
    EditText interestValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            value = extras.getDouble("value");
        }

        btnCalculate = findViewById(R.id.compoundInterestButton);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(CompoundInterestActivity.this, MainActivity.class);
                interestValue = findViewById(R.id.interestCompoundValue);
                periodValue = findViewById(R.id.periodCompoundValue);
                Double interestDouble = Double.parseDouble(interestValue.toString());
                Double result = value * Math.pow(1 * interestDouble, Double.parseDouble(periodValue.toString()));

                intent.putExtra("valueCalculate", result);
                startActivity(intent);
            }
        });
    }
}