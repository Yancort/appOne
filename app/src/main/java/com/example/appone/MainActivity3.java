package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Button buttonConstrainNext = findViewById(R.id.button3);
        buttonConstrainNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View y) {
                openActivity2();
            }
        });

        final Button buttonConstrainPrev = findViewById(R.id.button4);
        buttonConstrainPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View z) {
                openActivity4();
            }
        });
    }


    private void openActivity2() {
        Intent intento = new Intent(this, MainActivity2.class);
        startActivity(intento);
    }

    private void openActivity4() {
        Intent intento = new Intent(this, MainActivity4.class);
        startActivity(intento);
    }
}   