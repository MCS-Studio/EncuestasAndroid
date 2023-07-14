package com.example.encuestas;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;


public class Encuestas extends AppCompatActivity {
    private RadioButton op11, op12, op13, op14, op21, op22, op23, op24, op31, op32, op33, op34, op41, op42, op43, op44, op51, op52, op53;
    private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuestas);
        op11 = findViewById(R.id.op1_1);
        op12 = findViewById(R.id.op1_2);
        op13 = findViewById(R.id.op1_3);
        op14 = findViewById(R.id.op1_4);
        op21 = findViewById(R.id.op2_1);
        op22 = findViewById(R.id.op2_2);
        op23 = findViewById(R.id.op2_3);
        op24 = findViewById(R.id.op2_4);
        op31 = findViewById(R.id.op3_1);
        op32 = findViewById(R.id.op3_2);
        op33 = findViewById(R.id.op3_3);
        op34 = findViewById(R.id.op3_4);
        op41 = findViewById(R.id.op4_1);
        op42 = findViewById(R.id.op4_2);
        op43 = findViewById(R.id.op4_3);
        op44 = findViewById(R.id.op4_4);
        op51 = findViewById(R.id.op5_1);
        op52 = findViewById(R.id.op5_2);
        op53 = findViewById(R.id.op5_3);
        radioGroup1 = findViewById(R.id.r1);
        radioGroup2 = findViewById(R.id.r2);
        radioGroup3 = findViewById(R.id.r3);
        radioGroup4 = findViewById(R.id.r4);
        radioGroup5 = findViewById(R.id.r5);

        // Obtén una instancia de la base de datos

    }

    public void prueba(View view) {
        boolean isAnyOptionSelected = false;

        if (radioGroup1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en el grupo 1", Toast.LENGTH_SHORT).show();
        } else if (radioGroup2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en el grupo 2", Toast.LENGTH_SHORT).show();
        } else if (radioGroup3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en el grupo 3", Toast.LENGTH_SHORT).show();
        } else if (radioGroup4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en el grupo 4", Toast.LENGTH_SHORT).show();
        } else if (radioGroup5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en el grupo 5", Toast.LENGTH_SHORT).show();
        } else {
            // Se seleccionó al menos un RadioButton en cada grupo
            isAnyOptionSelected = true;
        }

        if (isAnyOptionSelected) {
            AdminSQLiteHelper admin = new AdminSQLiteHelper(this, "articulos", null, 1);
            SQLiteDatabase db = admin.getWritableDatabase();

            int radioButtonId1 = radioGroup1.getCheckedRadioButtonId();
            int radioButtonId2 = radioGroup2.getCheckedRadioButtonId();
            int radioButtonId3 = radioGroup3.getCheckedRadioButtonId();
            int radioButtonId4 = radioGroup4.getCheckedRadioButtonId();
            int radioButtonId5 = radioGroup5.getCheckedRadioButtonId();

            if (radioButtonId1 != -1) {
                // Se seleccionó un RadioButton en el grupo 1
                if (radioButtonId1 == R.id.op1_1) {
                    // Opción 1 seleccionada en el grupo 1
                    ContentValues values = new ContentValues();
                    values.put("RespuestaA", "RespuestaA + 1");
                    db.update("articulos", values, "codigo = ?", new String[]{"1"});
                } else if (radioButtonId1 == R.id.op1_2) {
                    // Opción 2 seleccionada en el grupo 1
                    updateTable(1, "RespuestaB", +1);
                } else if (radioButtonId1 == R.id.op1_3) {
                    // Opción 3 seleccionada en el grupo 1
                    updateTable(1, "RespuestaC", +1);
                } else if (radioButtonId1 == R.id.op1_4) {
                    // Opción 4 seleccionada en el grupo 1
                    updateTable(1, "RespuestaD", +1);
                }
            }

            // Repite el mismo proceso para los otros grupos de opciones
            // Actualiza las columnas y filas correspondientes según las opciones seleccionadas
            finish();
        }
    }

    private void updateTable(int codigo, String columna, int valor) {
        ContentValues values = new ContentValues();
        values.put(columna, valor);
        db.update("articulos", values, "codigo = ?", new String[]{String.valueOf(codigo)});
    }

    // ...
}
