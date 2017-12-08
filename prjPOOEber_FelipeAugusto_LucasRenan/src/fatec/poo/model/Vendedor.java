package fatec.poo.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa {
    
    private double salarioBase;
    private double comissao;
    private ArrayList<Pedido> vendedorPedidos;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        vendedorPedidos = new ArrayList<Pedido>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao/100;
    }

    public ArrayList<Pedido> getVendedorPedidos() {
        return vendedorPedidos;
    }
    
    public void addPedido(Pedido p){
        vendedorPedidos.add(p);
        p.setVendedor(this);
    }
    
}
