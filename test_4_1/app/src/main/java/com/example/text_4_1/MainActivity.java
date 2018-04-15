package com.example.text_4_1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    View v=null;
    private String[] name = new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] imageIds={
            R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,
            R.drawable.cat,R.drawable.elephant
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List <Map<String,Object>> listItems = new ArrayList<Map<String, Object>>();
        for(int i=0;i<name.length;i++){
            Map<String,Object> listItem =new HashMap<String,Object>();
            listItem.put("header",imageIds[i]);
            listItem.put("personName",name[i]);
            listItems.add(listItem);
            SimpleAdapter simpleAdapter =new SimpleAdapter(this,listItems,R.layout.simple_item, new String []{"header","personName"},new int []{R.id.header,R.id.name});
            ListView list = (ListView) findViewById(R.id.mylist);
            list.setAdapter(simpleAdapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Bitmap p=BitmapFactory.decodeResource(getResources(), R.drawable.cat);
                    Drawable d=new BitmapDrawable(p);
                    int c = (int) R.color.colorAccent;
                    if(v!=null)
                        v.setBackgroundColor(1);
                    view.setBackgroundColor(c);
                    v=view;
                    Toast toast = Toast.makeText(MainActivity.this, name[position],Toast.LENGTH_SHORT);
                    toast.show();
                }
            });
        }
    }

}
