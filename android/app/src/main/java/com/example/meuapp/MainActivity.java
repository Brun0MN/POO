package com.example.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /*
    public void alterarTexto(View view){

        // Pegar o texto da caixa de texto
        EditText caixa = findViewById(R.id.caixaDeTexto);

        String texto = caixa.getText().toString();

        // Alterando o texto da TextView
        TextView mensagem = findViewById(R.id.texto);

        mensagem.setText(texto);

    }
*/



}
