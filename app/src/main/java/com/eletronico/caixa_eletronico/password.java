package com.eletronico.caixa_eletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class password extends AppCompatActivity {

    private EditText password;
    private Button buttonConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        password = findViewById(R.id.editTextPassword);
        buttonConfirmar = findViewById(R.id.buttonConfirmar);

        buttonConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int passwordCadastrada = 123456;
                int passwordAtual;

                passwordAtual = Integer.parseInt(password.getText().toString());

                if(passwordAtual == passwordCadastrada)
                {
                    ActivityMain();
                } else {
                    Toast.makeText(password.this, "Senha inválida, tente novamente", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void ActivityMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}