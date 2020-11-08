package com.example.practica3;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relacionar objeto xml con java
        WebView webView = findViewById(R.id.webView1);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Permitir javaScript

        // url embebide
        webView.loadUrl("https://movilzona.es");


        webView.setWebViewClient(new WebViewClient() {
        // El método shouldOverrideUrlLoading () debe devolver falso si desea cargar la URL con su webView
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        // Poner el titulo de la pagina como titulo app
            @Override
            public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
              String title = view.getTitle();
              MainActivity.this.setTitle(title);
            }
        });
    }
}