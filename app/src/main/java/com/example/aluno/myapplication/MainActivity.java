package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alteraText(View view)
    {
        Random gerador = new Random();
        String aux="numero escolhido: "+gerador.nextInt(11);
        TextView texto= findViewById(R.id.text);
        texto.setText(aux);
    }
}
