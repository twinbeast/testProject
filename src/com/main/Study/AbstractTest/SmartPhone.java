package com.main.Study.AbstractTest;
/**
 * 스마트폰 객체
 *
 * @author RWB
 * @since 2021.08.16 Mon 16:48:03
 */
public class SmartPhone
{
    /**
     * 통화 함수
     *
     * @param number: [String] 번호
     */
    public void call(String number)
    {
        System.out.println(number + " 통화 연결");
    }

    /**
     * 문자 메시지 전송 함수
     *
     * @param number: [String] 번호
     * @param text: [String] 내용
     */
    public void message(String number, String text)
    {
        System.out.println(number + ": " + text);
    }
}

