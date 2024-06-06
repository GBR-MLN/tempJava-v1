public class Pedido {

    private Integer id;
    private Boolean status;

    public Pedido(int id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public void concluirPedido() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
