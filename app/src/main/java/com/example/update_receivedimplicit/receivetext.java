package com.example.update_receivedimplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class receivetext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receivetext);
        setTitle("Receive Text");

        Intent txt = getIntent();
        String text = txt.getStringExtra(Intent.EXTRA_TEXT);

        TextView textView = findViewById(R.id.tvText);
        textView.setText(text);
    }
}
