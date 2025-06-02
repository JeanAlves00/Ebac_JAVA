package pacote1;

public class Classe2 {

    private String propriedadePrivada; // Acesso apenas dentro da classe

    public String propriedadePublica; // Acesso de qualquer lugar

    String propriedadeDefault; // Acesso dentro do mesmo pacote

    protected String propriedadeProtegida; // Acesso dentro do mesmo pacote e subclasses

    public static void main(String[] args) {
        Classe1 classe1 = new Classe1();
        classe1.getPropriedadePrivada(); // Acesso permitido, pois Classe2 está no mesmo pacote
    }
}
