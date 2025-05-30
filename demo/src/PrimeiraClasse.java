public class PrimeiraClasse {
    public static void main(String args[]) {
        System.out.println("Olá Jean");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua Exemplo, 123");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        // cliente.imprimirEndereco();
        System.out.println(cliente.retonarNomeCliente());
        System.out.println(cliente.getValorTotal());

    }
}