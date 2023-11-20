package com.example.grapewavemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuAdm_Emp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_adm_emp);

        ImageButton btnAddEmpleados = findViewById(R.id.btnAddEmpleados);

        btnAddEmpleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAdm_Emp.this,AddEmp.class);
                startActivity(intent);
            }
        });

        ImageButton btnDelEmpleados = findViewById(R.id.btnDelEmpleados);

        btnDelEmpleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAdm_Emp.this, DelEmp.class);
                startActivity(intent);
            }
        });



    }
}