package com.example.practiseset2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    List<Model> items;
    Context context;

    public MyAdapter(List<Model> items, Context context) {
        this.items = items;
        this.context = context;
    }



    @NonNull
    @Override
    //when instance of ViewHolder Class is created
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.order,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model item=items.get(position);
        holder.date.setText(item.getDate());
        holder.order_.setText(item.getOrder());
        holder.price.setText(item.getPrice());
        holder.quantity.setText(item.getQuantity() );
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView order_;
        public TextView quantity;
        public TextView price;
        public TextView date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            order_ = itemView.findViewById(R.id.orderno);
            quantity = itemView.findViewById(R.id.quantity);
            price = itemView.findViewById(R.id.price);
            date = itemView.findViewById(R.id.date);
            }
    }
}
