package exercicio3.exercicios.ifc;

public class Veiculos {

    int capacidadeReserva;
    double kmpercorridos;
    double Consumo;

    public Veiculos(int capacidadeReserva, double kmpercorridos) {
        this.capacidadeReserva = capacidadeReserva;
        this.kmpercorridos = 0;
        this.Consumo =  Consumo;
    }

    public int getCapacidadeReserva() {
        return capacidadeReserva;
    }

    public double getKmpercorridos() {
        return kmpercorridos;
    }

    public void setCapacidadeReserva(int capacidadeReserva) {
        this.capacidadeReserva = capacidadeReserva;
    }

    public void setKmpercorridos(double kmpercorridos) {
        this.kmpercorridos = kmpercorridos;
    }

    public void andar(double km) {
        this.kmpercorridos += km;
        System.out.println("Você andou" + km + "km");
    }

    public void mostrarAutonomia(double gasolina) {
        this.Consumo = kmpercorridos / gasolina;
        System.out.println("O consumo médio do seu veículo é de: " + this.Consumo + "km/L");
        System.out.println("Seu veículo tem uma autonomia total de: " + this.Consumo * this.capacidadeReserva + "km");
    }

    public void mostrarDistanciaPercorrida() {
        System.out.println("Distância total percorrida: " + this.kmpercorridos + "km");
    }
}
