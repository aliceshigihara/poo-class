package exercicio3.exercicios.ifc;

public class Carro extends Veiculos {
    int Portas;
    
    public Carro(int capacidadeReserva, double kmpercorridos, int Portas) {
        super(capacidadeReserva, kmpercorridos);
        this.Portas = Portas;
    }

    public int getPortas() {
        return Portas;
    }

    public void setPortas(int Portas) {
        this.Portas = Portas;
    }
    
    @Override
    public void mostrarAutonomia(double gasolina) {
         this.Consumo = kmpercorridos / gasolina;
        System.out.println("O consumo médio do seu carro é de: " + this.Consumo + "km/L");
        System.out.println("Seu carrro tem uma autonomia total de: " + this.Consumo * this.capacidadeReserva + "km");
    }
}
