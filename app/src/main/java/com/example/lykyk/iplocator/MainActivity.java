package com.example.lykyk.iplocator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        lv = findViewById(R.id.lv);
//
//6
//
//        lv.setAdapter(new MyAdapter());



        LayoutInflater layoutInflater = LayoutInflater.from(this);

        FrameLayout layout_1 = (FrameLayout) layoutInflater.inflate(R.layout.mlayout_1_layout,null,false);


//        FrameLayout frameLayout = new FrameLayout(this);
//        setContentView(frameLayout);

        setContentView(layout_1);



//        layoutInflater.inflate(R.layout.mlayout_2_layout,layout_1);
        View layout2 = layoutInflater.inflate(R.layout.mlayout_2_layout,layout_1);

       //把第二个布局放在第一个布局中
//        layout_1.addView(layout2);


//        frameLayout.addView(layout2);
    }

//    void setmContentView(int layoutId){
//              FrameLayout  Pareview ;
//        LayoutInflater layoutInflater = LayoutInflater.from(this);
//
//        View layout_1 = layoutInflater.inflate(layoutId,Pareview,false);
//        Pareview.addView(layout_1);
//    }
//      FrameLayout  Pareview ;
//      Pareview.addView(view);
//
//    }
//    void setmContentView(View view){
//      FrameLayout  Pareview ;
//      Pareview.addView(view);
//
//    }
}
