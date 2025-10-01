package ifc.exercicios.exercicio5;

public class Triangulo extends Forma {
    double base;
    double altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double CalcularArea() {
        return (base * altura) / 2;
        }
    
}
