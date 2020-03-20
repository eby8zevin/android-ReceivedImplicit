package com.example.update_receivedimplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class receiveurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiveurl);
        setTitle("Receive URL");

        Intent url = getIntent();
        String link = url.getDataString();

        TextView textView = findViewById(R.id.tvUrl);
        textView.setText(link);
    }
}
