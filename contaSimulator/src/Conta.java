public class Conta {

    private int numeroConta;
    private String nomeCliente;
    private float saldoConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Conta(int numeroConta, String nomeCliente, float saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;
    }

    public void sacar(float valor){
        setSaldoConta(getSaldoConta()-valor);
    }

    public void depositar(float valor){
        setSaldoConta(getSaldoConta()+valor);
    }

}
