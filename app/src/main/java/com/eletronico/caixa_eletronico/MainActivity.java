package com.eletronico.caixa_eletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

                double dinheiro;
                dinheiro = Double.parseDouble(saldo_Sacar.getText().toString());

                if(dinheiro < 20)
                {
                    Toast.makeText(MainActivity.this, "Valores para saque, acima de 20,00", Toast.LENGTH_LONG).show();
                }else if(dinheiro == 20 || dinheiro == 50 || dinheiro == 100)
                {
                    saldoEmConta -= dinheiro;
                    saldo_Disponivel.setText("Saldo disponível: " + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "Saldo sacado com sucesso", Toast.LENGTH_LONG).show();
                } else{
                    saldoEmConta -= dinheiro;
                    saldo_Disponivel.setText("Saldo diponível: " + "R$ " + saldoEmConta);
                    Toast.makeText(MainActivity.this, "Saldo sacado com sucesso!", Toast.LENGTH_LONG).show();
                }
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