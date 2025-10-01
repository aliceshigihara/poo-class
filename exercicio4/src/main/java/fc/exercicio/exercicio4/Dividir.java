package fc.exercicio.exercicio4;

public class Dividir extends OperacaoMatematica {

    @Override
    public double Calcular() {

        double resultado = valores.get(0);
        for (int i = 1; i < valores.size(); i++) {
            double divisor = valores.get(i);
            if (divisor == 0) {
                System.out.println("Divisão por zero não é permitida.");
            }
            resultado /= divisor;
        }
        return resultado;
    }
    
}
