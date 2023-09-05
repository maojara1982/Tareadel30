package com.exampleMauriciojaramillo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText base, altura;
    TextView resultado;
    Button calculo;

    float result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base = findViewById(R.id.sideOne);
        altura = findViewById(R.id.sideDos);
        resultado = findViewById(R.id.resultado);
        calculo = findViewById(R.id.calcular);

        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valueUno = Float.parseFloat(base.getText().toString());
                float valueDos = Float.parseFloat(base.getText().toString());
                result =  ((valueUno*valueDos)/2);
                resultado.setText("El resultado es: "+String.valueOf(result));
            }
        });

    }
}