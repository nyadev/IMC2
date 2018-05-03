package com.example.axelcuevas.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton goMenu;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goMenu = findViewById(R.id.goMenu);
        registerButton = findViewById(R.id.registerButton);
    }

    public void doChange (View view) {
        Intent menu = new Intent(MainActivity.this, Menu.class);
        startActivity(menu);
    }

    public void doRegister (View view) {
        Intent register = new Intent (MainActivity.this, registro.class);
        startActivity(register);
    }
}
