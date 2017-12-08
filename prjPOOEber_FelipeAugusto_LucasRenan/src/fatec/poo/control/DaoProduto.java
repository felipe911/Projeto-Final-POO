package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import fatec.poo.model.Produto;
import java.sql.ResultSet;

public class DaoProduto {
    private Connection conn;

    public DaoProduto(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Produto produto){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO TB_PRODUTO(CODIGO_PRODUTO, DESCRICAO_PRODUTO, QTDE_DISPONIVEL_PRODUTO, PRECO_UNIT_PRODUTO, ESTOQUE_MIN_PRODUTO)"
                    + " VALUES(?,?,?,?,?)");
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setInt(3, produto.getQtdeDisponivel());
            ps.setDouble(4, produto.getPrecoUnit());
            ps.setInt(5, produto.getEstoqueMin());
            
            ps.execute();
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Produto produto){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TB_PRODUTO SET DESCRICAO_PRODUTO = ?, QTDE_DISPONIVEL_PRODUTO = ?, PRECO_UNIT_PRODUTO = ?, " +
                                        "ESTOQUE_MIN_PRODUTO = ? WHERE CODIGO_PRODUTO = ?");
            
            ps.setString(1, produto.getDescricao());
            ps.setInt(2, produto.getQtdeDisponivel());
            ps.setDouble(3, produto.getPrecoUnit());
            ps.setInt(4, produto.getEstoqueMin());
            ps.setInt(5, produto.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Produto consultar(int cod){
        Produto p = null;
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM TB_PRODUTO WHERE " +
                                                 "CODIGO_PRODUTO = ?");
            
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true){
                p = new Produto(cod, rs.getString(String.valueOf("DESCRICAO_PRODUTO")));
                p.setEstoqueMin(Integer.parseInt(rs.getString("ESTOQUE_MIN_PRODUTO")));
                p.setPrecoUnit(Double.parseDouble(rs.getString("PRECO_UNIT_PRODUTO")));
                p.setQtdeDisponivel(Integer.parseInt(rs.getString("QTDE_DISPONIVEL_PRODUTO")));
            }
        }
        catch(SQLException ex) { 
            System.out.println(ex.toString());   
        }
        return (p);
    }
    
    public void excluir(Produto produto){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("DELETE FROM TB_PRODUTO WHERE CODIGO_PRODUTO = ?");
            
            ps.setInt(1, produto.getCodigo());
                      
            ps.execute();
        }catch(SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
}
