package com.example.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

        String miUrlVideoYouTube = "https://www.youtube.com/watch?v=-So9LQNpD2M";
        String dataUrl = generateDataUrl(miUrlVideoYouTube);
        myWebView.loadData(dataUrl, "text/html", "utf-8");
    }
    private String generateDataUrl(String urlVideo) {
        return "<html>" +
                "<body>" +
                "<h2>Video desde YouTube</h2>" +
                "<br>" +
                "<iframe width=\"560\" height=\"315\" src=\"" + urlVideo + "\" frameborder=\"0\" allowfullscreen/>" +
                "</body>" +
                "</html>";
    }
}