package br.junit.controller;

import br.junit.entity.Circle;

/**
 * Created by allan on 05/09/16.
 */
public class CircleController {
    private Circle circle;

    public Circle getAreaCircle(Double ray) {
        circle = new Circle();
        circle.setRay(ray);
        circle.setArea(circle.PI * Math.pow(ray, 2));
        return circle;
    }

    public Circle getPerimeterCircle(Double ray) {
        circle = new Circle();
        circle.setRay(ray);
        circle.setPerimeter(2 * circle.PI * ray);
        return circle;
    }

    public Circle getDiameterCircle(Double ray) {
        circle = new Circle();
        circle.setRay(ray);
        circle.setDiameter(2 * ray);
        return circle;
    }
}
