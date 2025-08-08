public class Main {
	public static void main(String[] args) {
	
	Carro meuCarro = new Carro();
	
	meuCarro.modelo = "Jetta";
	meuCarro.cor = "Azul";
	meuCarro.ano = 2020;
	
	meuCarro.freiar();
	meuCarro.exibirStatus();
	
	
	}


}

class Carro {

	String cor;
	String modelo;
	int ano;
	
	
	void freiar() {
		System.out.println("IIIiiiiii!!!");
	
	}

	void exibirStatus() {
	
		System.out.println("Cor do Carro: " + cor );
		System.out.println("Modelo do Carro: " + modelo);
		System.out.println("Ano do Carro: " + ano);
	
	}
}