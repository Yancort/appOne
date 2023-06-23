package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final Button buttonConstrainNext = findViewById(R.id.btn02);
        buttonConstrainNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View x) {
                openActivity4();
            }
        });

    }

    private void openActivity4() {
        Intent intento = new Intent(this, MainActivity4.class);
        startActivity(intento);
    }
}