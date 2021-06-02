package com.eletronico.caixa_eletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //chamada da função
                ActivityPassword();
            }
        },3000);
    }

    //função para fazer a navegação entre activity
    private void ActivityPassword()
    {
        Intent intent = new Intent(loading.this, password.class);
        startActivity(intent);
        finish();
    }
}