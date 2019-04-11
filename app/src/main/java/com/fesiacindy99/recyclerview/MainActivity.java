package com.fesiacindy99.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataSet = new ArrayList<>();
        initDataset();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(this, dataSet);
        rvView.setAdapter(adapter);
    }

    private void initDataset(){
        dataSet.add("Fesia Cindy Raverti");
        dataSet.add("Ferra Rindy Alfianita");
        dataSet.add("Muhammad Zulfikar");
        dataSet.add("Yuliana Agustin");
        dataSet.add("Qibti Inayatul Arfi");
        dataSet.add("Septian Kurnia Putra");
    }
}
