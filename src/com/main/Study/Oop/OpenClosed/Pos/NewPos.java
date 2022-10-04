package com.main.Study.Oop.OpenClosed.Pos;

import com.main.Study.Oop.OpenClosed.Purchasable;

/**
 * 포스 클래스
 *
 * @author RWB
 * @since 2021.08.14 Sat 02:10:12
 */
public class NewPos
{
    /**
     * 결제 및 결과 반환 함수
     *
     * @param purchasable : [Purchasable] Purchasable 인터페이스
     * @param price: [int] 금액
     *
     * @return [boolean] 결제 결과
     */
    public boolean purchase(Purchasable purchasable, int price)
    {
        return purchasable.send(price);
    }
}

