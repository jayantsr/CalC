package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText1 =   findViewById(R.id.textcontent);
        editText1.requestFocus();
        editText1.setShowSoftInputOnFocus(false);
    }
}
