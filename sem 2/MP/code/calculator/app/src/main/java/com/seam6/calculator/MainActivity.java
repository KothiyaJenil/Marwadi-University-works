package com.seam6.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    double firstNumber = 0;
    String operator = "";
    boolean isNewNumber = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
    }

    // Number button click
    public void onDigitClick(View view) {
        Button button = (Button) view;

        if (isNewNumber) {
            tvResult.setText(button.getText().toString());
            isNewNumber = false;
        } else {
            tvResult.append(button.getText().toString());
        }
    }

    // Operator button click
    public void onOperatorClick(View view) {
        Button button = (Button) view;

        firstNumber = Double.parseDouble(tvResult.getText().toString());
        operator = button.getText().toString();
        isNewNumber = true;
    }

    // Equal button
    public void onEqual(View view) {
        double secondNumber = Double.parseDouble(tvResult.getText().toString());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0)
                    result = firstNumber / secondNumber;
                else
                    tvResult.setText("Error");
                return;
        }

        tvResult.setText(String.valueOf(result));
        isNewNumber = true;
    }

    // Clear button
    public void onClear(View view) {
        tvResult.setText("0");
        firstNumber = 0;
        operator = "";
        isNewNumber = true;
    }
}
