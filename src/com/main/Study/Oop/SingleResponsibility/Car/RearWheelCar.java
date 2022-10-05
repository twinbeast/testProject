package com.main.Study.Oop.SingleResponsibility.Car;


/**
 * 후륜차 객체
 *
 * @author RWB
 * @since 2021.08.13 Fri 01:05:57
 */
public class RearWheelCar extends newCar {
    /**
     * RearWheelCar 생성자 함수
     *
     * @param wd: [String] 휠 구동 방식
     */
    public RearWheelCar(String wd) {
        super(wd);
    }

    /**
     * 주행 함수
     *
     * @param power: [int] 동력
     */
    @Override
    public void run(int power) {
        WHEEL[2] = power;
        WHEEL[3] = power;

        System.out.println(WD+"휠 동력 상태: " + WHEEL[0] + ", " + WHEEL[1] + ", " + WHEEL[2] + ", " + WHEEL[3]);
    }
}
