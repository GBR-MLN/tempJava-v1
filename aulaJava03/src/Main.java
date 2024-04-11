import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int maiorNum = 0;

        for (int i = 0; i < 10; i++) {

            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 100"));

            if (num > 100 || num < 0) {
                JOptionPane.showMessageDialog(null, "Digite somente números entre 0 e 100!");
                i--;
            } else {
                if (num > maiorNum){
                    maiorNum = num;
                }
            }

        }

        JOptionPane.showMessageDialog(null, "O maior número que foi digitado foi: " + maiorNum);

    }
}