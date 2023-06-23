package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    private GestureDetector gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        gDetector = new GestureDetector(this, new MainActivity5.ObtieneGestos());

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
                    openActivity4() ;
                } else{
                    return false;
                }
            } else{
                return false;
            }

            return false;
        }
    }
}