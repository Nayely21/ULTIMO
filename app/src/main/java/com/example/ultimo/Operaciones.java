package com.example.ultimo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Operaciones extends AppCompatActivity {

    TextView proceso, resultado;
    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, resta, suma, multiplicacion, division, punto, porcentaje, borrar, parend, masmenos, igual, borraruno, pareni, cuadrado, raiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        proceso=findViewById(R.id.txtProceso);
        resultado=findViewById(R.id.txtResultado);
        suma=findViewById(R.id.btnSuma);
        resta=findViewById(R.id.btnRestar);
        multiplicacion=findViewById(R.id.btnMultiplicar);
        division=findViewById(R.id.btnDivision);
        punto=findViewById(R.id.btnPunto);
        porcentaje=findViewById(R.id.btnPorcentaje);
        parend=findViewById(R.id.btnParenD);
        pareni=findViewById(R.id.btnParenI);
        cero=findViewById(R.id.btnCero);
        uno=findViewById(R.id.btnUno);
        dos=findViewById(R.id.btnDos);
        tres=findViewById(R.id.btnTres);
        cuatro=findViewById(R.id.btnCuatro);
        cinco=findViewById(R.id.btnCinco);
        seis=findViewById(R.id.btnSeis);
        siete=findViewById(R.id.btnSiete);
        ocho=findViewById(R.id.btnOcho);
        nueve=findViewById(R.id.btnNueve);
        borrar=findViewById(R.id.btnBorrar);
        masmenos=findViewById(R.id.btnMasMenos);
        igual=findViewById(R.id.igual);
        borraruno=findViewById(R.id.btnBorrarUno);
        cuadrado=findViewById(R.id.btnCuadrado);
        raiz=findViewById(R.id.btnRaiz);


        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"0");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"9");
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"+");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"-");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"x");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"/");
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+".");
            }
        });
        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"%");
            }
        });

        pareni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"(");
            }
        });

        parend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+")");
            }
        });

        masmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText("-"+procesof);
            }
        });

        cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double procesof = Double.parseDouble(proceso.getText().toString());
                Double respuesta = Math.pow(procesof,2);
                String respuesta2 = String.valueOf(respuesta);
                proceso.setText(respuesta2);
            }
        });

        raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double procesof = Double.parseDouble(proceso.getText().toString());
                Double respuesta = Math.sqrt(procesof);
                String respuesta2 = String.valueOf(respuesta);
                proceso.setText(respuesta2);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso.setText("");
                resultado.setText("");
            }
        });

        borraruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String delete = proceso.getText().toString();
                if (delete.length()>=1){
                    delete=delete.substring(0,delete.length()-1);
                    proceso.setText(delete);
                }
                else if (delete.length()<1){
                    proceso.setText("");
                }
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                procesof = procesof.replaceAll("x","*");
                procesof = procesof.replaceAll("%","/100");
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("js");
                try {
                    resultado.setText(engine.eval(procesof).toString());
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}