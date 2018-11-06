package com.example.hasan.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdepter extends BaseAdapter {
    Context context;
    int[] flags;
    String[] cuntryNames;
    private LayoutInflater inflater;

    public CustomAdepter(Context context, String[] cuntryNames, int[] flags) {
        this.context=context;
        this.flags=flags;
        this.cuntryNames=cuntryNames;
    }


    @Override
    public int getCount() {
        return cuntryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
          inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          convertView = inflater.inflate(R.layout.sample,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageV_id_sample);
        TextView textView = convertView.findViewById(R.id.cuntryName_is_sample);

        imageView.setImageResource(flags[position]);
        textView.setText(cuntryNames[position]);
        return convertView;
    }
}
