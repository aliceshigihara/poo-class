package com.ifc.edu.laboratorio;

public class Lixeira extends Mobilia {

    private String cor;
    private String formato;
    private String ocupacao;

    public Lixeira(String cor, String formato, String ocupacao, String tipo) {
        super(tipo);
        this.cor = cor;
        this.formato = formato;
        this.ocupacao = ocupacao;

    }

    public String getCor() {
        return cor;
    }

    public String getFormato() {
        return formato;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void LixeiraInformacoes() {
            System.out.println("Cor:" + getCor());
            System.out.println("Formato:" + getFormato());
            System.out.println("Ocupação da Lixeira:" + getOcupacao());
        }
}

