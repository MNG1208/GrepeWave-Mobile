package com.example.grapewavemobile.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Administrador extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "GrapeWave.db";
    private static final int DATABASE_VERSION = 1;

    public Administrador(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS Administrador (" +
                "Id_Admin INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Num_Sucursal INTEGER," +
                "Contraseña TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Administrador;");
        onCreate(db);
    }

    public long AltaAdministrador(int numSucursal, String contraseña) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Num_Sucursal", numSucursal);
        values.put("Contraseña", contraseña);
        long resultado = db.insert("Administrador", null, values);
        db.close();
        return resultado;
    }

    public boolean IniciarSesionAdministrador(int numSucursal, String contraseña) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] projection = {"Id_Admin"};
        String selection = "Num_Sucursal = ? AND Contraseña = ?";
        String[] selectionArgs = {String.valueOf(numSucursal), contraseña};
        Cursor cursor = db.query("Administrador", projection, selection, selectionArgs, null, null, null);
        boolean success = cursor.moveToFirst();
        cursor.close();
        db.close();
        return success;
    }
}
