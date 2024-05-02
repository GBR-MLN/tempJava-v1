import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Crud extends JFrame{

    ArrayList<Produto> produtos = new ArrayList<>();

    public JPanel painelPrincipal;
    private JTextField nomeInput;
    private JTextField precoInput;
    private JTextField qntdInput;
    private JButton enviarBtn;
    private JButton excluirBtn;
    private JButton editarBtn;
    private JButton procurarBtn;
    private JTextArea textArea1;
    private JButton randomBtn;

    public Crud() {
        enviarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeInput.getText();
                float preco = Float.parseFloat(precoInput.getText());
                int qntd = Integer.parseInt(qntdInput.getText());

                Produto p = new Produto(nome, preco, qntd);
                produtos.add(p);

                textArea1.setText("");
                for(Produto x : produtos){
                    textArea1.append("Nome Produto: " + x.getNome() + "\nPreço: R$" + x.getPreco() + "\nQuantidade: " + x.getQntd() + "\n\n");
                }

                nomeInput.setText("");
                precoInput.setText("");
                qntdInput.setText("");
            }
        });

        excluirBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = nomeInput.getText();
                float preco = Float.parseFloat(precoInput.getText());
                int qntd = Integer.parseInt(qntdInput.getText());

                for(Produto x : produtos){
                    if (Objects.equals(x.getNome(), nome) && Objects.equals(x.getPreco(), preco) && Objects.equals(x.getQntd(), qntd)){
                        produtos.remove(x);
                        break;
                    }
                }

                textArea1.setText("");

                for(Produto x : produtos){
                    textArea1.append("Nome Produto: " + x.getNome() + "\nPreço: R$" + x.getPreco() + "\nQuantidade: " + x.getQntd() + "\n\n");
                }
            }
        });

        editarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = nomeInput.getText();
                float preco = Float.parseFloat(precoInput.getText());
                int qntd = Integer.parseInt(qntdInput.getText());

                for (Produto x : produtos) {
                    if (Objects.equals(x.getNome(), nome)) {

                        x.setPreco(preco);
                        x.setQntd(qntd);
                        break;
                    }
                }

                textArea1.setText("");
                for (Produto produto : produtos) {
                    textArea1.append("Nome Produto: " + produto.getNome() + "\nPreço: R$" + produto.getPreco() + "\nQuantidade: " + produto.getQntd() + "\n\n");
                }

                nomeInput.setText("");
                precoInput.setText("");
                qntdInput.setText("");

            }
        });

        procurarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeInput.getText();
                float preco = Float.parseFloat(precoInput.getText());
                int qntd = Integer.parseInt(qntdInput.getText());

                for(Produto x : produtos){
                    if (Objects.equals(x.getNome(), nome) && Objects.equals(x.getPreco(), preco) && Objects.equals(x.getQntd(), qntd)){

                        textArea1.setText("");
                        textArea1.append("Nome Produto: " + x.getNome() + "\nPreço: R$" + x.getPreco() + "\nQuantidade: " + x.getQntd() + "\n\n");

                    }
                }

                nomeInput.setText("");
                precoInput.setText("");
                qntdInput.setText("");
            }
        });

        randomBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Random random = new Random();
                for (int i = 0; i < 3; i++) {
                    String nome = "Produto " + (i + 1);
                    float preco = random.nextFloat() * 100; // Preço aleatório entre 0 e 100
                    int qntd = random.nextInt(10) + 1; // Quantidade aleatória entre 1 e 10

                    Produto produto = new Produto(nome, preco, qntd);
                    produtos.add(produto);
                }

                // Atualizar a exibição na área de texto
                textArea1.setText("");
                for (Produto x : produtos) {
                    String precoFormatted = String.format("%.2f", x.getPreco()); // Limita para 2 casas decimais
                    textArea1.append("Nome Produto: " + x.getNome() + "\nPreço: R$" + precoFormatted + "\nQuantidade: " + x.getQntd() + "\n\n");
                }

            }
        });
    }
}
