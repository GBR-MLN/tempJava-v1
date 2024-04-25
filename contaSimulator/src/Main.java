import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        TelaPrincipal t = new TelaPrincipal();

        t.setContentPane(t.painelPrincipal);
        t.setTitle("Mateus <3 Ryan");
        t.setSize(300, 200);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}