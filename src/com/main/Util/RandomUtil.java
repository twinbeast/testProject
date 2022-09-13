package com.main.Util;

import java.util.Random;

public class RandomUtil {

    // 알파벳인 랜덤 문자열 생성
    public String randomOnlyString(int targetStringLength){
        int leftLimit = 97;         // letter 'a'
        int rightLimit = 122;       // letter 'z'
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    // 숫자인 랜덤 문자열 생성
    public String randomOnlyNumeral(int targetStringLength){
        int leftLimit = 48;         // numeral '0'
        int rightLimit = 57;        // numeral '9'
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    // 숫자 + 문자인 랜덤 문자열 생성
    public String randomString(int targetStringLength){
        int leftLimit = 48;         // numeral '0'
        int rightLimit = 122;       // letter 'z'
        Random random = new Random();

        String generatedString = random.ints(leftLimit,rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
