package com.atashi.sahaay.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.atashi.sahaay.R;

public class MainActivity extends AppCompatActivity {

    public Button getstarted;

    public void init() {
        getstarted = findViewById(R.id.get_started_button);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(first);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
