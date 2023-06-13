package com.example.ejercicio_individual_9;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ejercicio_individual_9.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    Button volver;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intento = getIntent();

        String img = intento.getStringExtra("imagen");
        String color = intento.getStringExtra("color");

        volver = binding.button2;
        imagen = binding.img2;

        imagen.setImageResource(Integer.parseInt(img));
        imagen.setBackgroundColor(getColor(Integer.parseInt(color)));

        volver.setOnClickListener(v -> {
            Intent back = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(back);
        });

        binding.btncerrar2.setOnClickListener(v -> {
            finishAffinity();
            System.exit(0);
        });

    }
}