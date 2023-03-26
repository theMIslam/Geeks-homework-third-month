package com.example.home_work_3_4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.home_work_3_4.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continents, new ContinentsFragment()).addToBackStack(null).commit();
    }
}