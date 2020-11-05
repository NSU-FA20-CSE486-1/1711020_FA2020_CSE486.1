package com.zahinahmed.signinactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView email;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email= (TextView) findViewById(R.id.take_email_address);
        password= (TextView) findViewById(R.id.take_password);


    }

    public void login(View view) {
        String loginemail= "zahinahmed97@gmail.com";
        String loginpassword="abcd1234";
        
        String inputemail= email.getText().toString().trim();;
        String inputpassword = password.getText().toString().trim();;
        
        if(inputemail.equals(loginemail) && inputpassword.equals(loginpassword)){
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, R.string.toast_message_fail, Toast.LENGTH_SHORT).show();
        }
    }
}