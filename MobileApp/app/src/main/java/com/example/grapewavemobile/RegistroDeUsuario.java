package com.example.grapewavemobile;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroDeUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_usuario);

        Base User = new Base(this, "Grape_Wave", null, 1);
        SQLiteDatabase basedatos = User.getWritableDatabase();

        EditText Nombre = findViewById(R.id.editTextNombre);
        EditText APaterno = findViewById(R.id.editTextApPaterno);
        EditText AMaterno = findViewById(R.id.editTextApMaterno);
        EditText Telefono = findViewById(R.id.editTextTelefono);
        EditText Calle = findViewById(R.id.editTextCalle);
        EditText NumDomicilio = findViewById(R.id.editTextNumDomicilio);
        EditText Colonia = findViewById(R.id.editTextColonia);
        EditText Municipio = findViewById(R.id.editTextMunicipio);
        EditText Email = findViewById(R.id.editTextCorreoElectronico);
        EditText Passw = findViewById(R.id.editTextContrasena);
        EditText CPassw = findViewById(R.id.editTextConfirmarContrasena);
        Button btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén los valores de los campos

                String nombre = Nombre.getText().toString();
                String apPaterno = APaterno.getText().toString();
                String apMaterno = AMaterno.getText().toString();
                long telefono = Long.parseLong(Telefono.getText().toString());
                String calle = Calle.getText().toString();
                int numDomicilio = Integer.parseInt(NumDomicilio.getText().toString());
                String colonia = Colonia.getText().toString();
                String municipio = Municipio.getText().toString();
                String email = Email.getText().toString();
                String password = Passw.getText().toString();
                String repassword = CPassw.getText().toString();

                // Verifica que las contraseñas coincidan
                if (!password.equals(repassword)) {
                    Toast.makeText(RegistroDeUsuario.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    return;
                }

                ContentValues user= new ContentValues();
                user.put("Nombre", nombre);
                user.put("Ap_Paterno", apPaterno);
                user.put("Ap_Materno", apMaterno);
                user.put("Telefono", telefono);
                user.put("Calle", calle);
                user.put("Num_Domicilio", numDomicilio);
                user.put("Colonia", colonia);
                user.put("Municipio", municipio);
                user.put("Correo_Electronico", email);
                user.put("Contraseña", password);
                user.put("Confirmar_Contraseña", repassword);

                long userId = basedatos.insert("Usuarios", null, user);


                basedatos.insert("Usuarios", null,user);
                basedatos.close();
                Toast.makeText(RegistroDeUsuario.this, "Dado de alta", Toast.LENGTH_LONG).show();


                Intent intent = new Intent(RegistroDeUsuario.this, RegistroExitoso.class);
                intent.putExtra("userId", userId);
                startActivity(intent);
            }
        });
    }
}
