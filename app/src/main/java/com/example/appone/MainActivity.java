package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonConstrainNext = findViewById(R.id.btn01);
        buttonConstrainNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View x) {
                openActivityLinear();
            }
        });
    }

    private void openActivityLinear() {
        Intent intento = new Intent(this, MainActivity2.class);
        startActivity(intento);
    }

}