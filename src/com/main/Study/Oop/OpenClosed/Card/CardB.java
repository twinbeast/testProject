package com.main.Study.Oop.OpenClosed.Card;

import com.main.Study.Oop.OpenClosed.Purchasable;

/**
 * B 카드 객체
 *
 * @author RWB
 * @since 2021.08.14 Sat 02:38:00
 */
public class CardB implements Purchasable {
    /**
     * 카드사 정보 전송 및 결과 반환 함수
     *
     * @param price: [int] 금액
     *
     * @return [boolean] 전송 결과
     */
    @Override
    public boolean send(int price) {
        System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
        return true;
    }
}
