package com.ravrani_software_developers.studymate;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.speech.tts.Voice;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SemsterPDF extends AppCompatActivity {
    SwipeRefreshLayout swipeRefreshLayout;
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_semster_pdf);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pdfView = (PDFView)findViewById(R.id.pdf);

        final Bundle extras = getIntent().getExtras();
        String sub_names = extras.getString("sub_names");
        String subject_code = extras.getString("sub_codes");

        TextView name = (TextView)findViewById(R.id.subNames);
        TextView code = (TextView)findViewById(R.id.subCodes);

        name.setText(sub_names);
        code.setText(subject_code);

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.activity_semster_pdf);
        Snackbar.make(relativeLayout,"Press Back to Exit.",Snackbar.LENGTH_LONG).show();

        swipeRefreshLayout = (SwipeRefreshLayout)  findViewById(R.id.refresh_pdf);
        swipeRefreshLayout.setRefreshing(true);

        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new RetrivePDFStream().execute(extras.getString("url_pdf"));
            }
        });

        new RetrivePDFStream().execute(extras.getString("url_pdf"));
    }
    class RetrivePDFStream extends AsyncTask<String, Void, InputStream>
    {
        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
                if (urlConnection.getResponseCode() == 200){
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            }
            catch(IOException e)
            {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream)
                    .onLoad(new OnLoadCompleteListener() {
                        @Override
                        public void loadComplete(int nbPages) {
                            swipeRefreshLayout.setRefreshing(false);
                        }
                    })
                    .spacing(1)
                    .load();
        }
    }
}
