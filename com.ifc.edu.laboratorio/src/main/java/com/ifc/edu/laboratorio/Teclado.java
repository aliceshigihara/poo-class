package com.ifc.edu.laboratorio;

public class Teclado extends Eletronicos {
    private String cor;
    private String modelo;
    private String comprimento;
    private String Idioma;

    public Teclado(String cor, String modelo, String comprimento, String Idioma, String tipo) {
        super(tipo);
        this.cor = cor;
        this.modelo = modelo;
        this.comprimento = comprimento;
        this.Idioma = Idioma;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getComprimento() {
        return comprimento;
    }

    public String getIdioma() {
        return Idioma;
    }

}
