package com.example.nerio.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView)(findViewById(R.id.txt_resultado));
    }

    //Este método realiza la suma
    public void Sumar(View vista) {
        String Valor1 = et1.getText().toString();
        String Valor2 =  et2.getText().toString();

        int num1 = Integer.parseInt(Valor1);
        int num2 = Integer.parseInt(Valor2);

        int suma = num1 + num2;
        String resultado = String.valueOf(suma);
        tv1.setText(resultado);
    }

}
