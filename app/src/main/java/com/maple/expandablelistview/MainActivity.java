package com.maple.expandablelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.maple.expandablelistview.library.ExpandableLayoutListView;

/**
 * @author maple
 * @time 2018/9/7.
 */
public class MainActivity extends AppCompatActivity {


    private String[] array = {"Hello", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome"};

    ExpandableLayoutListView expandableLayoutListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableLayoutListView = (ExpandableLayoutListView) findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.view_row, R.id.header_text, array);

        expandableLayoutListView.setAdapter(arrayAdapter);
    }

}
