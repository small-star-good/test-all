package com.example.android.notepad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NotesAdapter extends BaseAdapter {

    private ArrayList<NotesEntity> list=new ArrayList<>();

    private Context mContext;

    public NotesAdapter(Context context){
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyHolder myHolder=null;
        if (convertView==null){
            myHolder=new MyHolder();
            convertView= LayoutInflater.from(mContext).inflate(R.layout.rv_notes_item,null);
            myHolder.txt_title= (TextView) convertView.findViewById(R.id.txt_title);
            myHolder.txt_time= (TextView) convertView.findViewById(R.id.txt_time);
            convertView.setTag(myHolder);
        }else{
            myHolder= (MyHolder) convertView.getTag();
        }
        myHolder.txt_title.setText(list.get(position).getTitle());
        myHolder.txt_time.setText(list.get(position).getCreated());
        return convertView;
    }

    class MyHolder{
        TextView txt_title,txt_time;
    }

    public ArrayList<NotesEntity> getList() {
        return list;
    }

    public void setList(ArrayList<NotesEntity> list) {
        this.list = list;
    }
}
