import java.util.ArrayList;

public class Pessoa {
    private int idade;
    private String nome;
    private int tamanhoCalcado;
    private String pais;

    public Pessoa(String n, int i, String p, int t) {
        this.nome = n;
        this.idade = i;
        this.pais = p;
        this.tamanhoCalcado = t;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String p) {
        this.pais = pais;
    }

    public int getTamanhoCalcado() {
        return tamanhoCalcado;
    }

    public void setTamanhoCalcado(int t) {
        this.tamanhoCalcado = tamanhoCalcado;
    }

    public String listaPessoas() {
        return "Nome: " + this.nome + " Idade: " + this.idade + " País: " + this.pais + " Tamanho do Calçado: " + this.tamanhoCalcado;
    }

}
