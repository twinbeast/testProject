package com.main.Study.Oop.OpenClosed;

import com.main.Study.Oop.OpenClosed.Card.CardA;
import com.main.Study.Oop.OpenClosed.Card.CardD;
import com.main.Study.Oop.OpenClosed.Pos.NewPos;
import com.main.Study.Oop.OpenClosed.Pos.OldPos;

public class OpenClosedTestClass {
    /**
     * 개방-폐쇄 원칙
     * 객체의 확장은 개방적으로
     * 객체의 수정은 폐쇄적으로
     * 라이브러리 처럼 객체의 코드를 변경해도 라이브러리 코드가 바뀌진 않아야 한다
     * https://blog.itcode.dev/posts/2021/08/14/open-closed-principle
     */
    public static void main(String[] args){
        CardA card = new CardA();

        OldPos oldPos = new OldPos();
        oldPos.purchase(card, "A", 5000);   // A 카드 5000원 구매

        CardD newCard = new CardD();
        oldPos.purchase(newCard, "D", 1000);

        NewPos newPos = new NewPos();
        newPos.purchase(newCard, 1000);

    }
}
