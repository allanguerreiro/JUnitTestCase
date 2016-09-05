package br.junit.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by allan on 02/09/16.
 */
public class Square extends Geometrics {
    @Getter @Setter
    private Double diagonal;

    public Square() {
        super();
    }
}
