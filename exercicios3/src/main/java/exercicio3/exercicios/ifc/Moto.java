package exercicio3.exercicios.ifc;

public class Moto extends Veiculos {
    
    boolean Bau;

    public Moto(int capacidadeReserva, double kmpercorridos, boolean Bau) {
        super(capacidadeReserva, kmpercorridos);
        this.Bau = Bau;
    }

    public boolean isBau() {
        return Bau;
    }
    
    @Override
    public void mostrarAutonomia(double gasolina) {
         this.Consumo = kmpercorridos / gasolina;
        System.out.println("O consumo médio da sua moto é de: " + this.Consumo + "km/L");
        System.out.println("Sua moto tem uma autonomia total de: " + this.Consumo * this.capacidadeReserva + "km");
    }    
}
