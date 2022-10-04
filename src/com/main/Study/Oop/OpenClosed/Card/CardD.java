package com.main.Study.Oop.OpenClosed.Card;

import com.main.Study.Oop.OpenClosed.Purchasable;

public class CardD implements Purchasable  {
    /**
     *
     * @param price: [int] 금액
     *
     * @return
     */
    @Override
    public boolean send(int price) {
        System.out.println(getClass().getSimpleName() + " " + price + "원 결제 요청");
        return true;
    }
}
