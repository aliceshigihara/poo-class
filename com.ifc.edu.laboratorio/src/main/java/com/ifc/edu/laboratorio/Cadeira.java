package com.ifc.edu.laboratorio;

public class Cadeira extends Mobilia {

    private String Cadeira_tipo;
    private String Cor;
    private String Textura;
    private String Material;

    public Cadeira(String Cadeira_tipo, String Cor, String Textura, String Material, String tipo) {
        super(tipo);
        this.Cadeira_tipo = Cadeira_tipo;
        this.Cor = Cor;
        this.Textura = Textura;
        this.Material = Material;
    }

    public String getCadeira_tipo() {
        return Cadeira_tipo;
    }

    public String getCor() {
        return Cor;
    }

    public String getTextura() {
        return Textura;
    }

    public String getMaterial() {
        return Material;
    }

}

class CadeiraRodinha extends Cadeira {

    private String QuantidadeDePes;

    public CadeiraRodinha(String QuantidadeDePes, String Cadeira_tipo, String Cor, String Textura, String Material, String tipo) {
        super(Cadeira_tipo, Cor, Textura, Material, tipo);
        this.QuantidadeDePes = QuantidadeDePes;
    }

    public String getQuantidadeDePes() {
        return QuantidadeDePes;
    }

}

class CadeiraSimples extends Cadeira {
    private String TipoDePé;

    public CadeiraSimples(String TipoDePé, String Cadeira_tipo, String Cor, String Textura, String Material, String tipo) {
        super(Cadeira_tipo, Cor, Textura, Material, tipo);
        this.TipoDePé = TipoDePé;
    }

    public String getTipoDePé() {
        return TipoDePé;
    }
    
}
