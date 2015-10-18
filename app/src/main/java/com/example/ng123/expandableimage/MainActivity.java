package com.example.ng123.expandableimage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        setContentView(R.layout.activity_main);
        btshow = (FloatingActionButton) findViewById(R.id.Addbutton);
        btshow.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View v){
                Intent i= new Intent(MainActivity.this,TaskTemplate.class);
                startActivity(i);
            }
        });

        ExpandableListView elv=(ExpandableListView) findViewById(R.id.expandableListView);
        final ArrayList<Task> task=getData();
        CustomAdapter adapter=new CustomAdapter(this, task);
        elv.setAdapter(adapter);

        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                Toast.makeText(getApplicationContext(), task.get(groupPosition).task_option.get(childPosition), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
        private ArrayList<Task> getData()
        {
            Task t1=new Task("Grocery Shopping");
            t1.task_option.add("Edit");
            t1.task_option.add("Complete");

            Task t2=new Task("Submit documents");
            t2.task_option.add("Edit");
            t2.task_option.add("Complete");

            ArrayList<Task> allTasks=new ArrayList<Task>();
            allTasks.add(t1);
            allTasks.add(t2);
            return allTasks;
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
