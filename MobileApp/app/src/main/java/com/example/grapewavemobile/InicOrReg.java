package com.example.grapewavemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InicOrReg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inic_or_reg);

        ImageButton myImageButton = findViewById(R.id.myImageButton);
        ImageButton myImageButton2 = findViewById(R.id.myImageButton2);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicOrReg.this, SeleccionPerfil.class);
                startActivity(intent);
            }
        });

        myImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(InicOrReg.this,UnoUOtro.class);
                startActivity(intent2);
            }
        });

    }
}