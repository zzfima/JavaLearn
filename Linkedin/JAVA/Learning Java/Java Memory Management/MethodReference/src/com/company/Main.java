package com.company;

public class Main {

    public static void main(String[] args) {
        //Call method
        Square sq1 = new Square(4);
        System.out.println(sq1.calculateArea());

        //Functional
        Shapes sh1 = new Shapes() {
            @Override
            public int getArea(Square s) {
                return s.calculateArea();
            }
        };
        System.out.println(sh1.getArea(sq1));

        //lambda
        Shapes sh2 = (s) -> s.calculateArea();
        System.out.println(sh2.getArea(sq1));

        //method reference
        Shapes sh3 = Square::calculateArea;
        System.out.println(sh3.getArea(sq1));

    }
}
