package com.example.variasactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void b2(View view){
        Intent messageIntent = new Intent(this, SegundaActivity.class);

        // mandar varias informacoes em hashmap
        Bundle extras = new Bundle();
        extras.putInt("contador", 1);
        messageIntent.putExtras(extras);

        startActivity(messageIntent);
    }

    public void b3(View view){
        Intent messageIntent = new Intent(this, TerceiraActivity.class);
        startActivity(messageIntent);
    }


}
