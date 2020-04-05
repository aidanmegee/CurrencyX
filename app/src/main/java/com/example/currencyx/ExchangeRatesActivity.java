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

public class ExchangeRatesActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_rates);

        Window window = getWindow(); //current window
        window.setStatusBarColor(Color.parseColor("#0E8C3A")); //sets status bar colour by parsing hex code string value

        ActionBar actionBar; //Action Bar object
        actionBar = getSupportActionBar(); //retrieve current action bar.this

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#37BC61")); //new colour drawable object
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable); //changes colour to new hex colour value

        Button conversionButton = findViewById(R.id.conversion);
        conversionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //when conversion is clicked, starts Exchange Activity from this
                exchangeActivity();
            }
        });

        Button doneButton = findViewById(R.id.done);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //when "Done" is clicked, finish activity returning to Exchange activity
                finish();
            }
        });

    }

    public void exchangeActivity() { //method to start new activity from exchange rates activity
        Intent exchangeIntent = new Intent(this, ExchangeActivity.class);
        startActivity(exchangeIntent);
    }

}
