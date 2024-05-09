public class Animal {

    int idade;
    String nomeCientifico;
    String habitat;

    public Animal(int idade, String nomeCientifico, String habitat) {
        this.idade = idade;
        this.nomeCientifico = nomeCientifico;
        this.habitat = habitat;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som");
    }
}
