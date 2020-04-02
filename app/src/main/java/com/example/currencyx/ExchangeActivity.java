package com.example.currencyx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ExchangeActivity extends AppCompatActivity {

    double USD = 0.62; //Exchange rates as member fields // Create a dictionary holding the currency as Keys and rates as Values e.g. {USD : 0.62}
    double EUR = 0.55; //Euro
    double GBP = 0.49; //British pounds
    double INR = 46.5; //Indian Rupee
    double JPY = 65.5; //Japanese Yen
    double CAD = 0.86; //Canadian Dollar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        Button exchangeRatesButton = findViewById(R.id.exchangeRates);
        exchangeRatesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExchangeRatesActivity();
            }
        });

    }

    public void currencyConversion() { //method for converting currency
        //code that using current currency exchange values AUD ---> USD 0.62
        EditText aud = findViewById(R.id.aud);
        aud.setInputType(InputType.TYPE_CLASS_NUMBER); //input type set to number value

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(aud.getText().toString()); //wraps Integer value to produce the string value of dollars converted
        double result = dollars * USD;
        currencyConverted.setText(String.valueOf(result));
    }

    public void convertOnClick(View view) { //convert method that calls currencyConversion for exchange
        currencyConversion();
    }

    public void resetExchange(View view) {
        Button reset = findViewById(R.id.reset);

        reset.setEnabled(true);
        EditText aud = findViewById(R.id.aud);
        EditText currencyConverted = findViewById(R.id.currency_converted);
        aud.setText("");
        currencyConverted.setText("");
    }

    public void openExchangeRatesActivity() {
        Intent exchangeRates = new Intent(this, ExchangeRatesActivity.class);
        startActivity(exchangeRates);
    }

}
