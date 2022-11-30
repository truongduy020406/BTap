package com.example.listviewnc;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterTP extends ArrayAdapter<item_tacpham> {

    Activity context;
    int idLayout;
    ArrayList<item_tacpham> mylist;

    public AdapterTP(Activity context1, int idLayout, ArrayList<item_tacpham> mylist) {
        super(context1, idLayout, mylist);
        this.context = context1;
        this.idLayout = idLayout;
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mylaoutIn = context.getLayoutInflater();
        convertView =mylaoutIn.inflate(idLayout,null);

        item_tacpham item = mylist.get(position);

        TextView txt_item = convertView.findViewById(R.id.maTP);
        txt_item.setText(item.getMaTP());

        TextView name = convertView.findViewById(R.id.nameTP);
        name.setText(item.getNameTP());
        return  convertView;
    }
}
