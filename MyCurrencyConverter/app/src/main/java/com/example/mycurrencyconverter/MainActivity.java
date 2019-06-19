package com.example.mycurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertNGNToUSD(View view){
        EditText amountToBeConverted = (EditText) findViewById(R.id.amountToBeConverted);
        double amount = Double.parseDouble(amountToBeConverted.getText().toString());
        double dollarAmount = amount*0.0028;
        Toast.makeText(this, String.valueOf(dollarAmount),Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
