package com.example.barapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity3 extends AppCompatActivity {
    Intent intent;
    String pedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        intent = getIntent();
        pedido = intent.getExtras().getString("pedido");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent  = new Intent(MainActivity3.this, MainActivity2.class);
                intent.putExtra("pedido", pedido);
                startActivity(intent);
            }
        }, 4000);
    }
}