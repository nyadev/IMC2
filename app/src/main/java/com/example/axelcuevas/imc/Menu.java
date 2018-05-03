package com.example.axelcuevas.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button consulta, consultas, modificar, foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        consulta = findViewById(R.id.btn3);
        consultas = findViewById(R.id.btn4);
        modificar = findViewById(R.id.btn2);
        foto = findViewById(R.id.btn5);
    }
}
