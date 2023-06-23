package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView myWebView = findViewById(R.id.miWebView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        String miUrlVideoYouTube = "https://www.youtube.com/embed/3IwHoFNQUo8";
        String dataUrl = generateDataUrl(miUrlVideoYouTube);
        myWebView.loadData(dataUrl, "text/html", "utf-8");

        final Button buttonConstrainNext = findViewById(R.id.button);
        buttonConstrainNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View y) {
                openActivity1();
            }
        });

        final Button buttonConstrainPrev = findViewById(R.id.button2);
        buttonConstrainPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View z) {
                openActivity3();
            }
        });
    }
    private String generateDataUrl(String urlVideo) {
        return "<html>" +
                "<body>" +
                "<h2>Video desde YouTube</h2>" +
                "<br>" +
                "<iframe width=\"660\" height=\"415\" src=\"" + urlVideo + "\" frameborder=\"0\" allowfullscreen/>" +
                "</body>" +
                "</html>";
    }

    private void openActivity1() {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
    }

    private void openActivity3() {
        Intent intento = new Intent(this, MainActivity3.class);
        startActivity(intento);
    }
}