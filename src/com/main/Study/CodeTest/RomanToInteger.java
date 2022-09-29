package com.main.Study.CodeTest;

public class RomanToInteger {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println("request : "+s);
        int result = romanToInt2(s);
        System.out.println("result : "+result);
    }

    public static int romanToInt2(String s){
        String[] array = s.split("");
        int result = 0;

        for (int cnt = array.length-1; cnt>=0; cnt--){
            String sl = array[cnt];
            String sp;
            int nl = alphabetToInteger(sl);
            int np;

            if(cnt>0){
                sp = array[cnt-1];
                np = alphabetToInteger(sp);
                if(np<nl){
                    result += nl-np;
                    System.out.println(sp+sl+" : "+(nl-np));
                    cnt -= 1;
                }else{
                    result += nl;
                    System.out.println(sl+" : "+nl);
                }
            }else{
                result += nl;
                System.out.println(sl+" : "+nl);
            }
        }

        return result;
    }

    public static int romanToInt(String s) {
        String[] array = s.split("");

        int result = 0;
        for(int i=0; i<array.length; i++){
            int j = alphabetToInteger(array[i]);
            if(i>0){
                int k = alphabetToInteger(array[i-1]);
                if(k<j) {
                    j = j - k;
                    System.out.println(array[i-1]+array[i] + " : "+j);
                    result -= k;
                }else
                    System.out.println(array[i]+" : "+j);
            }else {
                System.out.println(array[i] + " : "+j);
            }
            result += j;
        }
        return result;
    }

    public static int alphabetToInteger(String s){
        int j = 0;
        switch (s){
            case "I" :
                j += 1;
                break;
            case "V" :
                j += 5;
                break;
            case "X" :
                j += 10;
                break;
            case "L" :
                j += 50;
                break;
            case "C" :
                j += 100;
                break;
            case "D" :
                j += 500;
                break;
            case "M" :
                j += 1000;
                break;
        }
        return j;
    }
}