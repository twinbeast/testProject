package com.main.Study.Oop.SingleResponsibility.Car;

/**
 * 자동차 추상 객체
 *
 * @author RWB
 * @since 2021.08.13 Fri 00:14:14
 */
abstract public class newCar {
    protected final String WD;

    protected final int[] WHEEL = { 0, 0, 0, 0 };

    /**
     * Car 생성자 함수
     *
     * @param wd: [String] 휠 구동 방식
     */
    public newCar(String wd) {
        WD = wd;
    }

    /**
     * 주행 함수
     *
     * @param power: [int] 동력
     */
    abstract public void run(int power);
}

