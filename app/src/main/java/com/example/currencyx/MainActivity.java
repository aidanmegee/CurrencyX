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

public class MainActivity extends AppCompatActivity  {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow(); //current window
        window.setStatusBarColor(Color.parseColor("#0E8C3A")); //sets status bar colour by parsing hex code string value

        ActionBar actionBar; //Action Bar object
        actionBar = getSupportActionBar(); //retrieve current action bar.this

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#37BC61")); //new colour drawable object
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable); //changes colour to new hex colour value

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
