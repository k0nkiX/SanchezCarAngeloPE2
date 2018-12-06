package com.example.angelo.sanchezcarangelope2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SanchezCarlAngeloPE2 extends AppCompatActivity {

    private EditText fnamer;
    private EditText agesr;
    private EditText gendersr;

    private TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanchez_carl_angelo_pe2);

        fnamer = (EditText)findViewById(R.id.fname);
        agesr = (EditText)findViewById(R.id.ages);
        gendersr = (EditText)findViewById(R.id.genders);

        Button search = (Button)findViewById(R.id.search);

        view = (TextView)findViewById(R.id.view);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output();
            }
        });
    }
    private void output() {
        view.setText(fnamer  + agesr + gendersr);


     }
}
