package com.main.Study.Oop.SingleResponsibility.Car;

/**
 * 자동차 객체
 *
 * @author RWB
 * @since 2021.08.13 Fri 00:14:14
 */
public class Car {
    private final String WD;

    private final int[] WHEEL = { 0, 0, 0, 0 };

    /**
     * Car 생성자 함수
     *
     * @param wd: [String] 휠 구동 방식
     */
    public Car(String wd) {
        WD = wd;
    }

    /**
     * 주행 함수
     *
     * @param power: [int] 동력
     */
    public void run(int power) {
        switch (WD.toUpperCase()) {
            // 전륜
            case "FWD" : {
                WHEEL[0] = power;
                WHEEL[1] = power;
                break;
            }

            // 후륜
            case "RWD" : {
                WHEEL[2] = power;
                WHEEL[3] = power;
                break;
            }

            // 4륜
            case "AWD" : {
                WHEEL[0] = power;
                WHEEL[1] = power;
                WHEEL[2] = power;
                WHEEL[3] = power;
                break;
            }
        }

        System.out.println("휠 동력 상태: " + WHEEL[0] + ", " + WHEEL[1] + ", " + WHEEL[2] + ", " + WHEEL[3]);
    }
}

