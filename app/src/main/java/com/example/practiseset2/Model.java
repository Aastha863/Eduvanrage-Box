package com.example.practiseset2;

public class Model {
    public String order;
    public String quantity;
    public String price;
    public String date;

    public Model(String order, String quantity, String price, String date) {
        this.order = order;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    public String getOrder() {
        return order;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }
}
