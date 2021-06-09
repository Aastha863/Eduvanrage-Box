package com.example.practiseset2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    public RecyclerView rv;
    public RecyclerView.Adapter ad;
    int val;
    public List<Model> ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView p,qty;
        Intent intent=getIntent();
        val=intent.getIntExtra("Quantity",0);
        qty=findViewById(R.id.quantityh);
        p=findViewById(R.id.priceh);
        String qt,am;
        qt="Amount - "+val;
        am="Price - "+(val*5);
        qty.setText(qt);
        p.setText(am);

        rv= findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        ls = new ArrayList<>();
        for(int i=2;i<=20;i++)
        {
            Model l = new Model("Order No"+(i),"Quantity"+(i*3-3),"Rs. "+((i*3-3)*5),i+"-05-2021");
            ls.add(l);
        }
        ad = new MyAdapter(ls,this);
        rv.setAdapter(ad);
    }

}