public class Animais {

    private String nome;
    private String familia;
    private int qntdExistente;
    private float peso;

    public Animais(String nome, String familia, int qntdExistente, float peso) {
        this.nome = nome;
        this.familia = familia;
        this.qntdExistente = qntdExistente;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getQntdExistente() {
        return qntdExistente;
    }

    public void setQntdExistente(int qntdExistente) {
        this.qntdExistente = qntdExistente;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
