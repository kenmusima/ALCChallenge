package com.example.ken.alcchallenge;



import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutAlc4Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc4);

        webView = (WebView) findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient()
        {
            public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError sslError)
            {
                handler.proceed();
            }
        });

        webView.loadUrl("http://andela.com/alc");
    }
}

