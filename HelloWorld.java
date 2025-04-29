public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
        System.out.println("Este é um programa Java simples.");

        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("dev")) {
            System.out.println("Executando no ambiente de desenvolvimento.");
        } else if (ambiente.equalsIgnoreCase("prod")) {
            System.out.println("Executando no ambiente de produção.");
        } else {
            System.out.println("Ambiente desconhecido. Por favor, use 'dev' ou 'prod'.");
        }
        System.out.println("Fim do programa.");
    }
}