package com.example.ejercicio_individual_9;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ejercicio_individual_9.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        img1 = binding.image1;
        img2 = binding.image2;
        img3 = binding.image3;
        img4 = binding.image4;

        img1.setOnClickListener(v -> vista(""+R.drawable.surf1, ""+R.color.color_img1 ));
        img2.setOnClickListener(v -> vista(""+R.drawable.sunny2, ""+R.color.color_img2));
        img3.setOnClickListener(v -> vista(""+R.drawable.beach3, ""+R.color.color_img3 ));
        img4.setOnClickListener(v -> vista(""+R.drawable.surf4, ""+R.color.color_img4 ));


    }
    protected void vista (String image, String color) {
        Intent intento = new Intent(MainActivity.this, MainActivity2.class);
        intento.putExtra("imagen", image);
        intento.putExtra("color", color);
        startActivity(intento);
    }
}