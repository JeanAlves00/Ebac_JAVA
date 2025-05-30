package pacote1;

public class Classe1 {

    private String propriedadePrivada; // Acesso apenas dentro da classe

    public String propriedadePublica; // Acesso de qualquer lugar

    String propriedadeDefault; // Acesso dentro do mesmo pacote

    protected String propriedadeProtegida; // Acesso dentro do mesmo pacote e subclasses

    public String getPropriedadePrivada() {
        return propriedadePrivada;
    }
}
