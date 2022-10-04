package com.main.Study.Oop.LiskovSubstitution;

public class RectangleExtendsShape extends Shape{
    /**
     * Rectangle 생성자 함수
     *
     * @param width: [int] 너비
     * @param height: [int] 높이
     */
    public RectangleExtendsShape(int width, int height) {
        setWidth(width);
        setHeight(height);
    }
}
