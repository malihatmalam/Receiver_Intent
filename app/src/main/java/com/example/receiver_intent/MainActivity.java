package com.example.receiver_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ReceiverMessageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri != null){
            ReceiverMessageUrl = findViewById(R.id.Receiver_Uri_Message);
            ReceiverMessageUrl.setText("URI: "+uri.toString());
        }
    }
}
