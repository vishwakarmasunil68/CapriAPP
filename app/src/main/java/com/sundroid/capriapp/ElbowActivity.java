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

public class ElbowActivity extends AppCompatActivity {

    @BindView(R.id.tbgt1)
    ToggleButtonGroupTableLayout tbgt1;
    @BindView(R.id.tbgt2)
    ToggleButtonGroupTableLayout tbgt2;
    @BindView(R.id.tbgt3)
    ToggleButtonGroupTableLayout tbgt3;
    @BindView(R.id.tbgt4)
    ToggleButtonGroupTableLayout tbgt4;
    @BindView(R.id.tbgt5)
    ToggleButtonGroupTableLayout tbgt5;
    @BindView(R.id.tbgt6)
    ToggleButtonGroupTableLayout tbgt6;
    @BindView(R.id.tbgt7)
    ToggleButtonGroupTableLayout tbgt7;
    @BindView(R.id.tbgt8)
    ToggleButtonGroupTableLayout tbgt8;
    @BindView(R.id.tbgt9)
    ToggleButtonGroupTableLayout tbgt9;
    @BindView(R.id.tbgt10)
    ToggleButtonGroupTableLayout tbgt10;
    @BindView(R.id.tbgt11)
    ToggleButtonGroupTableLayout tbgt11;
    @BindView(R.id.tbgt12)
    ToggleButtonGroupTableLayout tbgt12;
    @BindView(R.id.tbgt13)
    ToggleButtonGroupTableLayout tbgt13;
    @BindView(R.id.tbgt14)
    ToggleButtonGroupTableLayout tbgt14;
    @BindView(R.id.tbgt15)
    ToggleButtonGroupTableLayout tbgt15;
    @BindView(R.id.btn_submit)
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elbow);
        ButterKnife.bind(this);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = checkValues();
                if (score != -1) {
                    Log.d(TagUtils.getTag(), "scores:-" + score);
                } else {
                    Log.d(TagUtils.getTag(), "Please select all fields");
                }
            }
        });
    }

    public int checkValues() {
        int score = 0;

        if (getSelectedToggleButtonValue(tbgt1).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt1));
        }
        if (getSelectedToggleButtonValue(tbgt2).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt2));
        }
        if (getSelectedToggleButtonValue(tbgt3).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt3));
        }
        if (getSelectedToggleButtonValue(tbgt4).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt4));
        }
        if (getSelectedToggleButtonValue(tbgt5).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt5));
        }
        if (getSelectedToggleButtonValue(tbgt6).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt6));
        }
        if (getSelectedToggleButtonValue(tbgt7).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt7));
        }
        if (getSelectedToggleButtonValue(tbgt8).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt8));
        }
        if (getSelectedToggleButtonValue(tbgt9).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt9));
        }
        if (getSelectedToggleButtonValue(tbgt10).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt10));
        }
        if (getSelectedToggleButtonValue(tbgt11).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt11));
        }
        if (getSelectedToggleButtonValue(tbgt12).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt12));
        }
        if (getSelectedToggleButtonValue(tbgt13).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt13));
        }
        if (getSelectedToggleButtonValue(tbgt14).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt14));
        }
        if (getSelectedToggleButtonValue(tbgt15).equals("")) {
            return -1;
        } else {
            score = score + checkToggleScore(getSelectedToggleButtonValue(tbgt15));
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
            case "Normal":
                return 4;
            case "Mild Compromise":
                return 3;
            case "Difficulty":
                return 2;
            case "With Aid":
                return 1;
            case "Unable":
                return 0;
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
