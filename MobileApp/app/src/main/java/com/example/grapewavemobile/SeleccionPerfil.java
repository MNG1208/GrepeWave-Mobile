package com.example.grapewavemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SeleccionPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton IMGbtn = findViewById(R.id.myImageButton);
        ImageButton IMGbtn2=findViewById(R.id.myImageButton2);

        IMGbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeleccionPerfil.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        IMGbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeleccionPerfil.this, MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}