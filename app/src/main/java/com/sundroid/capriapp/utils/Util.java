package com.sundroid.capriapp.utils;

import android.content.res.Resources;
import android.widget.EditText;

/**
 * Created by sunil on 17-10-2017.
 */

public class Util {
    public static boolean validateEdits(EditText... editTexts){
        for (EditText editText:editTexts){
            if(editText.getText().toString().length()==0){
                return false;
            }
        }
        return true;
    }
    public static int dp(float value) {
        return (int) Math.ceil(1 * value);
    }

    public static int dpToPx(int dp)
    {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int pxToDp(int px)
    {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }
}
