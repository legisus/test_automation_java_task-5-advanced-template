package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double getSideA() {
        return this.sideA;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double getSideB() {
        return this.sideB;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double area() {
        return this.sideA*this.sideB;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public double perimeter() {
        return ((this.sideA*2)+(this.sideB*2));
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public boolean isSquare() {
        return this.sideA == this.sideB;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public void replaceSides() {
        double c;
        c = this.sideA;
        this.sideA = this.sideB;
        this.sideB = c;
    }

}
