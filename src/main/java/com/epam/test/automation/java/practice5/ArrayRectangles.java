package com.epam.test.automation.java.practice5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * <summary>
 * Implement class according to description of task.
 * </summary>
 */

public class ArrayRectangles {
    //TODO: Delete line below and write your own solution;
    //TODO: implement constructors according to description of task
    private int n;
    List<Rectangle> rectangleArray = new ArrayList<Rectangle>();


    public ArrayRectangles(Array[] rectangleArray, int n) {
        this.n = n;
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public boolean addRectangle(Rectangle rectangle) {
        if (rectangleArray.get(n) == null){

            rectangleArray.add(rectangle);
            return true;
        }else {
            return false;
        }
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMaxArea() {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberMinPerimeter() {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public int numberSquares() {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

}
