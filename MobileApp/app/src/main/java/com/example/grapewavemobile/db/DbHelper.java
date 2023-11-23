package com.example.grapewavemobile.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME = "GrapeWave.db";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Dueño (" +
                "Id_Master INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre_Master VARCHAR(30)," +
                "Ap_PatMaster VARCHAR(30)," +
                "Ap_MatMaster VARCHAR(30)," +
                "Correo_Master VARCHAR(255)," +
                "contraseña VARCHAR(20));");

        db.execSQL("CREATE TABLE Sucursal (" +
                "Id_Sucursal INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre_Sucursal VARCHAR(40)," +
                "Teléfono_Sucursal BIGINT," +
                "Calle_Sucursal VARCHAR(30)," +
                "Num_Sucursal INT," +
                "Colonia_Sucursal VARCHAR(30)," +
                "Municipio_Sucursal VARCHAR(30)," +
                "Estado_Sucursal VARCHAR(25));");

        db.execSQL("CREATE TABLE Productos (" +
                "Id_Producto INTEGER PRIMARY KEY," +
                "Nombre_Producto VARCHAR(40)," +
                "Descripción VARCHAR(50)," +
                "Categoría VARCHAR(20)," +
                "Marca VARCHAR(20)," +
                "Precio FLOAT," +
                "Stock INT," +
                "Lote VARCHAR(5)," +
                "Ubicación VARCHAR(20)," +
                "Imágen BLOB);");

        db.execSQL("CREATE TABLE Administrador (" +
                "Id_Admin INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre_Admin VARCHAR(30)," +
                "Ap_PatAdmin VARCHAR(15)," +
                "Ap_MatAdmin VARCHAR(15)," +
                "Teléfono_Admin BIGINT," +
                "Calle_Admin VARCHAR(15)," +
                "Num_ExtAdmin INT," +
                "Colonia_Admin VARCHAR(30)," +
                "Municipio_Admin VARCHAR(230)," +
                "Estado_Admin VARCHAR(30)," +
                "Correo_Admin VARCHAR(255)," +
                "contraseña VARCHAR(20));");

        db.execSQL("CREATE TABLE Empleados (" +
                "Id_Empleado INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre_Empleado VARCHAR(30)," +
                "Ap_PatEmp VARCHAR(30)," +
                "Ap_MatEmp VARCHAR(30)," +
                "Telefono_Empleado BIGINT," +
                "Calle_Empleado VARCHAR(30)," +
                "Num_ExtEmpleado INT," +
                "Colonia_Empleado VARCHAR(25)," +
                "Municipio_Empleado VARCHAR(35)," +
                "Estado_Empleado VARCHAR(25)," +
                "Correo_Empleado VARCHAR(255)," +
                "contraseña VARCHAR(20));");

        db.execSQL("CREATE TABLE Informes (" +
                "Id_Informe INTEGER PRIMARY KEY," +
                "Tipo_Informe VARCHAR(20)," +
                "Contenido BLOB);");

        db.execSQL("CREATE TABLE IF NOT EXISTS Usuarios (" +
                "Id_Usuario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre VARCHAR(30)," +
                "Ap_Paterno VARCHAR(30)," +
                "Ap_Materno VARCHAR(30)," +
                "Telefono BIGINT," +
                "Calle VARCHAR(30)," +
                "Num_Domicilio INT," +
                "Colonia VARCHAR(25)," +
                "Municipio VARCHAR(35)," +
                "Correo_Electronico VARCHAR(255)," +
                "Contraseña VARCHAR(20)," +
                "Confirmar_Contraseña VARCHAR(20));");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Dueño;");
        db.execSQL("DROP TABLE IF EXISTS Sucursal;");
        db.execSQL("DROP TABLE IF EXISTS Productos;");
        db.execSQL("DROP TABLE IF EXISTS Administrador;");
        db.execSQL("DROP TABLE IF EXISTS Empleados;");
        db.execSQL("DROP TABLE IF EXISTS Informes;");
        db.execSQL("DROP TABLE IF EXISTS Prueba;");
        db.execSQL("DROP TABLE IF EXISTS Usuarios;");
        onCreate(db);
    }
}
