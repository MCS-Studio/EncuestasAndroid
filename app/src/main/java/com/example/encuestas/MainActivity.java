package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void encuestas(View view){
        Intent intent = new Intent(this,Encuestas.class);
        startActivity(intent);
    }

    public void resultados(View view){
        Intent intent = new Intent(this, Resultados.class);
        startActivity(intent);
    }
}