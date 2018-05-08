package com.example.anas_ch.unitconverter;

import android.content.Intent;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button temperaturebtn,areabtn,lengthbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperaturebtn = (Button)findViewById(R.id.temperaturebtn);
        areabtn = (Button)findViewById(R.id.areabtn);
        lengthbtn = (Button)findViewById(R.id.lengthbtn);

        temperaturebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TemperatureActivity.class);
                startActivity(i);
            }
        });

        areabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AreaActivity.class);
                startActivity(i);
            }
        });

        lengthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LengthActivity.class);
                startActivity(i);
            }
        });

    }
}
