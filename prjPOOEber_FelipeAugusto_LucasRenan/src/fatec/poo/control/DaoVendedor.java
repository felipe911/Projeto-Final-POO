package fatec.poo.control;

import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoVendedor {
    
    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TB_VENDEDOR(CPF_VENDEDOR, NOME_VENDEDOR, ENDERECO_VENDEDOR, CIDADE_VENDEDOR, CEP_VENDEDOR, "
                    + "UF_VENDEDOR, DDD_TEL_VENDEDOR, TELEFONE_VENDEDOR, SAL_BASE_VENDEDOR, COMISSAO_VENDEDOR) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TB_VENDEDOR SET NOME_VENDEDOR = ?, ENDERECO_VENDEDOR = ?, CIDADE_VENDEDOR = ?, "
                    + "CEP_VENDEDOR = ?, UF_VENDEDOR = ?, DDD_TEL_VENDEDOR = ?, TELEFONE_VENDEDOR = ?, "
                    + "SAL_BASE_VENDEDOR = ?, COMISSAO_VENDEDOR =? WHERE CPF_VENDEDOR = ?");
           
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
            ps.setString(3, vendedor.getCidade());
            ps.setString(4, vendedor.getCep());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getDdd());
            ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
            ps.setDouble(9, vendedor.getComissao());
            ps.setString(10, vendedor.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Vendedor consultar (String CPF) {
        Vendedor v = null ;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TB_VENDEDOR where " +
                                                 "CPF_VENDEDOR = ?");
            
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                v = new Vendedor (CPF,rs.getString("NOME_VENDEDOR"),rs.getDouble("SAL_BASE_VENDEDOR"));
                
                v.setEndereco(rs.getString("ENDERECO_VENDEDOR"));
                v.setCidade(rs.getString("CIDADE_VENDEDOR"));
                v.setCep(rs.getString("CEP_VENDEDOR"));
                v.setUf(rs.getString("UF_VENDEDOR"));
                v.setDdd(rs.getString("DDD_TEL_VENDEDOR"));
                v.setTelefone(rs.getString("TELEFONE_VENDEDOR"));
                v.setComissao(rs.getDouble("COMISSAO_VENDEDOR"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (v);
    }    
     
     public void excluir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TB_VENDEDOR WHERE CPF_VENDEDOR = ?");
            
            ps.setString(1, vendedor.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}

