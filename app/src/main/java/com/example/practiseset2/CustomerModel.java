package com.example.practiseset2;

import android.widget.Button;

public class CustomerModel {
     public String date;
     public int amt;
     public Boolean isdelivered;
     public int orderid;

     public String getDate() {
          return date;
     }

     public int getAmt() {
          return amt;
     }

     public Boolean getIsdelivered() {
          return isdelivered;
     }

     public int getID() {
          return orderid;
     }

     public void setDate(String date) {
          this.date = date;
     }

     public void setAmt(int amt) {
          this.amt = amt;
     }

     public void setIsdelivered(Boolean isdelivered) {
          this.isdelivered = isdelivered;
     }
     //for printing the contents toString is neccessary
     @Override
     public String toString() {
          return "CustomerModel{" +
                  "date='" + date + '\'' +
                  ", amt=" + amt +
                  ", isdelivered=" + isdelivered +
                  ", orderid=" + orderid +
                  '}';
     }

     public void setOrderid(int orderid) {
          this.orderid = orderid;
     }

     //constructor pops when new order takes place
     public CustomerModel(String date, int amt, Boolean isdelivered, int orderid) {
          this.date = date;
          this.amt = amt;
          this.isdelivered = isdelivered;
          this.orderid = orderid;
     }

}

