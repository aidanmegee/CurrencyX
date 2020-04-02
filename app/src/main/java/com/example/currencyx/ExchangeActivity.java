package com.example.currencyx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ExchangeActivity extends AppCompatActivity {


    EditText editText = findViewById(R.id.currency_converted);
    int dollars = Integer.parseInt(editText.getText().toString());
    double USD = 0.62; //Exchange rates as member fields
    double EUR = 0.55; //Euro
    double GBP = 0.49; //British pounds
    double INR = 46.5; //Indian Rupee
    double JPY = 65.5; //Japanese Yen
    double CAD = 0.86; //Canadian Dollar



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
    }

    public void currencyConversion(View view) { //method for converting currency
        //code that using current currency exchange values AUD ---> USD 0.62

        double result = dollars * USD; //determines value after conversion
        Toast.makeText(ExchangeActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }

    public void click(View view) {
    }

    public void reset(View view) { //method that handles reset of both edit text widgets

    }

    public void exchangeRates(View view) {

    }
}
