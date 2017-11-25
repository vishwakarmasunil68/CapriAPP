package com.sundroid.capriapp.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sundroid.capriapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PatientDashBoardActivity extends AppCompatActivity {

    @BindView(R.id.rl_book_appointment)
    RelativeLayout rl_book_appointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_dash_board);
        ButterKnife.bind(this);

        rl_book_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPatientDiagonseDialog();
            }
        });
    }

    public void showPatientDiagonseDialog(){
        final Dialog dialog1 = new Dialog(this, android.R.style.Theme_DeviceDefault_Light_Dialog);
        dialog1.setCancelable(true);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE); //before
        dialog1.setContentView(R.layout.dialog_diagnose);
        dialog1.show();
        dialog1.setCancelable(true);
        Window window = dialog1.getWindow();
        window.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        TextView tv_questionaire=dialog1.findViewById(R.id.tv_questionaire);
        tv_questionaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatientDashBoardActivity.this,QuestionaireActivity.class));
            }
        });

    }
}
