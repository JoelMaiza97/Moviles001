package com.example.maizajoel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarActivity2(View view){
        Intent intent_A2 = new Intent(this, SecondActivity.class);
        startActivity(intent_A2);
    }
}



















