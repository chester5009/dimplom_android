package com.diplom.chester.diplomandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class result_layout extends AppCompatActivity {

    GridView gridView;
    ArrayAdapter<String> adapter;
    String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_layout);

    }
    private void adjustGridView() {
        gridView.setNumColumns(6);
    }
}
