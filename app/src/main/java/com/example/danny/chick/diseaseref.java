package com.example.danny.chick;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;

import com.example.Project.minimaltodo.R;

public class diseaseref extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseaseref);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("http://www.nafis.go.ke/livestock/poultry-chicken/general-information/poultry-diseases/");

        if (getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
