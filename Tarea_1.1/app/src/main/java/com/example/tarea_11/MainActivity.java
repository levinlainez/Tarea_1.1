package com.example.tarea_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtNumero1, txtNumero2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = (EditText) findViewById(R.id.txtNum1);
        txtNumero2 = (EditText) findViewById(R.id.txtNum2);

        Button btnSuma = (Button) findViewById(R.id.btnSuma);
        Button btnRestar = (Button) findViewById(R.id.btnRestar);
        Button btnMultiplicar = (Button) findViewById(R.id.btnMultplicar);
        Button btnDivir = (Button) findViewById(R.id.btnDividir);

        Intent intent= new Intent(getApplicationContext(), ResultOperation.class);



        /*Evento bton btnSuma*/
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                    Double numero2 = Double.parseDouble(txtNumero2.getText().toString());

                    Double calcular=numero1+numero2;

                    intent.putExtra("num1",numero1+"");
                    intent.putExtra("num2", numero2+"");
                    intent.putExtra( "signo", "+");

                    intent.putExtra("resultado", calcular+"");


                    startActivity(intent);
                    txtNumero2.setText(null);
                    txtNumero1.setText(null);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error, Campos Obligatorios", Toast.LENGTH_LONG);
                }

            }
        });

        /*Evento restar*/
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                    Double numero2 = Double.parseDouble(txtNumero2.getText().toString());

                    Double calcular=numero1-numero2;

                    intent.putExtra("num1",numero1+"");
                    intent.putExtra("num2", numero2+"");
                    intent.putExtra( "signo", "-");
                    intent.putExtra("resultado", calcular+"");


                    startActivity(intent);
                    txtNumero2.setText(null);
                    txtNumero1.setText(null);

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error, Campos Obligatorios", Toast.LENGTH_LONG);
                }

            }
        });

        /*Evento Multiplicar*/
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                    Double numero2 = Double.parseDouble(txtNumero2.getText().toString());

                    Double calcular=numero1*numero2;

                    intent.putExtra("num1",numero1+"");
                    intent.putExtra("num2", numero2+"");
                    intent.putExtra( "signo", "*");
                    intent.putExtra("resultado", calcular+"");


                    startActivity(intent);
                    txtNumero2.setText(null);
                    txtNumero1.setText(null);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error, Campos Obligatorios", Toast.LENGTH_LONG);
                }

            }
        });

        /*Evento Division*/
        btnDivir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Double numero1 = Double.parseDouble(txtNumero1.getText().toString());
                    Double numero2 = Double.parseDouble(txtNumero2.getText().toString());

                    Double calcular=numero1/numero2;

                    intent.putExtra("num1",numero1+"");
                    intent.putExtra("num2", numero2+"");
                    intent.putExtra( "signo", "/");
                    intent.putExtra("resultado", calcular+"");


                    startActivity(intent);
                    txtNumero2.setText(null);
                    txtNumero1.setText(null);

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error, Campos Obligatorios", Toast.LENGTH_LONG);
                }

            }
        });


    }



}