package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Einstein", 14, 3, 1879);
        einstein.calculaIdade();
        System.out.println("Einstein: " + einstein.informaIdade() + " anos.");

        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);
        newton.calculaIdade();
        System.out.println("Newton: " + newton.informaIdade() + " anos.");
    }
}
