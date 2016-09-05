package br.junit.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by allan on 02/09/16.
 */
public class Circle extends Geometrics {
    @Getter
    public static final Double PI = 3.14D;
    @Getter @Setter
    private Double ray;
    @Getter @Setter
    private Double diameter;

    public Circle() {
        super();
    }
}
