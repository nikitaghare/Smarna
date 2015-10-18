package com.example.ng123.expandableimage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by ng123 on 10/16/2015.
 */
public class TaskTemplate extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.task_template);
//    }

        GridView grid;
        String[] web = {
                "Buy groceries",
                "Meet someone",
                "Submit documents",
                "Take out cash",
                "Printshop",
                "Visit the library",
                "Go shopping",
                "Refuel vehical",
                "Custom Task"
        };
        int[] imageId = {
            R.drawable.shopping_basket,
            R.drawable.person,
                R.drawable.description,
                R.drawable.local_atm,
                R.drawable.local_printshop,
                R.drawable.local_library,
                R.drawable.local_mall,
                R.drawable.gas_station,
                R.drawable.ic_c

    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.task_template);

//        ImageAdapter adapter = new ImageAdapter(TaskTemplate.this, web, imageId);
//        GridView gridview = (GridView) findViewById(R.id.grid);
//        grid.setAdapter(adapter);


         GridView gridView = new GridView(this);
         gridView.setNumColumns(3);
        setContentView(gridView);
        ImageAdapter adapt = new ImageAdapter(TaskTemplate.this, web, imageId);
        gridView.setAdapter(adapt);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(TaskTemplate.this, "You selected" + web[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
