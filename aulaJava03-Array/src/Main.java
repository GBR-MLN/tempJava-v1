import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> salarios = new ArrayList<Double>();

        ArrayList<Double> salariosMenoresAtualizados = new ArrayList<Double>();

        ArrayList<Double> salariosAtualizados = new ArrayList<Double>();

        double folhaDePagamento = 0;
        double folhaDePagamentoAtt = 0;
        double maiorSalario = 0;

        int qntdSalarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos salários serão avaliados:"));

        double salario = 0;
        for (int i = 0; i < qntdSalarios; i++) {

            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));

            if (salario < 0) {

                JOptionPane.showMessageDialog(null, "Digite um valor valido!");
                i--;

            } else {

                salarios.add(salario);
                salariosAtualizados.add(salario);

                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }

                if (salario < 2500 && salario > 0) {
                    salariosAtualizados.removeIf(salarioCheck -> salarioCheck < 2500);
                    double percentual = 10.0;

                    double percentualAdicionar = (percentual / 100) * salario;
                    double salarioAtualizado = salario + percentualAdicionar;

                    salariosMenoresAtualizados.add(salarioAtualizado);
                    salariosAtualizados.add(salarioAtualizado);
                }
            }
        }


        for (int i = 0; i < salarios.size(); i++) {
            folhaDePagamento += salarios.get(i);
        }

        for (int i = 0; i < salariosAtualizados.size(); i++) {
            folhaDePagamentoAtt += salariosAtualizados.get(i);
        }

        JOptionPane.showMessageDialog(null, "Maior salário: " + maiorSalario);

        JOptionPane.showMessageDialog(null, "Folha de pagamento antiga: R$" + folhaDePagamento + " ou " + salarios);

        JOptionPane.showMessageDialog(null, "Folha de pagamento atualizada: R$" + folhaDePagamentoAtt +" ou " + salariosAtualizados);

    }
}