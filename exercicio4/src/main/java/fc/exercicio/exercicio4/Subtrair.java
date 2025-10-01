package fc.exercicio.exercicio4;

public class Subtrair extends OperacaoMatematica {

    @Override
    public double Calcular() {
        double resultado = 0;
        for (double v : valores) {
            resultado -= v;
        }
        return resultado;
    }
    
}
