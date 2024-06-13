import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Tela extends JFrame{

    ArrayList <Avaliacao> avaliacoes = new ArrayList<>();

    public JPanel painelPrincipal;
    private JTextField estabelecimentoInput;
    private JTextField itensInput;
    private JTextField notaInput;
    private JTextField comentarioInput;
    private JButton guardarButton;
    private JButton buscarEButton;
    private JButton buscarIButton;
    private JButton mostrarTudoButton;
    private JButton fakeButton;
    private JTextArea textArea1;


    public Tela() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estabelecimento = estabelecimentoInput.getText();
                String itens = itensInput.getText();
                int nota =Integer.parseInt(notaInput.getText());
                String comentario = comentarioInput.getText();

                Avaliacao a = new Avaliacao(estabelecimento, itens, nota, comentario);
                avaliacoes.add(a);

                textArea1.setText("");
                for(Avaliacao x : avaliacoes){
                    textArea1.append("====================\n\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n====================\n\n");
                }

                estabelecimentoInput.setText("");
                itensInput.setText("");
                notaInput.setText("");
                comentarioInput.setText("");
            }
        });

        buscarEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estabelecimento = estabelecimentoInput.getText();

                for(Avaliacao x : avaliacoes){
                    if(Objects.equals(x.getEstabelecimento(), estabelecimento)) {

                        textArea1.setText("");
                        textArea1.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n\n====================");
                    }
                }
            }
        });
        buscarIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itens = itensInput.getText();

                for(Avaliacao x : avaliacoes){
                    if(Objects.equals(x.getItens(), itens)) {

                        textArea1.setText("");
                        textArea1.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n\n====================");
                    }
                }
            }
        });

        mostrarTudoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea1.setText("");
                for(Avaliacao x : avaliacoes){
                    textArea1.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n====================\n\n");
                }
            }
        });

        fakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Random random = new Random();
                for (int i = 0; i < 3; i++) {
                    String estabelecimento = "Estabelecimento " + (i + 1);
                    String item = "Item " + (i + 1);
                    int nota = random.nextInt(10) + 1; // Quantidade aleatória entre 1 e 10
                    String comentario = "Comentario Maneiro :)";

                    Avaliacao avaliacao = new Avaliacao(estabelecimento, item, nota, comentario);
                    avaliacoes.add(avaliacao);

                    textArea1.setText("");
                    for(Avaliacao x : avaliacoes){
                        textArea1.append("====================\n" + "Estabelecimento: " + x.getEstabelecimento() + "\nItens: " + x.getItens() + "\nNota: " + x.getNota() + "\nComentario: " + x.getComentario() + "\n====================\n\n");
                    }
                }

            }
        });
    }
}
