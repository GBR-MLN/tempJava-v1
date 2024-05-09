public class Pangolin extends Animal{

    String corDaEscama;

    public Pangolin(int idade, String nomeCientifico, String habitat, String corDaEscama) {
        super(idade, nomeCientifico, habitat);
        this.corDaEscama = corDaEscama;
    }

    @Override
    public void emitirSom() {
        System.out.println("O pangolin é silencioso");
    }
}
