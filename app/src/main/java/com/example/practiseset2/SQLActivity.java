package com.example.practiseset2;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class SQLActivity extends AppCompatActivity {
    Button add,viewall;
    EditText ed_amt,ed_date;
    Switch s;
    ListView ls;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sql_activity);
        //we are calling the constructor
        add=findViewById(R.id.add);
        viewall=findViewById(R.id.view);
        ed_amt=findViewById(R.id.amt);
        ed_date=findViewById(R.id.date_entered);
        s=findViewById(R.id.switch1);
        ls=findViewById(R.id.listView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //to get into application we have to call constructor
                CustomerModel cm = new CustomerModel(ed_date.getText().toString(),Integer.parseInt(ed_amt.getText().toString()),s.isChecked(),Integer.parseInt(ed_amt.getText().toString())*5);
                Connection_Helper helper = new Connection_Helper(SQLActivity.this);
                try {

                    boolean success = helper.addOne(cm);
                    Toast.makeText(SQLActivity.this, "Success= "+ success ,Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(SQLActivity.this, "Failure", Toast.LENGTH_LONG).show();
                }
            }
        });
        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connection_Helper ch= new Connection_Helper(SQLActivity.this);
                List<CustomerModel> everyone = ch.getEveryone();
                ArrayAdapter cra = new ArrayAdapter<CustomerModel>(SQLActivity.this, android.R.layout.simple_list_item_1,everyone);
                ls.setAdapter(cra);
            }
        });
    }
}
