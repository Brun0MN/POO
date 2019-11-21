package com.example.variasactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        if(extras != null){
            int contador = extras.getInt("contador");

            TextView view findViewById(R.id.textViewMain2); //textViewSegunda

            view.setText(""+contador);
        }


    }


    public void b1(View view){
        Intent messageIntent = new Intent(this, MainActivity.class);
        startActivity(messageIntent);
    }

    public void b3(View view){
        Intent messageIntent = new Intent(this, TerceiraActivity.class);
        startActivity(messageIntent);
    }




}
