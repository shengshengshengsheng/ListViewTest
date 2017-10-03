package com.example.shengsheng.listviewtest;
//修改点击事件
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   /*private String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
            "Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};*/
private List<Fruit>fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item ,fruitList);
        /*ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);*/
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?>parent,View view,int position,long id)
            {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFruits()
    {
        for(int i=0;i<2;i++)
        {
            Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana=new Fruit("Banana",R.drawable.apple_pic);
            fruitList.add(banana);
            Fruit orange=new Fruit("Orange",R.drawable.apple_pic);
            fruitList.add(orange);
            Fruit watermelon=new Fruit("Watermelon",R.drawable.apple_pic);
            fruitList.add(watermelon);
            Fruit pear=new Fruit("Pear",R.drawable.apple_pic);
            fruitList.add(pear);
            Fruit grape=new Fruit("Grape",R.drawable.apple_pic);
            fruitList.add(grape);
            Fruit pineapple=new Fruit("Pineapple",R.drawable.apple_pic);
            fruitList.add(pineapple);
        }
    }
}
