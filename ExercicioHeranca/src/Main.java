public class Main {
    public static void main(String[] args) {

        Pangolin pangolin = new Pangolin(15, "Pholidota", "Floresta", "Escura");
        MicoLeaoDourado micoLeaoDourado = new MicoLeaoDourado(15, "Leontopithecus rosalia", "Mata Atlântica", "Alaranjada");

        System.out.println("Pangolin (" + pangolin.nomeCientifico + ") de " + pangolin.idade + " anos, com escamas " + pangolin.corDaEscama + " encontrado em um(a) " + pangolin.habitat + " adicionado.");
        System.out.println("Mico-Leão-Dourado (" + micoLeaoDourado.nomeCientifico + ") de " + micoLeaoDourado.idade + " anos, com pelagem " + micoLeaoDourado.pelagem + " encontrado em um(a) " + micoLeaoDourado.habitat + " adicionado.");
        pangolin.emitirSom();
        micoLeaoDourado.emitirSom();

    }
}