package exercicio2.exercicios.ifc;

public class Bicicleta {

    private int Velocidade;
    private boolean Andando;


    public Bicicleta() {
        this.Velocidade = 0;
        this.Andando = false;
    }

    public int getVelocidade() {
        return Velocidade;
    }


    public void Acelerar(int delta) {
        if (delta > 0);
        Velocidade += delta;
        Andando = true;
        System.out.println("Acelerou +" + delta + "km/h. Velocidade que está percorrendo agora: " + Velocidade);
    }


    public void Frear(int delta) {
        if (delta > 0);
        {
            Velocidade -= delta;
            if (Velocidade <= 0) {
                Velocidade = 0;
                Andando = false;
                System.out.println("Freou -" + delta + "km/h. A bicicleta parou.");
            } else {
                System.out.println("Freou -" + delta + "km/h. Velocidade atual: " + Velocidade + "km/h");
            }
        }
    }

    public String EstadoAtual() {
        return Andando ? "Andando" : "Parada";
    }
}
