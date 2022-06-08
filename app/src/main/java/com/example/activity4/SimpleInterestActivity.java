package com.example.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SimpleInterestActivity extends AppCompatActivity {
    Button btnCalculate;
    Double value;
    EditText periodValue;
    EditText interestValue;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            value = extras.getDouble("value");
        }

        btnCalculate = findViewById(R.id.simpleInterestButton);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(SimpleInterestActivity.this, MainActivity.class);
                interestValue = findViewById(R.id.interestValue);
                periodValue = findViewById(R.id.periodValue);
                Double interestDouble = Double.parseDouble(interestValue.toString());
                Double result = value + (value * interestDouble * Integer.parseInt(periodValue.toString()));

                intent.putExtra("valueCalculate", result);
                startActivity(intent);
            }
        });
    }
}