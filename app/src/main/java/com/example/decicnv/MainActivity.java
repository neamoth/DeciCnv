package com.example.decicnv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Button;
    private TextView TextView;
    private EditText EditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button = findViewById(R.id.button);
        TextView = findViewById(R.id.textView2);
        EditText = findViewById(R.id.editTextTextPersonName);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s =EditText.getText().toString();
                int input = Integer.parseInt(s);
//                double f =((input * 9)/5)+32;
//                TextView.setText("Fahrenheit Temperature is, " + f +"f");
                String binary = Integer.toBinaryString(input);
                String HexaDecimal = Integer.toHexString(input);
                TextView.setText("Binary Value is, " + binary + "\n"  + "HexaDecimal Value is, " + HexaDecimal );
            }
        });

    }
}