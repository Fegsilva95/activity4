package com.example.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSimple;
    Button btnCompound;
    Intent intent;
    EditText valuePlainText;
    TextView beginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimple = findViewById(R.id.simpleInterestButton);
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(MainActivity.this, SimpleInterestActivity.class);
                valuePlainText = findViewById(R.id.valuePlainText);
                intent.putExtra("value", valuePlainText.getText().toString());
                startActivity(intent);
            }
        });

        btnCompound = findViewById(R.id.simpleInterestButton);
        btnCompound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(MainActivity.this, SimpleInterestActivity.class);
                valuePlainText = findViewById(R.id.valuePlainText);
                intent.putExtra("value", valuePlainText.getText().toString());
                startActivity(intent);
            }
        });

        beginTextView = findViewById(R.id.beginTextView);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            Double valueCalculate = extras.getDouble("valueCalculate");
            beginTextView.setText(valueCalculate.toString());
        }
    }

}