package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int image[]={R.drawable.huycan,R.drawable.xuandieu,R.drawable.macngon,R.drawable.hemi,R.drawable.shake};
    String name[]={"Huy Cận","Xuân Diệu","Mạc Ngôn","Hemingway","Shakespeare"};

    ArrayList<Item> mylist;
    MyArrayAdapter myArrayAdapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv_item);
        mylist =new ArrayList<>();//tao moi mang (rong)

        for(int i=0 ;i<name.length;i++){
            mylist.add(new Item(image[i],name[i]));
        }
        myArrayAdapter = new MyArrayAdapter(MainActivity.this,R.layout.item,mylist);
        lv.setAdapter(myArrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra("name",name[i]);
                intent.putExtra("image",image[i]);
                startActivity(intent);
            }
        });
    }
}