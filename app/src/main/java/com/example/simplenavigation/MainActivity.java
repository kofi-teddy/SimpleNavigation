package com.example.simplenavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextButtonClick(View view) {
        Intent intent = new Intent(this, AboutPage.class);

        final EditText indexInput = (EditText) findViewById(R.id.index_message);
        String userMessage = indexInput.getText().toString();
        intent.putExtra("sendMessage", userMessage);
        startActivity(intent);
    }
}
