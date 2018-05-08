package com.example.anas_ch.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LengthActivity extends AppCompatActivity {

    Button calculatelengthbtn,lengthbackbtn,resetbtn;
    EditText feettext,miletext,yardtext,metertext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        calculatelengthbtn = (Button)findViewById(R.id.calculatelengthbtn);
        lengthbackbtn = (Button)findViewById(R.id.lengthbackbtn);
        resetbtn = (Button)findViewById(R.id.resetbtn);

        feettext = (EditText)findViewById(R.id.feettext);
        miletext = (EditText)findViewById(R.id.miletext);
        yardtext = (EditText)findViewById(R.id.yardtext);
        metertext = (EditText)findViewById(R.id.metertext);

        myFunctionForTextChanging();

        calculatelengthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(feettext.getText().toString().equals(""))){
                    try{
                        Double feet = Double.parseDouble(feettext.getText().toString());
                        Double meter = feet / 3.28;
                        Double yard = feet * 0.33333;
                        Double mile = feet * 5280;
                        miletext.setText(mile.toString());
                        yardtext.setText(yard.toString());
                        metertext.setText(meter.toString());
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
                    }
                }
                else if(!(metertext.getText().toString().equals(""))){
                    try{
                        Double meter = Double.parseDouble(metertext.getText().toString());
                        Double feet = meter / 0.3048;
                        Double yard = meter /0.9144;
                        Double mile = meter * 0.00062137;
                        miletext.setText(mile.toString());
                        yardtext.setText(yard.toString());
                        feettext.setText(feet.toString());
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
                    }
                }
                else if(!(miletext.getText().toString().equals(""))){
                    try{
                        Double mile = Double.parseDouble(miletext.getText().toString());
                        Double feet = mile * 5280;
                        Double yard = mile * 1760.0;
                        Double meter = mile / 0.00062137;
                        metertext.setText(meter.toString());
                        yardtext.setText(yard.toString());
                        feettext.setText(feet.toString());
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
                    }
                }
                else if(!(yardtext.getText().toString().equals(""))){
                    try{
                        Double yard = Double.parseDouble(yardtext.getText().toString());
                        Double feet = yard * 3.0000;
                        Double mile = yard / 1760.0;
                        Double meter = yard / 1.0936;
                        metertext.setText(meter.toString());
                        miletext.setText(mile.toString());
                        feettext.setText(feet.toString());
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        lengthbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feettext.setText("");
                miletext.setText("");
                yardtext.setText("");
                metertext.setText("");
            }
        });

    }

    public void myFunctionForTextChanging() {

        feettext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (feettext.getText().toString().equals("")) {
                    miletext.setEnabled(true);
                    yardtext.setEnabled(true);
                    metertext.setEnabled(true);
                } else {                    miletext.setEnabled(false);
                    yardtext.setEnabled(false);
                    metertext.setEnabled(false);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        miletext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (miletext.getText().toString().equals("")) {
                    feettext.setEnabled(true);
                    yardtext.setEnabled(true);
                    metertext.setEnabled(true);
                } else {
                    feettext.setEnabled(false);
                    yardtext.setEnabled(false);
                    metertext.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        yardtext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (yardtext.getText().toString().equals("")) {
                    miletext.setEnabled(true);
                    feettext.setEnabled(true);
                    metertext.setEnabled(true);
                } else {
                    miletext.setEnabled(false);
                    feettext.setEnabled(false);
                    metertext.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        metertext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (metertext.getText().toString().equals("")) {
                    miletext.setEnabled(true);
                    yardtext.setEnabled(true);
                    feettext.setEnabled(true);
                } else {
                    miletext.setEnabled(false);
                    yardtext.setEnabled(false);
                    feettext.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

}
