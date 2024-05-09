public class MicoLeaoDourado extends Animal{

    String pelagem;

    public MicoLeaoDourado(int idade, String nomeCientifico, String habitat, String pelagem) {
        super(idade, nomeCientifico, habitat);
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println("O Mico-Leão-Dourado Guincha");
    }
}
