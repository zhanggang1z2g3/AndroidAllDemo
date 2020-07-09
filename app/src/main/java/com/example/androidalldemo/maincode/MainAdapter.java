package com.example.androidalldemo.maincode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.androidalldemo.R;

import java.util.List;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private List<String> list;

    public MainAdapter(Context context,List<String> list){
           this.context=context;
           this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
         if(view == null){
              view= LayoutInflater.from(context).inflate(R.layout.activity_main_adapter,null);
              holder=new ViewHolder();
              holder.textView=(TextView)view.findViewById(R.id.adapter_text);

         }else{
              holder=(ViewHolder) view.getTag();
         }
        holder.textView.setText(list.get(i));

        return view;
    }

    public final class ViewHolder{
        public TextView textView;
    }

}
