package com.example.currencyx;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExchangeActivity extends AppCompatActivity {

    EditText audText;
    double USD = 0.62; //Exchange rates as member fields // Create a dictionary holding the currency as Keys and rates as Values e.g. {USD : 0.62}
    double EUR = 0.55; //Euro
    double GBP = 0.49; //British pounds
    double INR = 46.5; //Indian Rupee
    double JPY = 65.5; //Japanese Yen
    double CAD = 0.86; //Canadian Dollar

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        Window window = getWindow(); //current window
        window.setStatusBarColor(Color.parseColor("#0E8C3A")); //sets status bar colour by parsing hex code string value

        ActionBar actionBar; //Action Bar object
        actionBar = getSupportActionBar(); //retrieve current action bar.this

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#37BC61")); //new colour drawable object
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable); //changes colour to new hex colour value

        Button settingsButton = findViewById(R.id.settings);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsActivity();
            }
        });
    }

    public void audAmountInput() { //helper method for finding AUD input from user
        audText = findViewById(R.id.aud);
        audText.setInputType(InputType.TYPE_CLASS_NUMBER); //input type set to number value
    }

    @SuppressLint("SetTextI18n")
    public void audToUSD(double USD) { ////AUD --> United States Dollars
        audAmountInput();
        TextView usdConversion = findViewById(R.id.convert);
        usdConversion.setText("AUD TO USD");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(audText.getText().toString()); //wraps Integer value to produce the string value of dollars converted
        double result = dollars * USD;
        currencyConverted.setText(String.valueOf(result)); //returns string value of conversion
    }

    @SuppressLint("SetTextI18n")
    public void audToEUR(double EUR) { //AUD --> EURO POUNDS
        audAmountInput();

        TextView eurConversion = findViewById(R.id.convert);
        eurConversion.setText("AUD TO EURO");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(audText.getText().toString());
        double result = dollars * EUR;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToGBP(double GBP) { //AUD --> Great British Pounds
        audAmountInput();

        TextView gbpConversion = findViewById(R.id.convert);
        gbpConversion.setText("AUD TO GBP");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(audText.getText().toString());
        double result = dollars * GBP;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToINR(double INR) { //AUD --> EURO Indian Rupee
        audAmountInput();

        TextView inrConversion = findViewById(R.id.convert);
        inrConversion.setText("AUD TO INR");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(audText.getText().toString());
        double result = dollars * INR;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToJPY(double JPY) { //AUD --> Japanese Yen
        audAmountInput();

        TextView jpyConversion = findViewById(R.id.convert);
        jpyConversion.setText("AUD TO JPY");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(audText.getText().toString());
        double result = dollars * JPY;
        currencyConverted.setText(String.valueOf(result));
    }

    @SuppressLint("SetTextI18n")
    public void audToCAD(double CAD) { //AUD --> Canadian Dollars
        audAmountInput();

        TextView cadConversion = findViewById(R.id.convert);
        cadConversion.setText("AUD TO CAD");

        EditText currencyConverted = findViewById(R.id.currency_converted);
        currencyConverted.setInputType(InputType.TYPE_CLASS_NUMBER);

        double dollars = Integer.parseInt(audText.getText().toString());
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

    public void onButtonClick(View view) { //onClick method handling all currency button clicks
        switch (view.getId()) {
            case (R.id.usd):
                audToUSD(USD);
                break;

            case (R.id.eur):
                audToEUR(EUR);
                break;

            case (R.id.gbp):
                audToGBP(GBP);
                break;

            case (R.id.inr):
                audToINR(INR);
                break;

            case (R.id.jpy):
                audToJPY(JPY);
                break;

            case (R.id.cad):
                audToCAD(CAD);
                break;
        }
    }

    public void settingsActivity() {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);
    }

}
