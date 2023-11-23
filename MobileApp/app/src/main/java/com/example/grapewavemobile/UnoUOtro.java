package com.example.grapewavemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UnoUOtro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno_uotro);

        ImageButton myImageButton = findViewById(R.id.myImageButton);
        ImageButton myImageButton2 = findViewById(R.id.myImageButton2);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnoUOtro.this, RegistroDeUsuario.class);
                startActivity(intent);
            }
        });

        myImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnoUOtro.this, RegistroDelEmpleado.class);
                startActivity(intent);
            }
        });
    }
}
