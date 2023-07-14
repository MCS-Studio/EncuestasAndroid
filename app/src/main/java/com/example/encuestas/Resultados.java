package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    private TextView ra1,rb1,rc1,rd1,ra2,rb2,rc2,rd2,ra3, rb3, rc3, rd3,ra4, rb4, rc4, rd4,ra5, rb5, rc5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        ra1 = findViewById(R.id.RA1);
        rb1 = findViewById(R.id.RB1);
        rc1 = findViewById(R.id.RC1);
        rd1 = findViewById(R.id.RD1);
        ra1 = findViewById(R.id.RA1);
        rb1 = findViewById(R.id.RB1);
        rc1 = findViewById(R.id.RC1);
        rd1 = findViewById(R.id.RD1);
        ra2 = findViewById(R.id.RA2);
        rb2 = findViewById(R.id.RB2);
        rc2 = findViewById(R.id.RC2);
        rd2 = findViewById(R.id.RD2);
        ra3 = findViewById(R.id.RA3);
        rb3 = findViewById(R.id.RB3);
        rc3 = findViewById(R.id.RC3);
        rd3 = findViewById(R.id.RD3);
        ra4 = findViewById(R.id.RA4);
        rb4 = findViewById(R.id.RB4);
        rc4 = findViewById(R.id.RC4);
        rd4 = findViewById(R.id.RD4);
        ra5 = findViewById(R.id.RA5);
        rb5 = findViewById(R.id.RB5);
        rc5 = findViewById(R.id.RC5);
        AdminSQLiteHelper admin = new AdminSQLiteHelper(this, "articulos", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT RespuestaA FROM articulos WHERE codigo=1", null);
        if (cursor.moveToFirst()) {
            int respuestaAColumnIndex = cursor.getColumnIndex("RespuestaA");
            if (respuestaAColumnIndex != -1) {
                int respuestaA = cursor.getInt(respuestaAColumnIndex);
                ra1.setText(String.valueOf(respuestaA));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaB FROM articulos WHERE codigo=1", null);
        if (cursor.moveToFirst()) {
            int respuestaBColumnIndex = cursor.getColumnIndex("RespuestaB");
            if (respuestaBColumnIndex != -1) {
                int respuestaB = cursor.getInt(respuestaBColumnIndex);
                rb1.setText(String.valueOf(respuestaB));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaC FROM articulos WHERE codigo=1", null);
        if (cursor.moveToFirst()) {
            int respuestaCColumnIndex = cursor.getColumnIndex("RespuestaC");
            if (respuestaCColumnIndex != -1) {
                int respuestaC = cursor.getInt(respuestaCColumnIndex);
                rc1.setText(String.valueOf(respuestaC));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaD FROM articulos WHERE codigo=1", null);
        if (cursor.moveToFirst()) {
            int respuestaDColumnIndex = cursor.getColumnIndex("RespuestaD");
            if (respuestaDColumnIndex != -1) {
                int respuestaD = cursor.getInt(respuestaDColumnIndex);
                rd1.setText(String.valueOf(respuestaD));
            }
        }
        cursor.close();
        //PREGUNTA 2
        cursor = db.rawQuery("SELECT RespuestaA FROM articulos WHERE codigo=2", null);
        if (cursor.moveToFirst()) {
            int respuestaAColumnIndex = cursor.getColumnIndex("RespuestaA");
            if (respuestaAColumnIndex != -1) {
                int respuestaA = cursor.getInt(respuestaAColumnIndex);
                ra2.setText(String.valueOf(respuestaA));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaB FROM articulos WHERE codigo=2", null);
        if (cursor.moveToFirst()) {
            int respuestaBColumnIndex = cursor.getColumnIndex("RespuestaB");
            if (respuestaBColumnIndex != -1) {
                int respuestaB = cursor.getInt(respuestaBColumnIndex);
                rb2.setText(String.valueOf(respuestaB));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaC FROM articulos WHERE codigo=2", null);
        if (cursor.moveToFirst()) {
            int respuestaCColumnIndex = cursor.getColumnIndex("RespuestaC");
            if (respuestaCColumnIndex != -1) {
                int respuestaC = cursor.getInt(respuestaCColumnIndex);
                rc2.setText(String.valueOf(respuestaC));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaD FROM articulos WHERE codigo=2", null);
        if (cursor.moveToFirst()) {
            int respuestaDColumnIndex = cursor.getColumnIndex("RespuestaD");
            if (respuestaDColumnIndex != -1) {
                int respuestaD = cursor.getInt(respuestaDColumnIndex);
                rd2.setText(String.valueOf(respuestaD));
            }
        }
        cursor.close();
        ///PREGUNTA 3
        cursor = db.rawQuery("SELECT RespuestaA FROM articulos WHERE codigo=3", null);
        if (cursor.moveToFirst()) {
            int respuestaAColumnIndex = cursor.getColumnIndex("RespuestaA");
            if (respuestaAColumnIndex!= -1) {
                int respuestaA = cursor.getInt(respuestaAColumnIndex);
                ra3.setText(String.valueOf(respuestaA));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaB FROM articulos WHERE codigo=3", null);
        if (cursor.moveToFirst()) {
            int respuestaBColumnIndex = cursor.getColumnIndex("RespuestaB");
            if (respuestaBColumnIndex!= -1) {
                int respuestaB = cursor.getInt(respuestaBColumnIndex);
                rb3.setText(String.valueOf(respuestaB));
            }
        }
        cursor.close();
        cursor = db.rawQuery("SELECT RespuestaC FROM articulos WHERE codigo=3", null);
        if (cursor.moveToFirst()) {
            int respuestaCColumnIndex = cursor.getColumnIndex("RespuestaC");
            if (respuestaCColumnIndex!= -1) {
                int respuestaC = cursor.getInt(respuestaCColumnIndex);
                rc3.setText(String.valueOf(respuestaC));
            }
        }
        cursor.close();
        cursor = db.rawQuery("SELECT RespuestaD FROM articulos WHERE codigo=3", null);
        if (cursor.moveToFirst()) {
            int respuestaDColumnIndex = cursor.getColumnIndex("RespuestaD");
            if (respuestaDColumnIndex!= -1) {
                int respuestaD = cursor.getInt(respuestaDColumnIndex);
                rd3.setText(String.valueOf(respuestaD));
            }
        }
        cursor.close();
        ///PREGUNTA 4
        cursor = db.rawQuery("SELECT RespuestaA FROM articulos WHERE codigo=4", null);
        if (cursor.moveToFirst()) {
            int respuestaAColumnIndex = cursor.getColumnIndex("RespuestaA");
            if (respuestaAColumnIndex!= -1) {
                int respuestaA = cursor.getInt(respuestaAColumnIndex);
                ra4.setText(String.valueOf(respuestaA));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaB FROM articulos WHERE codigo=4", null);
        if (cursor.moveToFirst()) {
            int respuestaBColumnIndex = cursor.getColumnIndex("RespuestaB");
            if (respuestaBColumnIndex!= -1) {
                int respuestaB = cursor.getInt(respuestaBColumnIndex);
                rb4.setText(String.valueOf(respuestaB));
            }
        }
        cursor.close();
        cursor = db.rawQuery("SELECT RespuestaC FROM articulos WHERE codigo=4", null);
        if (cursor.moveToFirst()) {
            int respuestaCColumnIndex = cursor.getColumnIndex("RespuestaC");
            if (respuestaCColumnIndex!= -1) {
                int respuestaC = cursor.getInt(respuestaCColumnIndex);
                rc4.setText(String.valueOf(respuestaC));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaD FROM articulos WHERE codigo=4", null);
        if (cursor.moveToFirst()) {
            int respuestaDColumnIndex = cursor.getColumnIndex("RespuestaD");
            if (respuestaDColumnIndex!= -1) {
                int respuestaD = cursor.getInt(respuestaDColumnIndex);
                rd4.setText(String.valueOf(respuestaD));
            }
        }
        cursor.close();
        ///PREGUNTA 5
        cursor = db.rawQuery("SELECT RespuestaA FROM articulos WHERE codigo=5", null);
        if (cursor.moveToFirst()) {
            int respuestaAColumnIndex = cursor.getColumnIndex("RespuestaA");
            if (respuestaAColumnIndex!= -1) {
                int respuestaA = cursor.getInt(respuestaAColumnIndex);
                ra5.setText(String.valueOf(respuestaA));
            }
        }
        cursor.close();

        cursor = db.rawQuery("SELECT RespuestaB FROM articulos WHERE codigo=5", null);
        if (cursor.moveToFirst()) {
            int respuestaBColumnIndex = cursor.getColumnIndex("RespuestaB");
            if (respuestaBColumnIndex!= -1) {
                int respuestaB = cursor.getInt(respuestaBColumnIndex);
                rb5.setText(String.valueOf(respuestaB));
            }
        }
        cursor.close();
        cursor = db.rawQuery("SELECT RespuestaC FROM articulos WHERE codigo=5", null);
        if (cursor.moveToFirst()) {
            int respuestaCColumnIndex = cursor.getColumnIndex("RespuestaC");
            if (respuestaCColumnIndex!= -1) {
                int respuestaC = cursor.getInt(respuestaCColumnIndex);
                rc5.setText(String.valueOf(respuestaC));
            }
        }
        cursor.close();

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