package com.example.tarea_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultOperation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_operaciones);

        TextView text = (TextView)findViewById(R.id.txtResultado);
        Intent intent = getIntent();
        String num1=intent.getStringExtra("num1");
        String num2=intent.getStringExtra("num2");
        String resultado = intent.getStringExtra("resultado");
        String signo=intent.getStringExtra("signo");

        text.setText(num1 + " " + signo + " " + num2 + " = " + resultado);




    }

}