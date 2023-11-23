package com.example.grapewavemobile;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroExitoso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_exitoso);

        // Obtiene el Id_Usuario de los extras
        long idUsuario = getIntent().getLongExtra("Id_Usuario", -1);

        // Muestra el Id_Usuario en el TextView correspondiente
        TextView codigoUser = findViewById(R.id.codigoUser);
        codigoUser.setText(String.valueOf(idUsuario));
    }
}
