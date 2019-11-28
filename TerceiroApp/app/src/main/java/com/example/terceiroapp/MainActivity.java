package com.example.terceiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String sSharedProfFile = "br.edu.ifsc.sj.minhaspreferencias"; // nome do pacote + nome preferencias
    private SharedPreferences mSharedPreferences;
    private int mContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSharedPreferences = getSharedPreferences(sSharedProfFile, MODE_PRIVATE);

        //mContador = 0;
        mContador = mSharedPreferences.getInt("contador", 0); // se encontrar chave, pega, senao, retorna 0


        TextView textureView = findViewById(R.id.contador);
        textView.setText(""+mContador);


    }



    public void decrementar(View view) {
        mContador--;

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);

    }


    public void incrementar(View view){
        mContador++;

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);



    }


    @Override
    protected void onPause() {
        super.onPause();


        //colocado aqui pois é custoso colocar no incrementar/decrementar
        SharedPreferences.Editor prefsEditor = mSharedPreferences.edit();

        prefsEditor.putInt("contador", mContador); // usar final é melhor que literal pelo codigo

        prefsEditor.apply();

    }

    public void zerar(View view) {
        SharedPreferences.Editor prefsEditor = mSharedPreferences.edit();

        prefsEditor.clear();
        prefsEditor.apply();

        mContador = 0;

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);




    }
}
