package com.lukeinnovationlab.randomnumbergenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final Random RANDOM = new Random(System.currentTimeMillis());
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 999;

    private TextView mViewRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewRandomNumber = (TextView) findViewById(R.id.text_random_number);
    }

    protected void onGenerate(View view) {
        if (view.getId() == R.id.action_generate) {
            int number = generateRandomNumber();
            mViewRandomNumber.setText(String.valueOf(number));

            Log.i(TAG, "Generated: " + number);
        }
    }

    private int generateRandomNumber() {
        return RANDOM.nextInt(MAX_NUMBER) + MIN_NUMBER;
    }
}
