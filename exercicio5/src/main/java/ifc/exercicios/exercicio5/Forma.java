package ifc.exercicios.exercicio5;

abstract class Forma {

    private static int QntObj = 0;

    public Forma() {
        this.QntObj++;
    }

    public static void mostrarQuantidadeObjetos() {
        System.out.println("Quantidade de Objetos: " + QntObj);
    }

    public abstract double CalcularArea();
}
