package com.example.grapewavemobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroExitoso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_exitoso);

        // Obtiene el ID de usuario pasado como extra
        long userId = getIntent().getLongExtra("userId", -1);

        // Muestra el ID de usuario en el EditText con id "codigoUser"
        TextView codigoUser = findViewById(R.id.codigoUser);
        codigoUser.setText(String.valueOf(userId));
    }
}
