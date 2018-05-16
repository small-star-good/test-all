package com.example.test6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity /* implements View.OnClickListener*/ {

    //EditText url;
    WebView show;
   // Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*url = (EditText) findViewById(R.id.url);*/
        show = (WebView) findViewById(R.id.show);
        show.loadUrl("http://www.baidu.com");
        show.setWebViewClient(new WebViewClient());
        /*btn_go= (Button) findViewById(R.id.btn_go);
        btn_go.setOnClickListener(this);*/
    }


  /*  @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_go:
                    show.loadUrl(url.getText().toString());
                break;
        }
    }*/

    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_SEARCH) {
            String urlStr = url.getText().toString();
            show.loadUrl(urlStr);
            return true;
        }
        return false;
    }*/
}
