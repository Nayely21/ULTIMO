package com.example.ultimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Datos extends AppCompatActivity {

    Button btnvalor;

    TextView namee;
    String nombre;
    TextView alturaa;
    String peso;
    TextView pesoo;
    String altura;

    TextView condicionn;
    TextView valoor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        nombre = getIntent().getExtras().getString("NOMMBRE");
        namee=(TextView) findViewById(R.id.namee);
        namee.setText(nombre);

        peso=getIntent().getExtras().getString("PESO");
        pesoo=(TextView) findViewById(R.id.pesoo);
        pesoo.setText(peso);

        altura=getIntent().getExtras().getString("ALTURA");
        alturaa=(TextView) findViewById(R.id.alturaa);
        alturaa.setText(altura);

        condicionn=(TextView) findViewById(R.id.condicionn);
        valoor=(TextView) findViewById(R.id.valorr);

    }
        public void calcular(View view) {
            String calificar = "";
            Float IMC = Float.parseFloat(pesoo.getText().toString()) / (Float.parseFloat(alturaa.getText().toString()) * Float.parseFloat(alturaa.getText().toString()));
            if (IMC < 16) {
                calificar = "El peso esta \n calificado como Bajo Peso muy grave,\n se recomienda ensaladas de frutas";
            } else if (IMC < 16.99) {
                calificar = "El peso esta calificado \n Bajo Peso grave,\n se recomienda consumir \n nutrientes y proteinas";
            } else if (IMC < 18.49) {
                calificar = "El peso esta calificado\n como Bajo Peso, se \n recomienda consumir verduras ";
            } else if (IMC < 24.99) {
                calificar = "El peso esta calificado \n como Normal,\n eso decir que tiene una \n buena dieta balanceada";
            } else if (IMC < 29.99) {
                calificar = "El peso esta calificado \n como Sobre Peso, se \n recomienda disminuir \n algunas calorias de \n su vida cotidiana ";
            } else if (IMC < 34.99) {
                calificar = "El peso esta calificado\n como Obesidad Grado I\n se recomienda dejar \n todo tipo de calorias \n";
            } else if (IMC < 39.99) {
                calificar = "El peso esta calificado\n como Obesidad Grado II \n es obligatorio dejar las \n calorias, como chocolates\n y grasas, asi tambien comer\n saludablemente";
            } else {
                calificar = "El peso esta calificado\ncomo Obesidad Grado III \n se urge hacer ejercicio y tomar abundante agua, \n acompañado de una dieta saludable ";
            }

            condicionn.setText(calificar);
            valoor.setText(IMC.toString());
        }

    }



//    public void buton(View view){
//        String Nom = getIntent().getExtras().getString("NOMMBRE");
//        namee.setText(Nom);
//    }

