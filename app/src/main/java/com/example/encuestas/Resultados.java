package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
    }

    public void encuestas(View view){
        Intent intent = new Intent(this,Encuestas.class);
        startActivity(intent);
    }

    public void inicio(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}