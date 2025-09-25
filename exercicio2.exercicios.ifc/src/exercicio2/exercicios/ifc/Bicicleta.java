package exercicio2.exercicios.ifc;

public class Bicicleta {

    private int Velocidade;
    private boolean Andando;
    
    public int getVelocidade() {
        return Velocidade;
    }
    
// construtor
    public Bicicleta(int Velocidade, boolean Andando) {
        this.Velocidade = 0;
        this.Andando = false;
    }

//método acelera
    public void Acelerar(int delta) {
        if (delta > 0);
        Velocidade += delta;
        Andando = true;
        System.out.println("Acelerou +" + delta + "km/h. Velocidade que está percorrendo agora: " + Velocidade);
    }
    
//método de freiar

    public void Frear(int delta) {
        if (delta > 0);
        Velocidade -= delta;
        if (Velocidade <= 0) {
            Velocidade = 0;
            Andando = false;
            System.out.println("Freou -" + delta + "km/h. A bicicleta parou.");
        } else {
            System.out.println("Não está freiando");

        }
    }
//fazer método de mostrar velocidade
}
