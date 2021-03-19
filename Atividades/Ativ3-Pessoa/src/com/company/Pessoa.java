package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Pessoa {
    private int idade;
    private String nome;
    private LocalDate dataDeNasc;

    public Pessoa(int dia, int mes, int ano) {
        setDataDeNasc(dia, mes, ano);
        this.nome = "Nome desconhecido";
    }

    public Pessoa(String nome, int dia, int mes, int ano){
        setDataDeNasc(dia, mes, ano);
        this.nome = nome;
        calculaIdade();
    }

    public void setDataDeNasc(int dia, int mes, int ano) {
        try{
            if((dia < 1) || (dia > 31)) throw new Exception("Dia inválido!");
            if((mes < 1) || (mes > 12)) throw new Exception("Mês inválido!");
            if(ano < 1000) throw new Exception("Ano inválido!");

            this.dataDeNasc = LocalDate.of(ano, mes, dia);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void calculaIdade(){
        LocalDate agora = LocalDate.now();
        Period diferenca = Period.between(dataDeNasc, agora);
        this.idade = diferenca.getYears();
    }
}
