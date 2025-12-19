package com.xworkz.iplbiddingapp.utility;

public class NumberValidation {
    private NumberValidation(){

    }

    public static int parseIntSafe(String value){
        if (value==null || value.trim().isEmpty()){
            return 0;
        }
        return Integer.parseInt(value);
    }

    public static double parseDoubleSafe(String value){
        if (value==null || value.trim().isEmpty()){
            return 0;
        }
        return Double.parseDouble(value);
    }

    public static long parseLongSafe(String value){
        if (value==null || value.trim().isEmpty()){
            return 0;
        }
        return Long.parseLong(value);
    }
}
