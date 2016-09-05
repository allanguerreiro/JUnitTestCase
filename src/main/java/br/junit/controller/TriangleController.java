package br.junit.controller;

import br.junit.entity.Triangle;

/**
 * Created by allan on 02/09/16.
 */
public class TriangleController {

    private static Triangle triangle;

    public static Triangle getAreaEquilateralTriangle(Double side) {
        triangle = new Triangle();
        triangle.setSide(side);
        triangle.setArea((Math.pow(side, 2) * Math.sqrt(3)) / 4);
        return triangle;
    }

    public static Triangle getPerimeterTriangle(Double sideA, Double sideB, Double sideC) {
        triangle = new Triangle();
        triangle.setPerimeter(sideA + sideB + sideC);
        return triangle;
    }

    public static Triangle getHeightEquilateralTriangle(Double side) {
        triangle = new Triangle();
        triangle.setSide(side);
        triangle.setHeight(side * Math.sqrt(3));
        return triangle;
    }

    public static Triangle getAreaIsoscelesAndScaleneTriangle(Double base, Double height) {
        triangle = new Triangle();
        triangle.setBase(base);
        triangle.setHeight(height);
        triangle.setArea((base * height) / 2);
        return triangle;
    }

    public static Triangle getHeightIsoscelesTriangle(Double side, Double base) {
        triangle = new Triangle();
        triangle.setBase(base);
        triangle.setSide(side);
        triangle.setHeight(Math.sqrt(Math.pow(side, 2) - (Math.pow(base, 2) / 4)));
        return triangle;
    }
}
