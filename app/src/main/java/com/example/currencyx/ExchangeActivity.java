package com.example.currencyx;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


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

    }

    public void audToUSD() { ////AUD --> United States Dollars
        EditText aud = findViewById(R.id.aud);
        aud.setInputType(InputType.TYPE_CLASS_NUMBER); //input type set to number value

        TextView usdConversion = findViewById(R.id.convert);
        usdConversion.setText("AUD TO USD");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(aud.getText().toString()); //wraps Integer value to produce the string value of dollars converted
        double result = dollars * USD;
        currencyConverted.setText(String.valueOf(result)); //returns string value of conversion
    }

    @SuppressLint("SetTextI18n")
    public void audToEUR() { //AUD --> EURO POUNDS
        EditText aud = findViewById(R.id.aud);
        aud.setInputType(InputType.TYPE_CLASS_NUMBER);

        TextView eurConversion = findViewById(R.id.convert);
        eurConversion.setText("AUD TO EURO");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(aud.getText().toString());
        double result = dollars * EUR;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToGBP() { //AUD --> Great British Pounds
        EditText aud = findViewById(R.id.aud);
        aud.setInputType(InputType.TYPE_CLASS_NUMBER);

        TextView gbpConversion = findViewById(R.id.convert);
        gbpConversion.setText("AUD TO GBP");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(aud.getText().toString());
        double result = dollars * GBP;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToINR() { //AUD --> EURO Indian Rupee
        EditText aud = findViewById(R.id.aud);
        aud.setInputType(InputType.TYPE_CLASS_NUMBER);

        TextView inrConversion = findViewById(R.id.convert);
        inrConversion.setText("AUD TO INR");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(aud.getText().toString());
        double result = dollars * INR;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToJPY() { //AUD --> Japanese Yen
        EditText aud = findViewById(R.id.aud);
        aud.setInputType(InputType.TYPE_CLASS_NUMBER);

        TextView jpyConversion = findViewById(R.id.convert);
        jpyConversion.setText("AUD TO JPY");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(aud.getText().toString());
        double result = dollars * JPY;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToCAD() { //AUD --> Canadian Dollars
        EditText aud = findViewById(R.id.aud);
        aud.setInputType(InputType.TYPE_CLASS_NUMBER);

        TextView cadConversion = findViewById(R.id.convert);
        cadConversion.setText("AUD TO CAD");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(aud.getText().toString());
        double result = dollars * CAD;
        currencyConverted.setText(String.valueOf(result));
    }


    public void resetExchange(View view) { //resets values of edit text elements
        Button reset = findViewById(R.id.reset);
        reset.setEnabled(true);
        EditText aud = findViewById(R.id.aud);
        EditText currencyConverted = findViewById(R.id.currency_converted);
        aud.setText("");
        currencyConverted.setText("");
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case (R.id.usd):
                audToUSD();
                break;

            case (R.id.eur):
                audToEUR();
                break;

            case (R.id.gbp):
                audToGBP();
                break;

            case (R.id.inr):
                audToINR();
                break;

            case (R.id.jpy):
                audToJPY();
                break;

            case (R.id.cad):
                audToCAD();
                break;
        }
    }

}
