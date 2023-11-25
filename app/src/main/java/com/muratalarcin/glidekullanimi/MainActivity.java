package com.muratalarcin.glidekullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.muratalarcin.glidekullanimi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        resimGoster("baklava.png");

        binding.buttonResim1.setOnClickListener(view -> {
            resimGoster("kofte.png");
        });

        binding.buttonResim2.setOnClickListener(view -> {
            resimGoster("ayran.png");
        });

    }

    public void resimGoster(String resimAdi) {
        String url = "http://kasimadalan.pe.hu/yemekler/resimler/" + resimAdi;
        Glide.with(this).load(url).override(300, 300).into(binding.imageView);
    }

}