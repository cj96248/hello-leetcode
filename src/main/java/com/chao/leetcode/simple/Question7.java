package com.chao.leetcode.simple;

/**
 * 整数反转
 */
public class Question7 {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }

    public static int reverse(int x) {
        String result = "";
        String s = String.valueOf(x);
        if(x >= 0){
            for(int i= 0; i< s.length(); i++){
                char c = s.charAt(i);
                result = c + result;
            }
        }
        if(x < 0){
            for(int i= 1; i< s.length(); i++){
                char c = s.charAt(i);
                result = c + result;
            }
            result = "-"+ result;
        }
        try {
            return Integer.parseInt(result);
        }catch (Exception e){
            return 0;
        }

    }
}
