public class Main {
	public static void main(String[] args) {
		// Criando um objeto Carro
		Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

		// Chamando métodos
		meuCarro.exibirInformacoes();
		meuCarro.acelerar();
		meuCarro.acelerar();
		meuCarro.frear();
		meuCarro.exibirInformacoes();
	}
}
