package com.example.ultimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Salud extends AppCompatActivity {
    EditText etNombre,etAltura,etPeso;
    Button btnCalcular,btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        etNombre=(EditText) findViewById(R.id.txtNombre);
        etAltura=(EditText) findViewById(R.id.txtAltura);
        etPeso=(EditText) findViewById(R.id.txtPeso);
        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        btnLimpiar=(Button) findViewById(R.id.btnLimpiar);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpiar();
            }
        });

    }
    public void calcular (View view){
        Intent d = new Intent(this, Datos.class);
        d.putExtra("NOMMBRE", etNombre.getText().toString());
        d.putExtra("ALTURA", etAltura.getText().toString());
        d.putExtra("PESO", etPeso.getText().toString());

        startActivity(d);
    }

    private void Limpiar() {
        etNombre.setText("");
        etAltura.setText("");
        etPeso.setText("");
    }


}