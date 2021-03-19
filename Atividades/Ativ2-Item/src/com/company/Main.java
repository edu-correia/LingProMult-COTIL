package com.company;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(1, "Pacote de fraldas", 3, 34.5);
        Item item2 = new Item(2, "Calça jeans", 1, 120);

        item2.setPreco(199.99);

        System.out.println("Total faturado na venda de " + item1.getDescricao() + "(s): " + item1.getTotal());
        System.out.println("Total faturado na venda de " + item2.getDescricao() + "(s): " + item2.getTotal());
    }
}
