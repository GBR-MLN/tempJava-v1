import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame{

    Conta c = new Conta(1, "Gabriel", 1000.0f);
    public JPanel painelPrincipal;
    private JLabel lableConta;
    private JLabel lableSaldo;
    private JLabel lblDindin;
    private JTextField inputSacar;
    private JTextField inputDepo;
    private JButton btnDepositar;
    private JButton btnSacar;

    public TelaPrincipal() {
        btnDepositar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(inputDepo.getText());
                c.depositar(valor);
                lblDindin.setText(Float.toString(c.getSaldoConta()));
            }
        });

        btnSacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(inputSacar.getText());
                c.sacar(valor);
                lblDindin.setText(Float.toString(c.getSaldoConta()));
            }
        });
    }
}
