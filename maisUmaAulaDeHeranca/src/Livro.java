public class Livro extends Pedido{

    private String nome;

    public Livro(int id, boolean status, String nome) {
        super(id, status);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
