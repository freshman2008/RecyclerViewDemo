package com.example.gd001.recyclerviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_gird_view;
    private Button btn_list_view;
    private Button btn_staggered_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_list_view = (Button) findViewById(R.id.btn_list_view);
        btn_gird_view = (Button) findViewById(R.id.btn_gird_view);
        btn_staggered_view = (Button) findViewById(R.id.btn_staggered_view);

        btn_list_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        btn_gird_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GirdViewActivity.class);
                startActivity(intent);
            }
        });

        btn_staggered_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StaggeredGridViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
