package com.example.edittextdemo_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtText1,edtText2;
    Button addButton,subButton;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText1 = findViewById(R.id.edt_01);
        edtText2 = findViewById(R.id.edt_02);

        addButton = findViewById(R.id.addButton);

        subButton = findViewById(R.id.subButton);

        txtView = findViewById(R.id.txtView);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

       String number1 = edtText1.getText().toString();
       String number2 = edtText2.getText().toString();

       // Converting double

        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if (v.getId() ==R.id. addButton){

            double sum = num1 + num2;
            txtView.setText("Sum = "+sum);

        }
        if (v.getId() == R.id. subButton){

            double sub = num1 - num2;
            txtView.setText("Sum = "+sub);

        }


    }
}