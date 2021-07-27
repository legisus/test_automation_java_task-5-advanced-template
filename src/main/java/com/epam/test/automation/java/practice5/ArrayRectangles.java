package com.epam.test.automation.java.practice5;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */

public class ArrayRectangles {
    private Rectangle[] rectangles;

    public ArrayRectangles(int n) {
        this.rectangles = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        this.rectangles = rectangles;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i] == null) {
                rectangles[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMaxArea() {
        double maxArea = 0;
        int index = -1;
        for (int i = 0; i < rectangles.length; i++) {
            if (maxArea < rectangles[i].area()) {
                maxArea = rectangles[i].area();
                index = i;
            }
        }
        return index;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMinPerimeter() {
        if (rectangles.length == 0) {
            return -1;
        }
        double minPerimeter = rectangles[0].perimeter();

        int index = -1;
        for (int i = 1; i < rectangles.length; i++) {

            if (minPerimeter > rectangles[i].perimeter()) {
                minPerimeter = rectangles[i].perimeter();
                index = i;
            }
        }
        return index;

    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberSquares() {
        int numberSquares = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i].isSquare()) {
                numberSquares++;
            }
        }
        return numberSquares;
    }


}
