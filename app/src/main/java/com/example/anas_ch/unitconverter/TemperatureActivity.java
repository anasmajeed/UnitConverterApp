package com.example.anas_ch.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class TemperatureActivity extends AppCompatActivity {

    EditText temperatureinput;
    Button backbtn,calculatebtn;
    RadioButton celciusradiobtn,farenhietradiobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);


        temperatureinput = (EditText)findViewById(R.id.areainput);
        backbtn = (Button)findViewById(R.id.backbtn);
        calculatebtn = (Button)findViewById(R.id.calculateareabtn);
        celciusradiobtn = (RadioButton)findViewById(R.id.celciusradiobtn);
        farenhietradiobtn = (RadioButton)findViewById(R.id.farenhietradiobtn);

        calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    Double value = Double.parseDouble(temperatureinput.getText().toString());
                    if(celciusradiobtn.isChecked()){
                        value = (value*9.0/5.0)+32;
                        temperatureinput.setText("");
                        temperatureinput.append(value.toString());
                    }else if(farenhietradiobtn.isChecked()) {
                        value = (value - 32)*5.0/9.0;
                        temperatureinput.setText("");
                        temperatureinput.append(value.toString());
                    }

                }catch (Exception e){

                    Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
                    temperatureinput.setText("");

                }
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
