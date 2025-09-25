package exercicio1.exercicios.ifc;

public class Pessoa {

    private String Nome;
    private double Peso;
    private double Altura;
    private double Imc;

    public double getImc() {
        return Imc;
    }

    public void setImc(double Imc) {
        this.Imc = Imc;
    }

    public Pessoa(String Nome, double Peso, double Altura) {
        this.Nome = Nome;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void CalcularIMC() {
        this.Imc = this.Peso / (this.Altura * this.Altura);
    }

}
