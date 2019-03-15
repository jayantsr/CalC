package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but0, but1, but2, but3,but4, but5, but6, but7,
            but8, but9, butequal, butadd, butminus, butmulti, butdiv, butc;

    EditText textcontent;

    TextView txtaFunc;

    float mValueOne, mValuetwo;

    boolean cPlus, cMinus, cMultiply, cDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 =   findViewById(R.id.textcontent);
        editText1.requestFocus();
        editText1.setShowSoftInputOnFocus(false);

        but0 = findViewById(R.id.but0);
        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);
        but6 = findViewById(R.id.but6);
        but7 = findViewById(R.id.but7);
        but8 = findViewById(R.id.but8);
        but9 = findViewById(R.id.but9);
        butadd = findViewById(R.id.butplus);
        butminus = findViewById(R.id.butminus);
        butmulti = findViewById(R.id.butmul);
        butdiv = findViewById(R.id.butdiv);
        butc = findViewById(R.id.butesc);
        butequal = findViewById(R.id.butequeal);

        textcontent = findViewById(R.id.textcontent);
        txtaFunc = findViewById(R.id.aFunc);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textcontent.setText(textcontent.getText() + "1");
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "3");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "4");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "5");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "6");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "7");
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "8");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "9");
            }
        });
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "0" );
            }
        });
        butc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText("");
            }
        });

        butadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtaFunc.setText("+");
            }
        });

    }
}
