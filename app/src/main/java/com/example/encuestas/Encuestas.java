package com.example.encuestas;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menubar, menu);
        return true;

        //Genera el menubar de la aplicacion
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Back) {
            //Toast.makeText(this, "Regresando a inicio", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

        //Detecta cuando es precionado el objeto Back y regresa al menu principal de la aplicacion
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuestas);
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
            Toast.makeText(this, "Por favor, selecciona una opción en la pregunta 1", Toast.LENGTH_SHORT).show();
        } else if (radioGroup2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en la pregunta 2", Toast.LENGTH_SHORT).show();
        } else if (radioGroup3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en la pregunta 3", Toast.LENGTH_SHORT).show();
        } else if (radioGroup4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en la pregunta 4", Toast.LENGTH_SHORT).show();
        } else if (radioGroup5.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona una opción en la pregunta 5", Toast.LENGTH_SHORT).show();
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
                if (radioButtonId1 == R.id.op1_1) {
                    // PREGUNTA 1 RESPUESTA A
                    String updateQuery = "UPDATE articulos SET RespuestaA = RespuestaA + 1 WHERE codigo = 1";
                    db.execSQL(updateQuery);
                } else if (radioButtonId1 == R.id.op1_2) {
                    // PREGUNTA 1 RESPUESTA B
                    String updateQuery = "UPDATE articulos SET RespuestaB = RespuestaB + 1 WHERE codigo = 1";
                    db.execSQL(updateQuery);
                } else if (radioButtonId1 == R.id.op1_3) {
                    // PREGUNTA 1 RESPUESTA C
                    String updateQuery = "UPDATE articulos SET RespuestaC = RespuestaC + 1 WHERE codigo = 1";
                    db.execSQL(updateQuery);
                } else if (radioButtonId1 == R.id.op1_4) {
                    // PREGUNTA 1 RESPUESTA D
                    String updateQuery = "UPDATE articulos SET RespuestaD = RespuestaD + 1 WHERE codigo = 1";
                    db.execSQL(updateQuery);
                }
            }
            if (radioButtonId2 != -1) {
                if (radioButtonId2 == R.id.op2_1) {
                    // PREGUNTA 1 RESPUESTA A
                    String updateQuery = "UPDATE articulos SET RespuestaA = RespuestaA + 1 WHERE codigo = 2";
                    db.execSQL(updateQuery);
                } else if (radioButtonId2 == R.id.op2_2) {
                    // PREGUNTA 1 RESPUESTA B
                    String updateQuery = "UPDATE articulos SET RespuestaB = RespuestaB + 1 WHERE codigo = 2";
                    db.execSQL(updateQuery);
                } else if (radioButtonId2 == R.id.op2_3) {
                    // PREGUNTA 1 RESPUESTA C
                    String updateQuery = "UPDATE articulos SET RespuestaC = RespuestaC + 1 WHERE codigo = 2";
                    db.execSQL(updateQuery);
                } else if (radioButtonId2 == R.id.op2_4) {
                    // PREGUNTA 1 RESPUESTA D
                    String updateQuery = "UPDATE articulos SET RespuestaD = RespuestaD + 1 WHERE codigo = 2";
                    db.execSQL(updateQuery);
                }
            }
            if (radioButtonId3 != -1) {
                if (radioButtonId3 == R.id.op3_1) {
                    // PREGUNTA 1 RESPUESTA A
                    String updateQuery = "UPDATE articulos SET RespuestaA = RespuestaA + 1 WHERE codigo = 3";
                    db.execSQL(updateQuery);
                } else if (radioButtonId3 == R.id.op3_2) {
                    // PREGUNTA 1 RESPUESTA B
                    String updateQuery = "UPDATE articulos SET RespuestaB = RespuestaB + 1 WHERE codigo = 3";
                    db.execSQL(updateQuery);
                } else if (radioButtonId3 == R.id.op3_3) {
                    // PREGUNTA 1 RESPUESTA C
                    String updateQuery = "UPDATE articulos SET RespuestaC = RespuestaC + 1 WHERE codigo = 3";
                    db.execSQL(updateQuery);
                } else if (radioButtonId3 == R.id.op3_4) {
                    // PREGUNTA 1 RESPUESTA D
                    String updateQuery = "UPDATE articulos SET RespuestaD = RespuestaD + 1 WHERE codigo = 3";
                    db.execSQL(updateQuery);
                }
            }
            if (radioButtonId4 != -1) {
                if (radioButtonId4 == R.id.op4_1) {
                    // PREGUNTA 1 RESPUESTA A
                    String updateQuery = "UPDATE articulos SET RespuestaA = RespuestaA + 1 WHERE codigo = 4";
                    db.execSQL(updateQuery);
                } else if (radioButtonId4 == R.id.op4_2) {
                    // PREGUNTA 1 RESPUESTA B
                    String updateQuery = "UPDATE articulos SET RespuestaB = RespuestaB + 1 WHERE codigo = 4";
                    db.execSQL(updateQuery);
                } else if (radioButtonId4 == R.id.op4_3) {
                    // PREGUNTA 1 RESPUESTA C
                    String updateQuery = "UPDATE articulos SET RespuestaC = RespuestaC + 1 WHERE codigo = 4";
                    db.execSQL(updateQuery);
                } else if (radioButtonId4 == R.id.op4_4) {
                    // PREGUNTA 1 RESPUESTA D
                    String updateQuery = "UPDATE articulos SET RespuestaD = RespuestaD + 1 WHERE codigo = 4";
                    db.execSQL(updateQuery);
                }
            }
            if (radioButtonId5 != -1) {
                if (radioButtonId5 == R.id.op5_1) {
                    // PREGUNTA 1 RESPUESTA A
                    String updateQuery = "UPDATE articulos SET RespuestaA = RespuestaA + 1 WHERE codigo = 5";
                    db.execSQL(updateQuery);
                } else if (radioButtonId5 == R.id.op5_2) {
                    // PREGUNTA 1 RESPUESTA B
                    String updateQuery = "UPDATE articulos SET RespuestaB = RespuestaB + 1 WHERE codigo = 5";
                    db.execSQL(updateQuery);
                } else if (radioButtonId5 == R.id.op5_3) {
                    // PREGUNTA 1 RESPUESTA C
                    String updateQuery = "UPDATE articulos SET RespuestaC = RespuestaC + 1 WHERE codigo = 5";
                    db.execSQL(updateQuery);
                }
            }
            radioGroup1.clearCheck();
            radioGroup2.clearCheck();
            radioGroup3.clearCheck();
            radioGroup4.clearCheck();
            radioGroup5.clearCheck();
            Toast.makeText(this, "Respuestas registradas", Toast.LENGTH_SHORT).show();


            // Repite el mismo proceso para los otros grupos de opciones
            // Actualiza las columnas y filas correspondientes según las opciones seleccionadas
        }
    }
}
