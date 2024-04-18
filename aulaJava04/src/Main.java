import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String nome = null;
        int idade = 0;
        int tamanhoCalcado = 0;
        String pais = null;

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); // Lista de objetos Pessoa

        for (int i = 1; i < 4; i++) {
            nome = JOptionPane.showInputDialog("Nome pessoa " + (i) + ":");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade pessoa " + (i) + ":"));
            tamanhoCalcado = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do calçado pessoa " + (i) + ":"));
            pais = JOptionPane.showInputDialog("País de origem pessoa " + (i) + ":");

            // Criar um novo objeto Pessoa com os dados fornecidos
            Pessoa p = new Pessoa(nome, idade, pais, tamanhoCalcado);
            pessoas.add(p); // Adicionar o objeto Pessoa à lista
        }

        // Iterar sobre a lista de pessoas e imprimir os detalhes de cada pessoa
        for(Pessoa p : pessoas){
            System.out.println(p.listaPessoas());
        }

    }
}
