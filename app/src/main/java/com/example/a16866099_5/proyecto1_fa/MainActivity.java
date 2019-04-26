package com.example.a16866099_5.proyecto1_fa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mensaje Me gusta
        imgBtn = (ImageButton) findViewById(R.id.imageButton);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Gracias :)", Toast.LENGTH_SHORT).show();
            }
        });

        imgBtn = (ImageButton) findViewById(R.id.imageButton4);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Gracias :)", Toast.LENGTH_SHORT).show();
            }
        });

        //Mensaje No Me Gusta
        imgBtn = (ImageButton) findViewById(R.id.imageButton2);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Que lástima :(", Toast.LENGTH_SHORT).show();
            }
        });

        imgBtn = (ImageButton) findViewById(R.id.imageButton5);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Que lástima :(", Toast.LENGTH_SHORT).show();
            }
        });

        //Boton Direccionador a SecondActivity
        imgBtn = (ImageButton) findViewById(R.id.imageButton8);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        //Boton Compartir 1
        imgBtn = (ImageButton) findViewById(R.id.imageButton3);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                shareIt();
            }
            private void shareIt() {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Here is the share content body";
                startActivity(Intent.createChooser(sharingIntent, "Compartelo via:"));
            }

        });

        //Boton Compartir 2
        imgBtn = (ImageButton) findViewById(R.id.imageButton6);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                shareIt();
            }
            private void shareIt() {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Here is the share content body";
                startActivity(Intent.createChooser(sharingIntent, "Compartelo via:"));
            }

        });
    }
}