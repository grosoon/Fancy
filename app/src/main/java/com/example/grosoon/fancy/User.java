package com.example.grosoon.fancy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] loginInfo = getIntent().getExtras().getStringArray("loginInfo");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Welcome " + loginInfo[0]);
    }
}
