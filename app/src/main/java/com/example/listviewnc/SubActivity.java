package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {
    TextView tv;
    ImageView img;
    String maTP[]={"TP1","TP2","TP3","TP4","TP5"};
    String nametp[]={"Tràng Giang","Đoàn thuyền đánh cá","Ta viết bài thơ gọi biển về","Ngậm ngùi","Con chim chiền chiện"};
    String nd[]={"Tràng Giang","\n" +
            "Mặt trời xuống biển như hòn lửa\n" +
            "Sóng đã cài then, đêm sập cửa.\n" +
            "Đoàn thuyền đánh cá lại ra khơi,\n" +
            "Câu hát căng buồm cùng gió khơi.đánh cá","Ta v\n" +
            "Ta viết bài thơ gọi biển về\n" +
            "Nghìn năm dào dạt sóng say mê\n" +
            "Hoàng hôn khép nhẹ hàng mi tím\n" +
            "Xanh biếc bình minh buổi gió se","Nắng chia nửa bãi, chiều rồi…\n" +
            "Vườn hoang trinh nữ xếp đôi lá rầu.\n" +
            "Sợi buồn con nhện giăng mau,\n" +
            "Em ơi! Hãy ngủ… anh hầu quạt đây.\n" +
            "Lòng anh mở với quạt này,\n" +
            "Trăm con chim mộng về bay đầu giường.","Con chim chiền chiện\n" +
            "Bay vút, vút cao\n" +
            "Lòng đầy yêu mến\n" +
            "Khúc hát ngọt ngào."};
    ArrayList<item_tacpham> mylist1;
    AdapterTP myArrayAdapter1;
    ListView lv1;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        tv= findViewById(R.id.textView4);
        img = findViewById(R.id.imageView);
        Intent myintent = getIntent();
        String name = myintent.getStringExtra("name");
        int image = myintent.getIntExtra("image",1);
        img.setImageResource(image);
        tv.setText(name);



        lv1 = findViewById(R.id.lv_tp);
        mylist1 =new ArrayList<>();//tao moi mang (rong)

        for(int i=0 ;i< nametp.length;i++){
            mylist1.add(new item_tacpham(maTP[i],nametp[i],nd[i]));
        }
        myArrayAdapter1 = new AdapterTP(SubActivity.this,R.layout.item_tp,mylist1);
        lv1.setAdapter(myArrayAdapter1);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SubActivity.this,subtacpham.class);
                intent.putExtra("matp",maTP[i]);
                intent.putExtra("name",nametp[i]);
                intent.putExtra("nd",nd[i]);
                startActivity(intent);
            }
        });
    }
}