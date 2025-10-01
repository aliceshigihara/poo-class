package fc.exercicio.exercicio4;
import java.util.ArrayList;
import java.util.List;  

abstract class OperacaoMatematica {
    
    protected List<Double> valores = new ArrayList<>();
    
    public void AdicionarValor(double valor) {
        valores.add(valor);
    }
    
    public abstract double Calcular();
}
