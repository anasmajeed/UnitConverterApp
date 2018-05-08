package com.example.anas_ch.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class AreaActivity extends AppCompatActivity {
    EditText areainput;
    Button areabackbtn,calculateareabtn;
    RadioButton squaremetersradiobtn,squarefeetradiobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        areainput = (EditText)findViewById(R.id.areainput);
        areabackbtn = (Button)findViewById(R.id.backbtn);
        calculateareabtn = (Button)findViewById(R.id.calculateareabtn);
        squaremetersradiobtn = (RadioButton)findViewById(R.id.squaremetersradiobtn);
        squarefeetradiobtn = (RadioButton)findViewById(R.id.squarefeetradiobtn);

        calculateareabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    Double value = Double.parseDouble(areainput.getText().toString());
                    if(squaremetersradiobtn.isChecked()){
                        value = value * 10.764;
                        areainput.setText("");
                        areainput.append(value.toString());
                    }else if(squarefeetradiobtn.isChecked()) {
                        value = value / 10.764;
                        areainput.setText("");
                        areainput.append(value.toString());
                    }

                }catch (Exception e){

                    Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
                    areainput.setText("");

                }
            }
        });

        areabackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
