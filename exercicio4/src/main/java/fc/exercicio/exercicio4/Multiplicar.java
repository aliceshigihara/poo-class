package fc.exercicio.exercicio4;

public class Multiplicar extends OperacaoMatematica {

    @Override
    public double Calcular() {
        double resultado = 1;
        for (double v : valores) {
            resultado *= v;
        }
        return resultado;
    }
}
