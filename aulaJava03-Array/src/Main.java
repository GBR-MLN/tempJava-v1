import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> salarios = new ArrayList<Integer>();

        ArrayList<Double> menoresSalarios = new ArrayList<Double>();
        
        int maiorSalario = 0;
        double somaSalariosAtualizada = 0;
        int somaSalariosAntigos = 0;

        int qntdSalarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos salários serão avaliados:"));

        for (int i = 0; i < qntdSalarios; i++) {

            int salario = Integer.parseInt(JOptionPane.showInputDialog("Quantos salários serão avaliados:"));

            if (salario < 0) {

                JOptionPane.showMessageDialog(null, "Digite um valor valido!");
                i--;

            } else {

                somaSalariosAntigos = salario;

                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }

                if (salario < 2500 && salario > 0) {
                    double percentual = 10.0;

                    double salarioAtualizado = (percentual / 100) * salario;
                    somaSalariosAtualizada += salarioAtualizado;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Maior salário: " + maiorSalario);

        JOptionPane.showMessageDialog(null, "Folha de pagamento antiga: " + somaSalariosAntigos);

        JOptionPane.showMessageDialog(null, "Folha de pagamento atualizada: " + somaSalariosAtualizada);

    }
}