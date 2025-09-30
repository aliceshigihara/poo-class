package exercicio3.exercicios.ifc;

import java.util.Scanner;

public class Exercicios3 {

    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);
        
        System.out.println("Qual é o seu veículo?\n" + "Carro\n" + "Moto\n");
        System.out.print("Digite 1 para Carro, 2 para Moto.");
        int Tipo = scanning.nextInt();
        
        System.out.print("Qual é a capacidade do reservatório do seu carro?: ");
        int CapacidadeReserva = scanning.nextInt();

        System.out.print("Quantos KM você deseja percorrer?: ");
        double quilometragem = scanning.nextDouble();

        System.out.print("Quanto você pretende abastecer após percorrer " + quilometragem + "km?:");
        double gasolina = scanning.nextDouble();
        
        Veiculos veiculo1 = new Veiculos(CapacidadeReserva, quilometragem);
        
        if (Tipo == 1) {
            System.out.println("Quantas portas tem o seu carro?");
            int Portas = scanning.nextInt();
            veiculo1 = new Carro(CapacidadeReserva, quilometragem, Portas);
            
        } else if (Tipo == 2) {
            System.out.println("Sua moto tem baú? (true/false): ");
            Boolean Bau = scanning.nextBoolean();
            veiculo1 = new Moto(CapacidadeReserva, quilometragem, Bau);
            
        } else {
            System.out.println("Parece que você não exemplificou o tipo de veículo! Mostrando informações de veículo: ");
            veiculo1 = new Veiculos(CapacidadeReserva, quilometragem);
            
        }
        
        System.out.println("A sua capacidade de reserva é: " + veiculo1.getCapacidadeReserva());
        veiculo1.andar(quilometragem);
        veiculo1.mostrarAutonomia(gasolina);
        veiculo1.mostrarDistanciaPercorrida();

    }

}
