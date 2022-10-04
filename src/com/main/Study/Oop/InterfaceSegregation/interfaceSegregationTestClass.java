package com.main.Study.Oop.InterfaceSegregation;

public class interfaceSegregationTestClass {
    /**
     * 인터페이스 분리 원칙
     * 객체는 자신이 호출하지 않는 메소드에 의존하지 않아야 한다.
     * https://blog.itcode.dev/posts/2021/08/16/interface-segregation-principle
     */
    public static void main(String[] args){
        String receiverNumber = "010-0000-0000";

        SmartPhone s2 = new S2();
        System.out.println("\nS2");
        s2.call(receiverNumber);
        s2.message(receiverNumber, "message");

        System.out.println("\nS20");
        SmartPhone s20 = new S20();
        s20.call(receiverNumber);
        s20.message(receiverNumber, "message");
        ((S20) s20).ar();
        ((S20) s20).wirelessCharge();
        ((S20) s20).biometrics();

        System.out.println("\nS22");
        SmartPhone s22 = new S22();
        s22.call(receiverNumber);
        s22.message(receiverNumber, "message");
        ((S22) s22).ar();
        ((S22) s22).wirelessCharge();
        ((S22) s22).biometrics();
        ((S22) s22).newMethod();

    }
}