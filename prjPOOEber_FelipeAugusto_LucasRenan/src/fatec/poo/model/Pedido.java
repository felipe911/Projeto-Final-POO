package fatec.poo.model;

import java.util.ArrayList;

public class Pedido {
    
    private int numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    private Cliente cliente;
    private Produto produto;
    private ItemPedido itemPedido;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itensPedidos;

    public Pedido(int numero, String dataEmissaoPedido) {
        this.numero = numero;
        this.dataEmissaoPedido = dataEmissaoPedido;
    }

    public int getNumero() {
        return numero;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }
    
    public void addItemPedido(ItemPedido p){
        itensPedidos.add(p);
        p.setPedido(this);
    }

    public Produto getProduto() {
        return produto;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }
    
    public double calcCredCliente(double limiteCred){
      limiteCred = getCliente().getLimiteDisp() - (getProduto().getPrecoUnit() * itemPedido.getQtdeVendida());
      return limiteCred;
    }

}
