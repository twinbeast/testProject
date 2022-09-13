package com.main.Util;

public class StringUtil {

    public String tapString(int tapCount){
        String result = "";
        for(int i=1; i<=tapCount; i++)
            result += "\t";
        return result;
    }
}
