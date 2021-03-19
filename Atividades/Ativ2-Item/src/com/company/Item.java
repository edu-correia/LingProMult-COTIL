package com.company;

public class Item {
    private int codigo;
    private String descricao;
    private int qtde;
    private double preco;

    public Item(int codigo, String descricao, int qtde, double preco){
        if(qtde < 0) qtde = 0;
        if(preco < 0) preco = 0;
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        if(preco < 0) preco = 0;
        this.preco = preco;
    }

    public void setQtde(int qtde) {
        if(qtde < 0) qtde = 0;
        this.qtde = qtde;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTotal(){
        return (this.qtde * this.preco);
    }
}
