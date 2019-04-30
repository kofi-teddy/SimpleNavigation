package com.example.simplenavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        Bundle indexData = getIntent().getExtras();
        String messageReceived = indexData.getString("sendMessage");
        final TextView aboutMessageDisplay = (TextView) findViewById(R.id.receive_message);
        aboutMessageDisplay.setText(messageReceived);

    }

    public void goBackButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
