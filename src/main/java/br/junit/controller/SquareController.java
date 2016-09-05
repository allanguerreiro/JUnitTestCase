package br.junit.controller;

import br.junit.entity.Square;

/**
 * Created by allan on 05/09/16.
 */
public class SquareController {

    private Square square;

    public Square getPerimeterSquare(Double sideA, Double sideB, Double sideC, Double sideD) {
        square = new Square();
        square.setPerimeter(sideA + sideB + sideC + sideD);
        return square;
    }

    public Square getAreaSquare(Double side) {
        square = new Square();
        square.setArea(Math.pow(side, 2 ));
        return square;
    }

    public Square getAreaSquare(Double base, Double height) {
        square = new Square();
        square.setBase(base);
        square.setHeight(height);
        square.setArea(base * height);
        return square;
    }

    public Square getSquareDiagonal(Double side) {
        square = new Square();
        square.setSide(side);
        square.setDiagonal(side * Math.sqrt(2));
        return square;
    }
}
