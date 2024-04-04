import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Digita teu nome pai: ");
//        String nome = keyboard.nextLine();
//        System.out.print("Nota 1: ");
//        float nota1 = keyboard.nextFloat();
//        System.out.print("Nota 2: ");
//        float nota2 = keyboard.nextFloat();
//        System.out.print("Nota 3: ");
//        float nota3= keyboard.nextFloat();
//
//        float media = (nota1 + nota2 + nota3)/3;
//
//        System.out.printf("A média do aluno(a): %s foi %.1f", nome, media);
//        System.out.println("");
//
//        if (media >= 7){
//            System.out.println("Passou");
//        } else if (media > 10) {
//            System.out.println("Bota as nota direito");
//        } else {
//            System.out.println("Rodouuu");
//        }

        String nome = (JOptionPane.showInputDialog("Qual seu nome?"));
        JOptionPane.showConfirmDialog(null, "Tem certeza?");
        JOptionPane.showMessageDialog(null, nome);

    }
}