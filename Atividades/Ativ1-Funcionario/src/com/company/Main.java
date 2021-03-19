package com.company;

public class Main {

    public static void main(String[] args) {
	    Funcionario func1 = new Funcionario("João", "Silva", 1250.00);
        Funcionario func2 = new Funcionario("Pedro", "Carlos", 997.48);

        System.out.println("Funcionário 1(" + func1.getNome() + " " + func1.getSobrenome() + ")");
        System.out.println("Salário Anual: " + func1.calcularSalarioAnual());
        func1.aumentarSalario();
        System.out.println("Salário Anual: " + func1.calcularSalarioAnual());
        System.out.println("============================");

        System.out.println("Funcionário 2(" + func2.getNome() + " " + func2.getSobrenome() + ")");
        System.out.println("Salário Anual: " + func2.calcularSalarioAnual());
        func2.aumentarSalario();
        System.out.println("Salário Anual: " + func2.calcularSalarioAnual());
        System.out.println("============================");
    }
}
