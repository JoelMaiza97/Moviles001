package com.example.maizajoel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    private EditText e_nombre, e_apellido, e_base, e_exponente, e_factorial, e_pasarNombre, e_pasarBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Instanciar para pasar info
        Bundle bundle = getIntent().getExtras();

        e_nombre = findViewById(R.id.editTextNombreA3);
        e_apellido = findViewById(R.id.editTextApeliidoA3);
        e_base = findViewById(R.id.editTextBaseA3);
        e_exponente = findViewById(R.id.editTextExponenteA3);
        e_factorial =findViewById(R.id.editTextFactorialA3);

        e_pasarNombre =findViewById(R.id.editTextNombreA2);
        e_pasarBase =findViewById(R.id.editTextBaseA2);

        e_pasarNombre.setText(bundle.getString("PasarA2"));
        e_pasarBase.setText(bundle.getString("PasarA22"));
    }
    public void regresarActivity2(View view){
        Intent intent_A2 = new Intent(this, SecondActivity.class);
        startActivity(intent_A2);
    }
}