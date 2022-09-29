package com.main.Study.CodeTest;

public class IntegerToRoman {
    public static void main(String[] args){
        int num = 2994;
        System.out.println("INPUT : "+num);
        String result = integerToRoman(num);
        System.out.println("OUTPUT : "+result);
    }

    // 1 <= num <= 3999
    //https://www.javatpoint.com/convert-integer-to-roman-numerals-in-java
    public static String integerToRoman(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        for(int i=0;i<values.length;i++) {
            while(num >= values[i])
            {
                num = num - values[i];
                result += romanLetters[i];
            }
        }

        return result;
    }
}
