package br.junit.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by allan on 09/09/16.
 */
@NoArgsConstructor
public class OrderItem {
    @Getter @Setter
    private Integer quantity;
    @Getter @Setter
    private Double value;

    public OrderItem(Integer quantity, Double value) {
        super();
        this.quantity = quantity;
        this.value = value;
    }
}
