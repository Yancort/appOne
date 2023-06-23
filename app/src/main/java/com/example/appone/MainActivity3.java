package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private GestureDetector gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        gDetector = new GestureDetector(this, new MainActivity3.ObtieneGestos());

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

    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    private class ObtieneGestos extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
            float ancho = Math.abs(e2.getX() - e1.getX());
            float alto = Math.abs(e2.getY() - e1.getY());

            if(ancho > alto){
                if(e2.getX() > e1.getX()){
                    openActivity2();
                } else{
                    openActivity4();
                }
            } else{
                return false;
            }

            return false;
        }
    }
}   