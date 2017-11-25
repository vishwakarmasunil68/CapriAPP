package com.sundroid.capriapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sundroid.capriapp.MainActivity;
import com.sundroid.capriapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuestionaireActivity extends AppCompatActivity {

    @BindView(R.id.btn_submit)
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionaire);
        ButterKnife.bind(this);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuestionaireActivity.this, MainActivity.class));
            }
        });
    }
}
