package com.example.test_4_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.et_hello_world);
        registerForContextMenu(txt);
    }


   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // 普通箱单被点击处所进行的操作。
            case R.id.menu_plain_menu:
                Toast.makeText(this, "你单击了普通菜单", Toast.LENGTH_LONG).show();
                break;
            // 为子菜单的子项定义被点击时所进行的操作。
            case R.id.font_10:

                txt.setTextSize(10);
                break;
            case R.id.font_16:
                txt.setTextSize(16);
                break;
            case R.id.font_20:
                txt.setTextSize(20);
                break;
            case R.id.font_red:
                txt.setTextColor(Color.RED);
                break;
            case R.id.font_black:
                txt.setTextColor(Color.BLACK);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
