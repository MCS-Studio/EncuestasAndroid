package com.example.encuestas;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
public class AdminSQLiteHelper extends SQLiteOpenHelper {
    public AdminSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table articulos(codigo int primary key, RespuestaA int, RespuestaB int,RespuestaC int,RespuestaD int)");
        ContentValues valores1 = new ContentValues();
        ContentValues valores2 = new ContentValues();
        ContentValues valores3 = new ContentValues();
        ContentValues valores4 = new ContentValues();
        ContentValues valores5 = new ContentValues();


        valores1.put("codigo", 1);
        valores1.put("RespuestaA", 0);
        valores1.put("RespuestaB", 0);
        valores1.put("RespuestaC", 0);
        valores1.put("RespuestaD", 0);
        db.insert("articulos", null, valores1);

        valores2.put("codigo", 2);
        valores2.put("RespuestaA", 0);
        valores2.put("RespuestaB", 0);
        valores2.put("RespuestaC", 0);
        valores2.put("RespuestaD", 0);
        db.insert("articulos", null, valores2);

        valores3.put("codigo", 3);
        valores3.put("RespuestaA", 0);
        valores3.put("RespuestaB", 0);
        valores3.put("RespuestaC", 0);
        valores3.put("RespuestaD", 0);
        db.insert("articulos", null, valores3);

        valores4.put("codigo", 4);
        valores4.put("RespuestaA", 0);
        valores4.put("RespuestaB", 0);
        valores4.put("RespuestaC", 0);
        valores4.put("RespuestaD", 0);
        db.insert("articulos", null, valores4);

        valores5.put("codigo", 5);
        valores5.put("RespuestaA", 0);
        valores5.put("RespuestaB", 0);
        valores5.put("RespuestaC", 0);
        valores5.put("RespuestaD", 0);
        db.insert("articulos", null, valores5);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

