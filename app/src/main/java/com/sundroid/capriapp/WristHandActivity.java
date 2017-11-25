package com.sundroid.capriapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.sundroid.capriapp.utils.TagUtils;
import com.sundroid.capriapp.view.ToggleButtonGroupTableLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WristHandActivity extends AppCompatActivity {

    @BindView(R.id.tbgt_door_knob1)
    ToggleButtonGroupTableLayout tbgt_door_knob1;
    @BindView(R.id.tbgt_door_knob2)
    ToggleButtonGroupTableLayout tbgt_door_knob2;
    @BindView(R.id.tbgt_door_knob3)
    ToggleButtonGroupTableLayout tbgt_door_knob3;
    @BindView(R.id.tbgt_door_knob4)
    ToggleButtonGroupTableLayout tbgt_door_knob4;
    @BindView(R.id.tbgt_door_knob5)
    ToggleButtonGroupTableLayout tbgt_door_knob5;
    @BindView(R.id.tbgt_door_knob6)
    ToggleButtonGroupTableLayout tbgt_door_knob6;
    @BindView(R.id.tbgt_door_knob7)
    ToggleButtonGroupTableLayout tbgt_door_knob7;
    @BindView(R.id.tbgt_door_knob8)
    ToggleButtonGroupTableLayout tbgt_door_knob8;
    @BindView(R.id.tbgt_door_knob9)
    ToggleButtonGroupTableLayout tbgt_door_knob9;
    @BindView(R.id.tbgt_door_knob10)
    ToggleButtonGroupTableLayout tbgt_door_knob10;
    @BindView(R.id.tbgt_door_knob11)
    ToggleButtonGroupTableLayout tbgt_door_knob11;
    @BindView(R.id.tbgt_door_knob12)
    ToggleButtonGroupTableLayout tbgt_door_knob12;

    @BindView(R.id.btn_submit)
    Button btn_submit;
    @BindView(R.id.rg1)
    RadioGroup rg1;
    @BindView(R.id.rg2)
    RadioGroup rg2;
    @BindView(R.id.rg3)
    RadioGroup rg3;
    @BindView(R.id.rg4)
    RadioGroup rg4;
    @BindView(R.id.rg5)
    RadioGroup rg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrist_hand);
        ButterKnife.bind(this);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.d(TagUtils.getTag(), "selected id text:-" + tbgt_door_knob1.getCheckedRadioButtonId());
                int score=checkValues();
                if(score!=-1){
                    Log.d(TagUtils.getTag(),"scores:-"+score);
                }else{
                    Log.d(TagUtils.getTag(),"Please select all fields");
                }
            }
        });
    }

    public int checkValues() {
        int score=0;
        if(getSelectedRadioButtonValue(rg1).equals("")){
            return -1;
        }else{
            score=score+checkRadioScore(getSelectedRadioButtonValue(rg1));
        }

        if(getSelectedRadioButtonValue(rg2).equals("")){
            return -1;
        }else{
            score=score+checkRadioScore(getSelectedRadioButtonValue(rg2));
        }

        if(getSelectedRadioButtonValue(rg3).equals("")){
            return -1;
        }else{
            score=score+checkRadioScore(getSelectedRadioButtonValue(rg3));
        }

        if(getSelectedRadioButtonValue(rg4).equals("")){
            return -1;
        }else{
            score=score+checkRadioScore(getSelectedRadioButtonValue(rg4));
        }

        if(getSelectedRadioButtonValue(rg5).equals("")){
            return -1;
        }else{
            score=score+checkRadioScore(getSelectedRadioButtonValue(rg5));
        }

        if(getSelectedToggleButtonValue(tbgt_door_knob1).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob1));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob2).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob2));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob3).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob3));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob4).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob4));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob5).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob5));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob6).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob6));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob7).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob7));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob8).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob8));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob9).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob9));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob10).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob10));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob11).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob11));
        }
        if(getSelectedToggleButtonValue(tbgt_door_knob12).equals("")){
            return -1;
        }else{
            score=score+checkToggleScore(getSelectedToggleButtonValue(tbgt_door_knob12));
        }

        return score;
    }

    public String getSelectedRadioButtonValue(RadioGroup radioGroup) {
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
            return radioButton.getText().toString();
        } else {
            return "";
        }
    }
    public String getSelectedToggleButtonValue(ToggleButtonGroupTableLayout radioGroup) {
        if (radioGroup.getCheckedRadioButtonId() != -1) {
            RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
            return radioButton.getText().toString();
        } else {
            return "";
        }
    }

    public int checkToggleScore(String radio_text) {
        switch (radio_text) {
            case "Not at all difficult":
                return 5;
            case "A little difficult":
                return 4;
            case "Somewhat difficult":
                return 3;
            case "Moderately difficult":
                return 2;
            case "Very difficult":
                return 1;
            default:
                return -1;
        }
    }
    public int checkRadioScore(String radio_text) {
        switch (radio_text) {
            case "V. Good":
                return 5;
            case "Good":
                return 4;
            case "Fair":
                return 3;
            case "Poor":
                return 2;
            case "V.Poor":
                return 1;
            default:
                return -1;
        }
    }
}
