package fc.exercicio.exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);

        System.out.println("O que você deseja fazer?: ");
        System.out.print("1- Somar\n 2- Subtrair\n 3- Multiplicar\n 4- Dividir\n");
        int Operacao = scanning.nextInt();
        System.out.print("Quantos valores você deseja calcular?: ");
        int QntValores = scanning.nextInt();

        OperacaoMatematica operador = null;
        if (Operacao == 1) {
            operador = new Soma();
        } else if (Operacao == 2) {
            operador = new Subtrair();
        } else if (Operacao == 3) {
            operador = new Multiplicar();
        } else if (Operacao == 4) {
            operador = new Dividir();
        }
        else {
        System.out.println("Parece que você não digitou um operador válido! ");
        }

        int i = 0;
        while (i < QntValores) {
            System.out.print("Digite o valor que deseja e aperte ENTER, até completar a quantidade de valores que você digitou anteriormente. :");
            double valor = scanning.nextDouble();
            operador.AdicionarValor(valor);
            i++;
        }
        
        double resultado = operador.Calcular();
        System.out.println("Resultado: " + resultado);
    }
}
