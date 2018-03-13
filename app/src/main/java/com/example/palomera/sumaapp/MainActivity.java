package com.example.palomera.sumaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    Button suma;
    Button resta;
    Button mult;
    Button div;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.editText);
        numero2 = (EditText) findViewById((R.id.editText2));
        suma = (Button) findViewById(R.id.button);
        resta = (Button) findViewById(R.id.button2);
        mult = (Button) findViewById(R.id.button3);
        div = (Button) findViewById(R.id.button4);
        res= (TextView)findViewById(R.id.textView2);
    }

    public void suma(View v)
    {
        float num1=  Float.parseFloat(numero1.getText().toString());
        float num2= Float.parseFloat(numero2.getText().toString());

        float resultado = num1+ num2;

        res.setText(Float.toString(resultado));

    }

    public void resta (View v)
    {

        float num1 = Float.parseFloat(numero1.getText().toString());
        float num2 = Float.parseFloat(numero2.getText().toString());

        float resultado = num1-num2;

        res.setText(Float.toString(resultado));




    }

    public void mul (View v)
    {

        float num1 = Float.parseFloat(numero1.getText().toString());
        float num2 = Float.parseFloat(numero2.getText().toString());

        float resultado = num1*num2;

        res.setText(Float.toString(resultado));




    }
    public void div (View v)
    {

        float num1 = Float.parseFloat(numero1.getText().toString());
        float num2 = Float.parseFloat(numero2.getText().toString());

        float resultado = num1/num2;

        res.setText(Float.toString(resultado));




    }


}
