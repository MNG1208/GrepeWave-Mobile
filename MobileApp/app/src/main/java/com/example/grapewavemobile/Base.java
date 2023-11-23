package com.example.grapewavemobile;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Base extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME = "GrapeWave.db";

    public Base(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase Base) {
        Base.execSQL(("CREATE TABLE IF NOT EXISTS Usuarios (" + "Id_Usuario INTEGER PRIMARY KEY AUTOINCREMENT," + "Nombre VARCHAR(30)," + "Ap_Paterno VARCHAR(30)," + "Ap_Materno VARCHAR(30)," + "Telefono BIGINT," + "Calle VARCHAR(30)," + "Num_Domicilio INT," + "Colonia VARCHAR(25)," + "Municipio VARCHAR(35)," + "Correo_Electronico VARCHAR(255)," + "Contraseña VARCHAR(20)," + "Confirmar_Contraseña VARCHAR(20));"));
        Base.execSQL(("CREATE TABLE IF NOT EXISTS UsuariosEmp (" + "Id_UsuarioE INTEGER PRIMARY KEY AUTOINCREMENT," + "NombreE VARCHAR(30)," + "Ap_PaternoE VARCHAR(30)," + "Ap_MaternoE VARCHAR(30)," + "TelefonoE BIGINT," + "CalleE VARCHAR(30)," + "Num_DomicilioE INT," + "ColoniaE VARCHAR(25)," + "MunicipioE VARCHAR(35)," + "Correo_ElectronicoE VARCHAR(255)," + "ContraseñaE VARCHAR(20)," + "Confirmar_ContraseñaE VARCHAR(20));"));

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
