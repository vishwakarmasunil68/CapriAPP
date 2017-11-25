package com.sundroid.capriapp.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.sundroid.capriapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.btn_submit)
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(RegisterActivity.this,OTPActivity.class));
                showOtpDialog();
            }
        });
    }

    public void showOtpDialog(){
        final Dialog dialog1 = new Dialog(this, android.R.style.Theme_DeviceDefault_Light_Dialog);
        dialog1.setCancelable(true);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE); //before
        dialog1.setContentView(R.layout.dialog_otp);
        dialog1.show();
        dialog1.setCancelable(true);
        Window window = dialog1.getWindow();
        window.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);



        final EditText et_otp=dialog1.findViewById(R.id.et_otp);
        final ImageView iv_close=dialog1.findViewById(R.id.iv_close);
        Button btn_submit=dialog1.findViewById(R.id.btn_submit);


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(et_otp.getText().toString().length()>0){
//
//                }
                showConfirmPasswordDialog();
                dialog1.dismiss();
            }
        });

        iv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.dismiss();
            }
        });

    }

    public void showConfirmPasswordDialog(){
        final Dialog dialog1 = new Dialog(this, android.R.style.Theme_DeviceDefault_Light_Dialog);
        dialog1.setCancelable(true);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE); //before
        dialog1.setContentView(R.layout.dialog_password);
        dialog1.show();
        dialog1.setCancelable(true);
        Window window = dialog1.getWindow();
        window.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        Button btn_submit=dialog1.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,PatientDashBoardActivity.class));
            }
        });


    }
}
