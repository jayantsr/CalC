package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button but0, but1, but2, but3,but4, but5, but6, but7,
            but8, but9, but00, butequal, butadd, butminus, butmulti, butdiv, butc, butpt;

    EditText textcontent;
    TextView txtaFunc;
    private Double valueOne = Double.NaN;
    private Double valueTwo;


    private static final char ADD = '+';
    private static final char SUB = '-';
    private static final char MUL = '*';
    private static final char DIV = '/';

    private char CURRENT_ACTION;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DecimalFormat decimalFormat = new DecimalFormat("#.##########");

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
        but00 = findViewById(R.id.but00);
        butpt = findViewById(R.id.butpt);
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
        butpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "." );
            }
        });
        but00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(textcontent.getText() + "00" );
            }
        });
        butc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcontent.setText(null);
                txtaFunc.setText(null);
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';

            }
        });

        butadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCal();
                CURRENT_ACTION = ADD;
                txtaFunc.setText(decimalFormat.format(valueOne)+ '+');
                textcontent.setText(null);
            }
        });

        butminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCal();
                CURRENT_ACTION = SUB;
                txtaFunc.setText(decimalFormat.format(valueOne)+ '-');
                textcontent.setText(null);
            }
        });

        butmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCal();
                CURRENT_ACTION = MUL;
                txtaFunc.setText(decimalFormat.format(valueOne)+ '*');
                textcontent.setText(null);
            }
        });

        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCal();
                CURRENT_ACTION = DIV;
                txtaFunc.setText(decimalFormat.format(valueOne)+ '/');
                textcontent.setText(null);
            }
        });

        butequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCal();
                textcontent.setText(decimalFormat.format(valueOne));
                txtaFunc.setText(null);
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
            }
        });


    }

    private void computeCal() {
        if (!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(textcontent.getText().toString());
            textcontent.setText(null);

            if (CURRENT_ACTION == ADD)
                valueOne = this.valueOne+valueTwo;
            else if (CURRENT_ACTION == SUB)
                valueOne = this.valueOne-valueTwo;
            else if (CURRENT_ACTION == MUL)
                valueOne = this.valueOne*valueTwo;
            else if (CURRENT_ACTION == DIV)
                valueOne = this.valueOne/valueTwo;
        }
        else {
            try {
                valueOne = Double.parseDouble(textcontent.getText().toString());
            }
            catch (Exception e){}
        }
    }

}
