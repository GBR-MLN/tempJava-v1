public class Funcionario extends Pessoa {

    private Float salario;

    public Funcionario(String nome, int id, String senha, Float salario) {
        super(nome, id, senha);
        this.salario = salario;
    }

    public void discutirSalario() {
        System.out.println("Quanto você recebe? Eu recebo " + salario);
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
