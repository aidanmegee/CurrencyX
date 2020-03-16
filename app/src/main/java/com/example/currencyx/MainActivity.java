package com.example.currencyx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conversion = (Button) findViewById(R.id.button); //finds resource id for button
        conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //onClick method sends intent to start ExchangeActivity
                openExchangeActivity();
            }
        });
    }

    public void openExchangeActivity() {
        Intent exchangeIntent = new Intent(this, ExchangeActivity.class); //creates a new intent for currency exchange
        startActivity(exchangeIntent); //starts new Exchange Activity
    }
}
