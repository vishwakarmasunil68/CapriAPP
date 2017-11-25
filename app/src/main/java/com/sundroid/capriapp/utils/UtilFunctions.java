package com.sundroid.capriapp.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.widget.RadioButton;

import com.sundroid.capriapp.view.ToggleButtonGroupTableLayout;

/**
 * Created by sunil on 14-11-2017.
 */

public class UtilFunctions {
    public static boolean isServiceRunning(String serviceName, Context context) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for(ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if(serviceName.equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static String getCheckedRadio(Activity activity, ToggleButtonGroupTableLayout tooToggleButtonGroupTableLayout){
        if(tooToggleButtonGroupTableLayout.getCheckedRadioButtonId()!=-1){
            return ((RadioButton)activity.findViewById(tooToggleButtonGroupTableLayout.getCheckedRadioButtonId())).getText().toString();
        }else{
            return "";
        }
    }
}
