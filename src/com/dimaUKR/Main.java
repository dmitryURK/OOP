package com.dimaUKR;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        /**
         Client client = new Client("Dima");

         for (DayOfWeek day : DayOfWeek.values()){
         System.out.println(day.ordinal() + " " + day.name());
         }

         Vipclient vipclient = new Vipclient();
         vipclient.setName("Vasya");
         */

        Circle circle = new Circle(new Point(0, 0), 1, Color.BLACK);
        Triangle triangle = new Triangle(new Point(0, 0), new Point(10, 0), new Point(0, 10), Color.RED);
        Square square = new Square(new Point(0, 1), 2.0d, Color.GREEN);

        Shape shape = triangle;
        Object object = triangle;
        triangle = (Triangle) object;

        Shape[] shapes = {circle, triangle, square};
        printArrayElements(shapes);

        Shape maxShape = findShapeWithMaxArea(shapes);
        System.out.println("Shape max area: " + maxShape);

        Timer timer = new Timer();
        long time = timer.measureTime(new BigDecimalPower());
        System.out.println("Time:"+time);

    }

    private static void printArrayElements(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(i + ": " + objects[i]);
        }
    }

    private static Shape findShapeWithMaxArea(Shape[] shapes) {
        Shape maxShape = null;
        double maxArea = Double.NEGATIVE_INFINITY;

        for (Shape shape : shapes) {
            double area = shape.getArea();
            if (area > maxArea) {
                maxArea = area;
                maxShape = shape;
            }
        }
        return maxShape;
    }



    private static class BigDecimalPower implements Runnable {
        @Override
        public void run() {
            new BigDecimal("1234567").pow(100000);
        }
    }
}


