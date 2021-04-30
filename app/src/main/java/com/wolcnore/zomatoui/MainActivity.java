package com.wolcnore.zomatoui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView rcv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();


        FoodData[] myListData = new FoodData[] {
                new FoodData("Healthy", R.drawable.fa),
                new FoodData("Biryani", R.drawable.fb),
                new FoodData("Chicken", R.drawable.fc),
                new FoodData("Pizza", R.drawable.fd),
                new FoodData("Samosa", R.drawable.fe),
                new FoodData("Idli", R.drawable.ff),
                new FoodData("Sandwich", R.drawable.fg),
                new FoodData("Dosa", R.drawable.fh),
        };


        GridLayoutManager linearLayoutManager=new GridLayoutManager(this,4);
        rcv.setLayoutManager(linearLayoutManager);


        rcv.setAdapter(new foodAdapter(myListData));


    }

    private void initUI() {
        rcv=findViewById(R.id.rcv);
    }
}