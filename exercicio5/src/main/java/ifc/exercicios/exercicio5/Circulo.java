package ifc.exercicios.exercicio5;

public class Circulo extends Forma {

    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double CalcularArea() {
        return 3.14 * (raio * raio);
    }

}
