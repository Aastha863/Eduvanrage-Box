package com.example.practiseset2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int quantity =3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        calculateprice(quantity,5);
    }

    private void calculateprice(int price,int cost) {
        price=quantity*cost;
        TextView viewprice = findViewById(R.id.calcprice);
        viewprice.setText("The total price is"+" "+price);
    }

    public void decrement(View view)
     {
         quantity=quantity-1;
         display(quantity);
     }
    public void increment(View view)
    {
        quantity=quantity+1;
        display(quantity);
    }

    public void display(int number) {
        TextView quant = (TextView) findViewById(R.id.qty);
        quant.setText(String.valueOf(number));
    }

        public void nextActivity(View view) {
            Intent intent= new Intent(MainActivity.this,LaunchActivity.class) ;
            intent.putExtra("Quantity",quantity);
            startActivity(intent);
        }

}