package com.example.minigame.utils;

/**
 * String工具类
 */
public class StringUtils {
    public static Boolean isNotBlank(String str){
        int length;
        if (str != null && (length = str.length()) != 0) {
            for(int i = 0; i < length; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
