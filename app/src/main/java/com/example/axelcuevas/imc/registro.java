package com.example.axelcuevas.imc;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class registro extends AppCompatActivity {

    private Button register;
    private EditText email, nombre, edad, estatura, peso;
    private RadioGroup type;
    private RadioButton kind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        register = findViewById(R.id.registerButton);

        email = findViewById(R.id.email);
        nombre = findViewById(R.id.name);
        edad = findViewById(R.id.age);
        estatura = findViewById(R.id.height);
        peso = findViewById(R.id.weight);
        type = findViewById(R.id.type);
    }

    public void registrar (View v) {
        BDatos objBD = new BDatos(this, "IMC", null, 1);
        SQLiteDatabase bd = objBD.getWritableDatabase();

        int radioSelected = type.getCheckedRadioButtonId();
        String emai, name, age, type;
        float height, weight;
        emai = email.getText().toString();
        name = nombre.getText().toString();
        age = edad.getText().toString();
        height = Float.parseFloat(estatura.getText().toString());
        weight = Float.parseFloat(peso.getText().toString());

        if (!emai.isEmpty() && !name.isEmpty() && !age.isEmpty() && (radioSelected != -1) && (height != -1) && (weight != -1)){
            kind = findViewById(radioSelected);
            String tipo = kind.getText().toString();
            ContentValues registro = new ContentValues();
            registro.put("email", emai);
            registro.put("name", name);
            registro.put("age", age);
            registro.put("height", height);
            registro.put("weight", weight);
            registro.put("type", tipo);
            bd.insert("users", null, registro);
            bd.close();
            email.setText("");
            nombre.setText("");
            edad.setText("");
            estatura.setText("");
            peso.setText("");
            Toast.makeText(this, "Registrado!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Debes llenar todos los campos!", Toast.LENGTH_SHORT).show();
        }

    }
}
