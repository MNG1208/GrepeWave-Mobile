package com.example.grapewavemobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View circleView = findViewById(R.id.circleView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(GradientDrawable.OVAL);
        gradientDrawable.setColor(getResources().getColor(R.color.white));
        circleView.setBackground(gradientDrawable);

        Button btnContinuar = findViewById(R.id.btnContinuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InicOrReg.class);
                startActivity(intent);
            }
        });

        TextView termsAndCon = findViewById(R.id.termsAndCon);
        termsAndCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, MainActivity6.class);
                startActivity(intent);
            }
        });

    }
}