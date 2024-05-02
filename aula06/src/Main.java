import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Crud t = new Crud();

        t.setContentPane(t.painelPrincipal);
        t.setTitle("Mateus <3 Ryan");
        t.setSize(550, 300);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}