package ifc.exercicios.exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {
    
        Quadrado quadrado1 = new Quadrado(8);
        Circulo circulo1 = new Circulo(12);
        Triangulo triangulo1 = new Triangulo(6,3);
        
        System.out.println("Área do Quadrado: " + quadrado1.CalcularArea());
        System.out.println("Área do Circulo: " + circulo1.CalcularArea());
        System.out.println("Área do Triângulo: " + triangulo1.CalcularArea());
        Forma.mostrarQuantidadeObjetos();
    } 
    
}
 