package com.example.maizajoel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}















































/*
p
























/*

package fisei.uta.edu.ec.practica002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e_x1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e_x1 = findViewById(R.id.editTextNum1);
    }

    public void enviarActivity2(View view){
        Long num1 = Long.valueOf(e_x1.getText().toString());

            Intent intent_A2 = new Intent(this, SecondActivity.class);
            intent_A2.putExtra("Pasar", num1.toString());
            startActivity(intent_A2);
    }
}











package fisei.uta.edu.ec.practica002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    //private EditText e_x1;
    private EditText e_pasar;
    private EditText e_x2;
    private EditText e_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Instanciar para pasar info
        Bundle bundle = getIntent().getExtras();

       //e_x1 = findViewById(R.id.editTextNum1);
        e_x2 = findViewById(R.id.editTextNum2A2);
        e_res = findViewById(R.id.editTextResultado);
        e_pasar =findViewById(R.id.editTextNum1A2);

        //Pasar información (ver arriba)
        e_pasar.setText(bundle.getString("Pasar"));
    }

    public void calcularMultiplicacion (View view){
        Long num1, num2;
        num1 = Long.valueOf(e_pasar.getText().toString());
        num2 = Long.valueOf(e_x2.getText().toString());

        e_res.setText(String.valueOf(multiplicar(num1, num2)));
    }

    public void EnviarActivty3(View view){
        Intent intent_A3 = new Intent(this, ThirdActivity.class);
        intent_A3.putExtra("PasarA3", e_res.getText().toString());
        startActivity(intent_A3);
    }

    public long multiplicar(long x1, long x2){
        return x1 * x2;
    }
}







package fisei.uta.edu.ec.practica002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    private EditText e_resultadoA3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle bundle = getIntent().getExtras();
        e_resultadoA3 = findViewById(R.id.editTextResultadoA3);

        e_resultadoA3.setText(bundle.getString("PasarA3"));

    }

    /*public void enviarActivity1(View view){
        Intent intent_A1 = new Intent(this, MainActivity.class);
        intent_A1.putExtra("PasarA1", e_x1.toString());
        startActivity(intent_A1);
    }

 int i =1
 int f= 1
 while(num>=i){
    f*=i
    i++}
    return f
 }

  int cal(int n1, int p){
  int ans = 1
  for(int=1; i<= p, i++){
    ans = ans*n;
    }
    return ans
  }
 */