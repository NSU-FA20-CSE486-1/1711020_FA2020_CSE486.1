package com.zahinahmed.signinactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        String message = "Welcome "+email;

        TextView textView = findViewById(R.id.message_label);
        textView.setText(message);
    }

    public void logout(View view) {
        Toast.makeText(this, R.string.toast_message_logout, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}