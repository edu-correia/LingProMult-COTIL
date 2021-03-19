package com.company;

public class Estoque {
    private String nome;
    private int qtdMinima;
    private int qtdAtual;

    //Constructors
    public Estoque(){
        this.nome = "Nome desconhecido";
        this.qtdAtual = 0;
        this.qtdMinima = 0;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;

        confereQtdes();
    }

    public void reporEstoque(int qtd){
        this.qtdAtual += qtd;
        confereQtdes();
    }

    public void darBaixaNoEstoque(int qtd){
        this.qtdAtual -= qtd;
        confereQtdes();
    }

    public String mostra(){
        return "Produto: " + this.nome + " - Min: " + this.qtdMinima + " | Atual: " + this.qtdAtual;
    }

    public boolean precisaRepor(){
        if(this.qtdAtual <= this.qtdMinima)
            return true;
        else
            return false;
    }

    private void confereQtdes(){
        if(this.qtdAtual < 0) this.qtdAtual = 0;
        if(this.qtdMinima < 0) this.qtdMinima = 0;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
}
