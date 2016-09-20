package com.dic.kimxeang.listviewshow;

import android.os.StrictMode;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] array = {"Iphone", "Samsung", "Blcakberry", "Huawei", "Nokie", "Unbutu",
            "Window7", "WebOS", "Mac OS X", "Iphone", "Samsung",
            "Blcakberry", "Huawei", "Nokie", "Unbutu", "Window7", "WebOS", "Mac OS X",
            "Blcakberry", "Huawei", "Nokie", "Unbutu", "Window7", "WebOS", "Mac OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.listview_activity, array);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Item"+" -- "+ array[position].toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
