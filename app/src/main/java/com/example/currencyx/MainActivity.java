package com.example.currencyx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button conversion = findViewById(R.id.conversion);
        conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExchangeActivity();
            }
        });

        Button exchangeRatesButton = findViewById(R.id.exchangeRates);
        exchangeRatesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExchangeRatesActivity();
            }
        });

    }

    private void openExchangeActivity() { //sends intent to start ExchangeActivity
        Intent exchangeIntent = new Intent(MainActivity.this, ExchangeActivity.class);
        startActivity(exchangeIntent);
    }

    public void openExchangeRatesActivity() { //sends intent to exchange rate activity to start
        Intent exchangeRates = new Intent(this, ExchangeRatesActivity.class);
        startActivity(exchangeRates);
    }
}
