package com.main.Study.Oop.OpenClosed;

/**
 * 결제 인터페이스
 *
 * @author RWB
 * @since 2021.08.14 Sat 02:28:22
 */
public interface Purchasable
{
    /**
     * 카드사 정보 전송 및 결과 반환 함수
     *
     * @param price: [int] 금액
     *
     * @return [boolean] 전송 결과
     */
    boolean send(int price);
}

