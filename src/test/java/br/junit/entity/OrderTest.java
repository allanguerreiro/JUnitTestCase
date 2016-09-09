package br.junit.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by allan on 09/09/16.
 */
public class OrderTest {
    @Test
    public void testAddOrder() {
        Order order = new Order();
        OrderItem item = new OrderItem(5, 10.0);
        int qtdOrders = order.addItem(item);

        assertEquals(1, qtdOrders);
    }

    @Test
    public void testRemoveOrder() {
        Order order = new Order();

        OrderItem item01 = new OrderItem(5, 10.0);
        OrderItem item02 = new OrderItem(7, 250.0);
        order.addItem(item01);
        order.addItem(item02);

        int qtdOrders = order.removeItem(item01);

        assertEquals(1, qtdOrders);
    }

    @Test
    public void testGetQtdItens() {
        Order order = new Order();

        OrderItem item01 = new OrderItem(5, 10.0);
        OrderItem item02 = new OrderItem(7, 250.0);
        order.addItem(item01);
        order.addItem(item02);

        int qtdItens = order.getQtdItens();

        assertEquals(2, qtdItens);
    }

    @Test
    public void testGetQtdTotalItens() {
        Order order = new Order();

        OrderItem item01 = new OrderItem(5, 10.0);
        OrderItem item02 = new OrderItem(7, 250.0);
        order.addItem(item01);
        order.addItem(item02);

        int qtdTotalItens = order.getQtdTotalItens();
        int esperado = 12;

        assertEquals(esperado, qtdTotalItens);
    }

    @Test
    public void testGetValorOrder() {
        Order order = new Order();

        OrderItem item01 = new OrderItem(5, 10.0);
        OrderItem item02 = new OrderItem(7, 250.0);
        order.addItem(item01);
        order.addItem(item02);

        double valorOrder = order.getValor();
        double esperado = 260.0;

        assertEquals(esperado, valorOrder);
    }

}