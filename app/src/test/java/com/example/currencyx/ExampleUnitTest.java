package com.example.currencyx;

import android.view.View;
import android.widget.Button;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {

    private double aud = 10.3;
    @Test
    public void audToUSD() {
        ExchangeActivity exchangeActivity = new ExchangeActivity();

        double result = aud * exchangeActivity.USD;
        assertEquals(6.386, result, exchangeActivity.USD);

    }

    @Test
    public void audToEUR() {
        ExchangeActivity exchangeActivity = new ExchangeActivity();

        double result = aud * exchangeActivity.EUR;
        assertEquals(5.665, result, exchangeActivity.EUR);
    }

    @Test
    public void audToGBP() {
        ExchangeActivity exchangeActivity = new ExchangeActivity();

        double result = aud * exchangeActivity.GBP;
        assertEquals(5.047, result, exchangeActivity.GBP);
    }

    @Test
    public void audToINR() {
        ExchangeActivity exchangeActivity = new ExchangeActivity();

        double result = aud * exchangeActivity.INR;
        assertEquals(478.95, result, exchangeActivity.INR);
    }

    @Test
    public void audToJPY() {
        ExchangeActivity exchangeActivity = new ExchangeActivity();

        double result = aud * exchangeActivity.JPY;
        assertEquals(674.65, result, exchangeActivity.JPY);
    }

    @Test
    public void audToCAD() {
        ExchangeActivity exchangeActivity = new ExchangeActivity();

        double result = aud * exchangeActivity.CAD;
        assertEquals(8.858, result, exchangeActivity.CAD);
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}