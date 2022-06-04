package com.example.recyclerviewconcept;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.recyclerviewconcept.Adapters.RecepiAdapter;
import com.example.recyclerviewconcept.Models.RecepiModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        setTitle("Menu");

        ArrayList<RecepiModel> list = new ArrayList<RecepiModel>();
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chinesenoodles,"Noodles"));
        list.add(new RecepiModel(R.drawable.chocolatedessert,"Chocolate Dessert"));
        list.add(new RecepiModel(R.drawable.dumbiryani,"Dum Biryani"));
        list.add(new RecepiModel(R.drawable.pasta,"Pasta"));
        list.add(new RecepiModel(R.drawable.grillchicken,"Grill Chicken"));
        list.add(new RecepiModel(R.drawable.desert,"Desert"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));
        list.add(new RecepiModel(R.drawable.chicagopizza,"Cheese Pizza"));

        RecepiAdapter adapter=new RecepiAdapter(list,this);
        recyclerview.setAdapter(adapter);

        StaggeredGridLayoutManager staggered=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerview.setLayoutManager(staggered);

//        LinearLayoutManager linear=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerview.setLayoutManager(linear);

//        GridLayoutManager grid=new GridLayoutManager(this,2);
//        recyclerview.setLayoutManager(grid);

//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        recyclerview.setLayoutManager(layoutManager);

    }
}