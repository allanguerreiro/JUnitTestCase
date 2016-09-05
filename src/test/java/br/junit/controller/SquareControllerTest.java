package br.junit.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allan on 05/09/16.
 */
@Slf4j
public class SquareControllerTest {
    SquareController controller = new SquareController();

    @Test
    public void getPerimeterSquare() throws Exception {
        log.info("Perímetro do Quadrado: " + controller.getPerimeterSquare(4D, 6D, 8D, 10D).getPerimeter());
        assertNotSame(new Double(28), controller.getPerimeterSquare(4D, 6D, 8D, 10D).getPerimeter());
    }

    @Test
    public void getAreaSquare() throws Exception {
        int value = 24;
        log.info("Área do Quadrado: " + controller.getAreaSquare(4D, 6D).getArea().intValue());
        assertSame(value, controller.getAreaSquare(4D, 6D).getArea().intValue());
    }

    @Test
    public void getAreaSquare1() throws Exception {
        log.info("Área do Quadrado: " + controller.getAreaSquare(4D).getArea());
        assertTrue(controller.getAreaSquare(4D, 6D).getArea() > controller.getAreaSquare(4D).getArea());
    }

    @Test
    public void getSquareDiagonal() throws Exception {
        log.info("A Diagonal do Quadrado: " + controller.getSquareDiagonal(10D).getDiagonal());
        assertNotNull(controller.getSquareDiagonal(10D).getDiagonal());
    }
}