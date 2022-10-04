package com.main.Study.Oop.LiskovSubstitution;

public class LiskovSubstitutionTestClass {
    /**
     * 리스코프 치환 원칙
     * 부모 객체를 상속한 자식 객체가 부모 객체를 호출하는 동작에서 자식 객체가 부모 객체를 완전히 대체할수 있다.
     * https://blog.itcode.dev/posts/2021/08/15/liskov-subsitution-principle
     */
    public static void main(String[] args){
        //리스코프 치환 원칙을 위배한 코드
        Rectangle rectangle = new Rectangle();  //직사각형
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println("rectangle : "+rectangle.getArea());

        Rectangle square = new Square();        //직사각형을 상속받은 정사각형
        square.setWidth(10);    //높이와 넓이 10으로 설정됨
        square.setHeight(5);    //높이와 넓이 5로 설정됨
        System.out.println("square : "+square.getArea());

        //리스코프 치환 원칙을 준수한 코드
        Shape rectangle_shape = new RectangleExtendsShape(10, 5);     //사각형을 상속받은 직사각형
        Shape square_shape = new SquareExtendsShape(5);                     //사각형을 상속받은 정사각형
        System.out.println("rectangle : "+rectangle_shape.getArea());
        System.out.println("square : "+square_shape.getArea());
    }
}
