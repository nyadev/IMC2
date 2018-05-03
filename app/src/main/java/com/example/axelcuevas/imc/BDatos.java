package com.example.axelcuevas.imc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDatos extends SQLiteOpenHelper {

    private static final String TABLA_USERS = "create table users (email text primary key, name text, age, height, weight, type)";

    public BDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL(TABLA_USERS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int i, int i1) {

    }
}