package com.example.practiseset2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LaunchActivity extends AppCompatActivity {
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        TextView p,qty;
        Intent intent=getIntent();
        qty=findViewById(R.id.textView3);
        p=findViewById(R.id.textView4);
        value=intent.getIntExtra("Quantity",0);
        String qt,am;
        qt="Amount - "+value;
        am="Price - "+(value*5);
        qty.setText(qt);
        p.setText(am);

    }
    public void recycleActivity(View view) {
        Intent i= new Intent(LaunchActivity.this,MainActivity2.class) ;
        i.putExtra("Quantity",value);
        startActivity(i);
    }

}