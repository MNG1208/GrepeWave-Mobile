package com.example.grapewavemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroDeUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_usuario);

        Button btncontinuar = findViewById(R.id.btnContinuar);
        btncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistroDeUsuario.this, Modulo2Register.class);
                startActivity(intent);
            }
        });


    }
}