package com.example.currencyx;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Window window = getWindow(); //current window
        window.setStatusBarColor(Color.parseColor("#0E8C3A")); //sets status bar colour by parsing hex code string value

        ActionBar actionBar; //Action Bar object
        actionBar = getSupportActionBar(); //retrieve current action bar.this

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#37BC61")); //new colour drawable object
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable); //changes colour to new hex colour value

        Button instructionsButton = findViewById(R.id.instructions);
        instructionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInstructions();
            }
        });

        Button exchangeRatesButton = findViewById(R.id.exchangeRates);
        exchangeRatesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showExchangeRates();
            }
        });

        Button doneButton = findViewById(R.id.doneSettings);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void showInstructions() { //method for showing instructions
        Intent instructionsIntent = new Intent(this, ExchangeActivity.class); //sets intent to Exchange Activity

        String instructions = "Enter an Amount of AUD then press any currency button to convert!";
        instructionsIntent.putExtra("Instructions", instructions); //stores values of string instructions
        Toast.makeText(getApplicationContext(), instructions, Toast.LENGTH_LONG).show(); //shows toast popup for instructions
        startActivity(instructionsIntent);

    }

    public void showExchangeRates() { //method for showing exchange rates
        Intent exchangeRatesIntent = new Intent(this, ExchangeActivity.class);

        String exchangeRates = getResources().getString(R.string.exchange_rate_values); //finds string resource value from string xml
        exchangeRatesIntent.putExtra("Exchange Rates", exchangeRates);
        Toast.makeText(getApplicationContext(), exchangeRates, Toast.LENGTH_LONG).show(); //shows toast popup for exchange rates
        startActivity(exchangeRatesIntent);
    }
}
