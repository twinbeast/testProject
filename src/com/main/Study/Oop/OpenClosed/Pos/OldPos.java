package com.main.Study.Oop.OpenClosed.Pos;

import com.main.Study.Oop.OpenClosed.Card.CardA;
import com.main.Study.Oop.OpenClosed.Card.CardB;
import com.main.Study.Oop.OpenClosed.Card.CardC;

/**
 * 포스 클래스
 *
 * @author RWB
 * @since 2021.08.14 Sat 02:10:12
 */
public class OldPos {
    /**
     * 결제 및 결과 반환 함수
     *
     * @param card : [Object] 카드 객체
     * @param name : [String] 카드사명
     * @param price: [int] 금액
     *
     * @return [boolean] 결제 결과
     */
    public boolean purchase(Object card, String name, int price) {
        boolean result;

        switch (name.toUpperCase()) {
            case "A" :
                result = ((CardA) card).send(price);
                break;
            case "B" :
                result = ((CardB) card).send(price);
                break;
            case "C" :
                result = ((CardC) card).send(price);
                break;

            // 새로운 카드가 생길 때마다 추가해야함...

            default : {
                System.out.println("유효하지 않은 카드사");
                result = false;
            }
        }

        return result;
    }
}

