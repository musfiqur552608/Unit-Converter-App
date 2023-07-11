package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText kgtxt;
    private TextView lbtxt;
    private Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kgtxt = findViewById(R.id.kgid);
        lbtxt = findViewById(R.id.lbid);
        convert = findViewById(R.id.convertbtn);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double kilo = Double.parseDouble(kgtxt.getText().toString());
                lbtxt.setText(""+convert(kilo)+" lb");

            }
        });

    }
    public double convert(double kilo){
        return kilo * 2.20462;
    }
}