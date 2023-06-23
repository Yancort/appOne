package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private TextView gestureText;
    private GestureDetector gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        gestureText = (TextView) findViewById(R.id.gestos);
        gDetector = new GestureDetector(this, new EscuchaGestos());

        final Button buttonConstrainNext = findViewById(R.id.button5);
        buttonConstrainNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                openActivity3();
            }
        });

        final Button buttonConstrainPrev = findViewById(R.id.button6);
        buttonConstrainPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View b) {
                openActivity5();
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private class EscuchaGestos extends GestureDetector.SimpleOnGestureListener {

        @Override
        public void onLongPress(MotionEvent e){
            gestureText.setText("Presion Larga");
        }

        @Override
        public boolean onDoubleTap(MotionEvent e){
            gestureText.setText("Doble Toque");
            return false;
        }

        @Override
        public boolean onSingleTapUp(MotionEvent e){
            gestureText.setText("Toque Simple");
            return false;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
            float ancho = Math.abs(e2.getX() - e1.getX());
            float alto = Math.abs(e2.getY() - e1.getY());

            if(ancho > alto){
                if(e2.getX() > e1.getX()){
                    gestureText.setText("Desplazamiento a la Derecha");
                } else{
                    gestureText.setText("Desplazamiento a la Izquierda");
                }
            } else{
                if(e2.getY() > e1.getY()){
                    gestureText.setText("Desplazamiento hacia Abajo");
                } else{
                    gestureText.setText("Desplazamiento hacia Arriba");
                }
            }

            return false;
        }
    }

    private void openActivity3() {
        Intent intento = new Intent(this, MainActivity3.class);
        startActivity(intento);
    }

    private void openActivity5() {
        Intent intento = new Intent(this, MainActivity5.class);
        startActivity(intento);
    }
}