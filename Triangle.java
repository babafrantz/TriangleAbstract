package com.Exercises.triangleAbstract;

import java.util.Scanner;

public class Triangle extends com.Exercises.triangleAbstract.GeometricObject {
    private float sideA;
    private float sideB;
    private float sideC;

    private float height;

    public Triangle(float sideA, float sideB, float sideC,float height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.sideC = sideC;
    }

    public Triangle(String color, boolean filled, float sideA, float sideB, float sideC,float height){
        super(color,filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.sideC = sideC;
    }

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    public float getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (0.5 * getSideB() * getHeight());
    }

    @Override
    public double getPerimeter() {
        return getSideA()+getSideB()+getSideC();
    }
    public static void  main(String[]args){

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter the value of the first side");

        float sideA = kbd.nextFloat();

        System.out.println("Enter the value of the second side");

        float sideB = kbd.nextFloat();

        System.out.println("Enter the value of the third side");

        float sideC = kbd.nextFloat();

        System.out.println("Enter the value of the fourth side");

        float height = kbd.nextFloat();

        System.out.println("Enter the color of the triangle");

        String color = kbd.next();

        System.out.println("Enter if the Triangle is filled or not");

        boolean filled = kbd.hasNextBoolean();

        //Creating another Triangle object using the first constructor

        Triangle new_triangle1 = new Triangle(sideA,sideB,sideC,height);

        System.out.println("The area of the triangle is as below");

        System.out.println(new_triangle1.getArea());

        System.out.println("The area of the perimeter is as below");

        System.out.println(new_triangle1.getPerimeter());

        // Creating another triangle Object using the second constructor

        GeometricObject new_triangle2 = new Triangle(color, filled, sideA,sideB,sideC,height);

        System.out.println("Display the color of the Triangle ");

        System.out.println(new_triangle2.getColor());

        System.out.println("Display if the triangle is filled");

        System.out.println(new_triangle2.isFilled());

    }

}
