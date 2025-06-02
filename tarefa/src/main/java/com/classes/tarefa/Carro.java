// Classe que representa um carro do mundo real
public class Carro {

    // Propriedades (atributos) do carro
    String marca;
    String modelo;
    int ano;
    double velocidade;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; // velocidade inicial é 0
    }

    // Método para acelerar o carro
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    // Método para frear o carro
    public void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }

    // Método para exibir os dados do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}