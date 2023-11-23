package com.example.grapewavemobile.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class Usuarios extends DbHelper{

    Context context;
    public Usuarios(@Nullable Context context) {
        super(context);
        this.context=context;
    }

    public long AltaUsuario(String nombre, String apPaterno, String apMaterno, long telefono,
                            String calle, int numDomicilio, String colonia, String municipio,
                            String correoElectronico, String contraseña, String confirmarContraseña){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Nombre", nombre);
        values.put("Ap_Paterno", apPaterno);
        values.put("Ap_Materno", apMaterno);
        values.put("Telefono", telefono);
        values.put("Calle", calle);
        values.put("Num_Domicilio", numDomicilio);
        values.put("Colonia", colonia);
        values.put("Municipio", municipio);
        values.put("Correo_Electronico", correoElectronico);
        values.put("Contraseña", contraseña);
        values.put("Confirmar_Contraseña", confirmarContraseña);

        long resultado = db.insert("Usuarios", null, values);
        db.close();
        return resultado;

    }


}
