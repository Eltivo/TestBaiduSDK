package com.eltivo.testbaidusdk.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }

    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        data.add("Loc Test");
        data.add("Map Test");
        return data;
    }
}

