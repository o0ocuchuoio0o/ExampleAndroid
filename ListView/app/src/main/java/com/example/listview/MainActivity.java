package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItems = (ListView)findViewById(R.id.lv_items);

        //1. Prepare data to binding for ListView
        List<String> data = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            data.add("Item " + i);
        }
        //2. Create Adapter with data and row
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        //3. Set Adapter for ListView
        lvItems.setAdapter(adapter);
    }
}
