package com.main.Study.Oop.LiskovSubstitution;

public class SquareExtendsShape extends Shape{
    /**
     * Square 생성자 함수
     *
     * @param length: [int] 길이
     */
    public SquareExtendsShape(int length) {
        setWidth(length);
        setHeight(length);
    }
}
