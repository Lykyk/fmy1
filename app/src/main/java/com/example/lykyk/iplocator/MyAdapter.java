package com.example.lykyk.iplocator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    /**
     * 告诉listview 你的列表数
     * @return
     */
    @Override
    public int getCount() {
        return 5;
    }

    /**
     *
     * @param position
     * @return
     */
    @Override
    public Object getItem(int position) {
        return null;
    }

    /**
     *
     * @param position
     * @return
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * 返回position位置的视图
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        TextView textView = new TextView(parent.getContext());
//        textView.setText(position+"");
//
//
//        return textView;
        //获取布局填充器 ===>>>xml 变为java中view 对象
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
                                                                        //第一个参数 你要填充布局
                                                                                //这个布局的父布局是谁 可以为null
                                                                        //如果第二个参数为null 第三个参数写什么都没有用
                                                                    //是否直接填充到父布局
        View view = layoutInflater.inflate(R.layout.item_layout, parent, false);


        TextView tv = view.findViewById(R.id.tv);

        tv.setText(position+"");

        return view;
    }
}
