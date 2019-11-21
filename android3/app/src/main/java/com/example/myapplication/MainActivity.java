package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState != null){
            this.contador = savedInstanceState.getInt("contador");
            TextView mensagem = findViewById(R.id.mensagem);            // pega da tela e tira o erro de "mensagem"
            mensagem.setText(""+this.contador);

        }



    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "criada");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    public void alterarTexto(View view){
        EditText caixa = findViewById(R.id.caixaDetexto);
        String texto = caixa.getText().toString();
        mensagem.setText(""+this.contador);
    }


    public void incrementar(View view){
        TextView contador = findViewById(R.id.mensagem);

        int i = Integer.parseInt(contador.getText().toString());
        i++;
        contador.setText(""+i);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        TextView contador = findViewById(R.id.mensagem);

        int i = Integer.parseInt(contador.getText().toString());
        outState.putInt("contador", this.contador);
    }
}


