package com.example.grapewavemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Modulo2Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo2_register);

        Button btncontinuar = findViewById(R.id.btnContinuar);
        btncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Modulo2Register.this, Modulo3Register.class);
                startActivity(intent);
            }
        });

    }
}