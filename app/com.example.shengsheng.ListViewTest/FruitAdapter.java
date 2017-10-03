package com.example.shengsheng.listviewtest;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XQS on 2017/10/3 0003.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int rescourseId;
    public FruitAdapter(Context context,int textViewRescourseId,List<Fruit>objects)
    {
        super(context, textViewRescourseId,objects);
        rescourseId=textViewRescourseId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Fruit fruit=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null)
        {
            view=LayoutInflater.from(getContext()).inflate(rescourseId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName=(TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//将viewHolder存储在View中
        }
        else
        {
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();//重新获取viewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        /*View view= LayoutInflater.from(getContext()).inflate(rescourseId,parent,false);*/
        /*ImageView fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
        TextView fruitName=(TextView)view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());*/
        return view;
    }
    class   ViewHolder
    {
        ImageView fruitImage;
        TextView fruitName;
    }
}
