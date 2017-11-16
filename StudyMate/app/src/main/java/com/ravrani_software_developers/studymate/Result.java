package com.ravrani_software_developers.studymate;

import android.graphics.Bitmap;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Result extends AppCompatActivity {
    private WebView webView;
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
        String url = extras.getString("url_res");

        RelativeLayout relative = (RelativeLayout)findViewById(R.id.activity_result);

        Snackbar.make(relative, "Swipe down to refresh the Results.", Snackbar.LENGTH_LONG).show();

        swipeRefreshLayout = (SwipeRefreshLayout)  findViewById(R.id.refresh_result);
        swipeRefreshLayout.setRefreshing(true);

        webView = (WebView) findViewById(R.id.webView_result);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setWebViewClient(new NoErrorWebViewClient());
        webView.reload();
        webView.loadUrl(url);

        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);
        swipeRefreshLayout.setOnRefreshListener( new SwipeRefreshLayout.OnRefreshListener(){
            public void onRefresh(){webView.reload();}
        });
    }
    class NoErrorWebViewClient extends WebViewClient {

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String FailingUrl){
            Log.e(String.valueOf(errorCode),description);

            if(errorCode == -2){
                String summary = "Network Error Please Retry";
                view.loadData(summary, "text", null);
                return;
            }
            super.onReceivedError(view, errorCode, description, FailingUrl);
        }
    }
    public class WebViewClient extends android.webkit.WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view, url, favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url){
            super.onPageFinished(view, url);
            swipeRefreshLayout.setRefreshing(false);
        }
    }

}
