package com.example.currencyx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ExchangeActivity extends AppCompatActivity {

    EditText editText = findViewById(R.id.currency_to_be_converted);
    int dollars = Integer.parseInt(editText.getText().toString()); //converts dollars entered to a string value
    double usd = 0.62; //usd current exchange rate


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
    }

    public void currencyConversion(View view) { //method for converting currency
        //code that using current currency exchange values AUD ---> USD 0.62

        double result = dollars * usd; //determines value after conversion
        Toast.makeText(ExchangeActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }
}
