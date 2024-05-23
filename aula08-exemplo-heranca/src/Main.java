public class Main {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("João", 1001, "senha123", "Ciência da Computação");
        aluno.fazerMatricula();
        aluno.mudarSenha("novaSenha123");

        // Criando um professor
        Professor professor = new Professor("Maria", 2001, "senha456", "Matemática");
        professor.fazerChamada();
        professor.mudarSenha("outraNovaSenha456");
    }
}