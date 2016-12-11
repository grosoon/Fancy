package com.example.grosoon.fancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends AppCompatActivity {
    public static EditText username;
    public static EditText password;
    public static Button login_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        LogInButton();
    }

    public void LogInButton() {
        username = (EditText) findViewById(R.id.editText_user);
        password = (EditText) findViewById(R.id.editText_password);
        login_button = (Button) findViewById(R.id.button_login);

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(logIn.this, User.class);
                        Bundle bundle = new Bundle();
                        String[] loginInfo = new String[2];
                        loginInfo[0] = username.getText().toString();
                        loginInfo[1] = password.getText().toString();
                        bundle.putStringArray("loginInfo", loginInfo);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                }
        );
    }

}
