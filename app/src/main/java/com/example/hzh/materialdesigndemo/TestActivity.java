package com.example.hzh.materialdesigndemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hzh on 2016/11/16.
 */

public class TestActivity extends AppCompatActivity{
    private Button testCoordinatorBtn;
    private FloatingActionButton fab ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        testCoordinatorBtn = (Button) findViewById(R.id.button2);
        fab = (FloatingActionButton) findViewById(R.id.fab_test);

        testCoordinatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(fab,"test",Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
