package com.example.test_4_2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout loginForm =(TableLayout)getLayoutInflater().inflate(R.layout.activity_main,null);
        new AlertDialog.Builder(this)
                .setView(loginForm)
                .create()
                .show();
    }

}
