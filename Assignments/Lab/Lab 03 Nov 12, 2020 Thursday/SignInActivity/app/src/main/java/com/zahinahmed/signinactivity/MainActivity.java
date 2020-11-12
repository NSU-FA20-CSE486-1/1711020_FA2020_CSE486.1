package com.zahinahmed.signinactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.zahinahmed.signinactivity.extra.MESSAGE";
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
        
        String inputemail= email.getText().toString().trim();
        String inputpassword = password.getText().toString().trim();
        
        if(inputemail.equals(loginemail) && inputpassword.equals(loginpassword)){
            launchSecondActivity();
        }
        else {
            Toast.makeText(this, R.string.toast_message_fail, Toast.LENGTH_SHORT).show();
        }
    }

    private void launchSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        String inputemail= email.getText().toString().trim();

        intent.putExtra(EXTRA_MESSAGE,inputemail);
        startActivity(intent);
        finish();

    }
}