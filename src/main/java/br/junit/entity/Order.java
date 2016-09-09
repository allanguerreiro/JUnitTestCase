package br.junit.entity;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by allan on 09/09/16.
 */
@NoArgsConstructor
public class Order {
    // Neste caso, o encapsulamento é real, pois não estamos apenas
    // expondo o atributo através de getter e setter "burro", mas
    // disponibilizando métodos, onde a própria classe poderá
    // manipular seus atributos. Esta é a coesão e o verdadeiro encapsulamento.
    private List<OrderItem> pedidoList = new ArrayList<OrderItem>();

    public Integer addItem(OrderItem item) {
        pedidoList.add(item);
        return getQtdItens();
    }

    public Integer removeItem(OrderItem item) {
        pedidoList.remove(item);
        return getQtdItens();
    }

    public Integer getQtdItens() {
        return pedidoList.size();
    }

    public Integer getQtdTotalItens() {
        int soma = 0;
        for (OrderItem item : pedidoList) {
            soma += item.getQuantity();
        }
        return soma;
    }

    public Double getValor() {
        Double soma = 0.0;
        for (OrderItem item : pedidoList) {
            soma += item.getValue();
        }
        return soma;
    }
}
