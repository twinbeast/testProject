package com.main.Study.Oop.SingleResponsibility;

import com.main.Study.Oop.SingleResponsibility.Car.*;

public class SingleResponsibilityTestClass {
    /**
     * 단일 책임 원칙
     * 하나의 객체는 반드시 하나의 동작만의 책임을 갖는다.
     * 모듈화가 강해질수록 다른 객체와의 의존/연관성이 줄어든다.
     * 객체의 책임이 많아질수록 해당 객체의 변경에 따른 영향도의 양과 범위가 커진다.
     * 객체의 책임 의존성 과중을 줄이기 위함
     */
    public static void main(String[] args){
        Car fwdCar = new Car("FWD");
        fwdCar.run(1);
        Car rwdCar = new Car("RWD");
        rwdCar.run(1);
        Car awdCar = new Car("AWD");
        awdCar.run(1);

        // Car 하나의 책임이 과중하므로 책임을 줄이기 위해 각각의 객체를 둔다...?
        // 다른 종류의 Car 가 추가 될때 마다 객체를 만들어줘야 한다...?

        newCar newFwdCar = new FrontWheelCar("fwd");
        newFwdCar.run(1);
        newCar newRwdCar = new RearWheelCar("rwd");
        newRwdCar.run(1);
        newCar newAwdCar = new AllWheelCar("awd");
        newAwdCar.run(1);
    }
}
