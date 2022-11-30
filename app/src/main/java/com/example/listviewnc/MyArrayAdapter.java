package com.example.listviewnc;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<Item> {
    Activity context;
    int idLayout;
    ArrayList<Item> mylist;

    public MyArrayAdapter(Activity context, int idLayout, ArrayList<Item> mylist) {
        super(context, idLayout,mylist);
        this.context = context;
        this.idLayout = idLayout;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mylaoutIn = context.getLayoutInflater();
        convertView =mylaoutIn.inflate(idLayout,null);

        Item item = mylist.get(position);

        ImageView img_item = convertView.findViewById(R.id.img_item);
        img_item.setImageResource(item.getImage());


        TextView txt_item = convertView.findViewById(R.id.tv);
        txt_item.setText(item.getName());
        return  convertView;
    }
}
