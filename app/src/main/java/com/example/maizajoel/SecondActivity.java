package com.example.maizajoel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText e_pasar3a2, getE_pasar3a22, e_nombre, e_base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        e_pasar3a2.setText(bundle.getString("PasarA2"));
        e_pasar3a2.setText(bundle.getString("PasarA22"));

    }

    public void enviarActivity3(View view){
        Intent intent_A3 = new Intent(this, ThirdActivity.class);
        startActivity(intent_A3);
    }

    public void regresarActivity1(View view){
        Intent intent_A2 = new Intent(this, MainActivity.class);
        startActivity(intent_A2);
    }
}