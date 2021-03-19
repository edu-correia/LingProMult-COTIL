package com.company;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(){
        this.nome = "";
        this.sobrenome = "";
        this.salarioMensal = 0;
    }

    public Funcionario(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSalarioMensal(double salarioMensal){
        if(salarioMensal < 0) salarioMensal = 0;

        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal(){
        return this.salarioMensal;
    }

    public double calcularSalarioAnual(){
        return 12 * salarioMensal;
    }

    public void aumentarSalario(){
        this.salarioMensal = salarioMensal * 1.1;
    }
}
