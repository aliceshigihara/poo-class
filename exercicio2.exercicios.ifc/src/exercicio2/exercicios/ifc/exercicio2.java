package exercicio2.exercicios.ifc;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);
        Bicicleta bicicleta1 = new Bicicleta();
        
        System.out.println("Estado inicial da bicicleta: " + bicicleta1.EstadoAtual());
        System.out.println("Velocidade atual da bicileta:" + bicicleta1.getVelocidade());

        System.out.print("Quanto você quer acelerar?: ");
        int acelerou = scanning.nextInt();
        bicicleta1.Acelerar(acelerou);

        System.out.print("Quanto você deseja freiar?: ");
        int freiou = scanning.nextInt();
        bicicleta1.Frear(freiou);

        System.out.println("Sua velocidade final: " + bicicleta1.getVelocidade() + "km/h");
        System.out.println("Estado atual: " + bicicleta1.EstadoAtual());

    }

}