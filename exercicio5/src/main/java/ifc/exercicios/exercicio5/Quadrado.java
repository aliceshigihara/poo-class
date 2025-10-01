package ifc.exercicios.exercicio5;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double CalcularArea() {
        return lado * lado;
    }
    
}
