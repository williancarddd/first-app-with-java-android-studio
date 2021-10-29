package com.example.barapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb_cerveja, cb_agua, cb_cigarro, cb_vodka,cb_cachaca, cb_wisk;
    Button bt_pedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb_cerveja = findViewById(R.id.cb_cerveja);
        cb_agua = findViewById(R.id.cb_agua);
        cb_cigarro = findViewById(R.id.cb_cigarro);
        cb_vodka = findViewById(R.id.cb_vodka);
        cb_cachaca = findViewById(R.id.cb_cachaca);
        cb_wisk = findViewById(R.id.cb_wisk);
        bt_pedido = findViewById(R.id.bt_pedido);

        bt_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pedido = "";
                if(cb_agua.isChecked()) {
                    pedido +=  "agua" + "\n";
                }

                if(cb_wisk.isChecked()) {
                    pedido +=  "wisk" + "\n";
                }

                if(cb_cachaca.isChecked()) {
                    pedido += "Cachaça" + "\n" ;
                }

                if(cb_vodka.isChecked()) {
                    pedido +=  "Vodka" + "\n" ;
                }

                if(cb_cigarro.isChecked()) {
                    pedido += "\n" + "cigarro";
                }

                if(cb_cerveja.isChecked()) {
                    pedido +=  "cerveja" + "\n";
                }

                if(pedido.equals("")){
                    Toast.makeText(MainActivity.this,"pedido vázio.", Toast.LENGTH_LONG ).show();


                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    intent.putExtra("pedido", pedido);
                    startActivity(intent);
                }
            }

        });

    }
}