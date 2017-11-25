package com.sundroid.capriapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sundroid.capriapp.activity.GraphActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_adl)
    Button btn_adl;
    @BindView(R.id.btn_ankle)
    Button btn_ankle;
    @BindView(R.id.btn_back)
    Button btn_back;
    @BindView(R.id.btn_elbow)
    Button btn_elbow;
    @BindView(R.id.btn_knee)
    Button btn_knee;
    @BindView(R.id.btn_pain)
    Button btn_pain;
    @BindView(R.id.btn_shoulder)
    Button btn_shoulder;
    @BindView(R.id.btn_womac)
    Button btn_womac;
    @BindView(R.id.btn_wrist)
    Button btn_wrist;
    @BindView(R.id.btn_graph)
    Button btn_graph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn_adl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AdlActivity.class));
            }
        });
        btn_ankle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AnkleFootActivity.class));
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BackActivity.class));
            }
        });
        btn_elbow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ElbowActivity.class));
            }
        });
        btn_knee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, KneeActivity.class));
            }
        });
        btn_pain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PaintActivity.class));
            }
        });
        btn_shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShoulderActivity.class));
            }
        });
        btn_womac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WOMACActivity.class));
            }
        });
        btn_wrist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WristHandActivity.class));
            }
        });
        btn_graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GraphActivity.class));
            }
        });

    }
}
