package com.example.grapewavemobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.grapewavemobile.db.Usuarios;

public class RegistroDeUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_usuario);

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
                String contraseña = Passw.getText().toString();
                String confirmarContraseña = CPassw.getText().toString();

                // Verifica que las contraseñas coincidan
                if (!contraseña.equals(confirmarContraseña)) {
                    Toast.makeText(RegistroDeUsuario.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Crea una instancia de la clase Usuarios
                Usuarios usuarios = new Usuarios(RegistroDeUsuario.this);

                // Llama al método AltaUsuario y obtén el resultado
                long resultado = usuarios.AltaUsuario(nombre, apPaterno, apMaterno, telefono,
                        calle, numDomicilio, colonia, municipio,
                        email, contraseña, confirmarContraseña);

                // Verifica el resultado de la inserción
                if (resultado != -1) {
                    // Registro exitoso, abre la actividad RegistroExitoso
                    Intent intent = new Intent(RegistroDeUsuario.this, RegistroExitoso.class);
                    intent.putExtra("Id_Usuario", resultado); // Pasa el Id_Usuario como un extra
                    startActivity(intent);
                } else {
                    Toast.makeText(RegistroDeUsuario.this, "Error al registrar el usuario", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
