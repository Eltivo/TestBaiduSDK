package com.eltivo.testbaidusdk.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.eltivo.testbaidusdk.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView functionList = findViewById(R.id.list_all_function);
        functionList.setAdapter(new ArrayAdapter<String>(this, R.layout.list_all_function_item, getData()));
        functionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Class<?> targetClass = null;
                switch(position) {
                    case 0:
                        targetClass = TestLocActivity.class;
                        break;
                    case 1:
                        targetClass = TestMapActivity.class;
                        break;
                    default:
                        break;
                }
                if (targetClass != null) {
                    Intent intent = new Intent(MainActivity.this, targetClass);
                    intent.putExtra("from", 0);
                    startActivity(intent);
                }
            }
        });
    }

    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        data.add("Loc Test");
        data.add("Map Test");
        return data;
    }
}

