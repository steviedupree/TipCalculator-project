package com.example.tipcalculator_dupree;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button fifteenPercent;
    Button twentyPercent;
    Button twentyFivePercent;
    EditText editText;
    TextView textView;

    Double money;
    Double finalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fifteenPercent = (Button) findViewById(R.id.option_fifteen_percent);
        twentyPercent = (Button) findViewById(R.id.option_twenty_percent);
        twentyFivePercent = (Button) findViewById(R.id.option_twenty_five_percent);
        editText = (EditText) findViewById(R.id.service_cost);
        textView = (TextView) findViewById(R.id.service_question);

        finalAmount = 1.00;
        fifteenPercent.setOnClickListener(this);
        twentyPercent.setOnClickListener(this);
        twentyFivePercent.setOnClickListener(this);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        money =Double.parseDouble(editText.getText().toString());
        if (v.getId() == fifteenPercent.getId()){
            finalAmount = money * .15;
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            textView.setText("$" + finalAmount.toString());
        }

        if (v.getId() ==twentyPercent.getId()){
            finalAmount = money * .20;
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            textView.setText("$" +finalAmount.toString());
        }

        if (v.getId() == twentyFivePercent.getId()){
            finalAmount = money * .25;
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            textView.setText("$" + finalAmount.toString());
        }



    }
}