package exercicio1.exercicios.ifc;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String Nome = scanner.next();
        
        System.out.print("Qual o seu peso em kg?: ");
        double Peso = scanner.nextDouble();
        
        System.out.print("Digite a sua altura em metros: ");
        double Altura = scanner.nextDouble();
    
        Pessoa pessoa1 = new Pessoa(Nome,Peso,Altura);
        pessoa1.CalcularIMC();
    
        System.out.println("\n----Saiba o seu IMC----");
        System.out.printf("Seu nome é: " + pessoa1.getNome() + "\n");
        System.out.printf("Seu IMC é: %2f\n", pessoa1.getImc());
        
    }
    
}
