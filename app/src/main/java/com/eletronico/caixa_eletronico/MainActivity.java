package com.eletronico.caixa_eletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView saldo_Disponivel;
    private Button button_sacar;
    private EditText saldo_Sacar;

    double saldoEmConta = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();

        saldo_Disponivel.setText("Saldo Disponível: " + "R$ " + saldoEmConta);

        button_sacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    private void IniciarComponentes()
    {
       saldo_Disponivel = findViewById(R.id.Saldo);
       button_sacar = findViewById(R.id.bt_sacar);
       saldo_Sacar = findViewById(R.id.editTextNumberDecimal);
    }
}