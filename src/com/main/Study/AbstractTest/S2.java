package com.main.Study.AbstractTest;
/**
 * S2 객체
 *
 * @author RWB
 * @since 2021.08.16 Mon 17:13:27
 */
public class S2 extends SmartPhone
{
    /**
     * 문자 메시지 전송 함수
     *
     * @param number: [String] 번호
     * @param text: [String] 내용
     */
    @Override
    public void message(String number, String text)
    {
//        System.out.println("In S2");

        super.message(number, "In S2 "+text);
    }
}

