package com.example.yogeshwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.yogeshwhatsapp.databinding.ActivitySignInBinding;
import com.example.yogeshwhatsapp.databinding.ActivitySignUpBinding;

public class SignInActivity extends AppCompatActivity {

    ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}