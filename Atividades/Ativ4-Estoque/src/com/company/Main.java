package com.company;

public class Main {

    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora", 13, 6);
        Estoque estoque2 = new Estoque("Monitor", 11, 13);
        Estoque estoque3 = new Estoque("Mouse", 6, 2);

        estoque1.darBaixaNoEstoque(5);
        estoque2.reporEstoque(7);
        estoque3.darBaixaNoEstoque(4);

        System.out.println("Estoque 1 precisa repor? " + (estoque1.precisaRepor() ? "Sim": "Não"));
        System.out.println("Estoque 2 precisa repor? " + (estoque2.precisaRepor() ? "Sim": "Não"));
        System.out.println("Estoque 3 precisa repor? " + (estoque3.precisaRepor() ? "Sim": "Não"));

        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());
    }
}
