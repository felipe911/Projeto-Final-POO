package fatec.poo.control;
import fatec.poo.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCliente {
     private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TB_CLIENTE(CPF_CLIENTE, NOME_CLIENTE, ENDERECO_CLIENTE, CIDADE_CLIENTE,"
                    + "CEP_CLIENTE , UF_CLIENTE, DDD_TEL_CLIENTE, TELEFONE_CLIENTE, LIMITE_CRED_CLIENTE, LIMITE_DISP_CLIENTE) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setDouble(9, cliente.getLimiteCred());
            ps.setDouble(10, cliente.getLimiteCred());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TB_CLIENTE set NOME_CLIENTE = ?,ENDERECO_CLIENTE = ?,CIDADE_CLIENTE = ?,"
                    + "CEP_CLIENTE = ? , UF_CLIENTE = ?, DDD_TEL_CLIENTE = ?, TELEFONE_CLIENTE = ?, LIMITE_CRED_CLIENTE = ? " +
                                                 "where CPF_CLIENTE = ?");
            
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getCep());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getDdd());
            ps.setString(7, cliente.getTelefone());
            ps.setDouble(8, cliente.getLimiteCred());
            ps.setString(9, cliente.getCpf());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Cliente consultar (String cpf) {
        Cliente c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TB_CLIENTE where " +
                                                 "CPF_CLIENTE = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Cliente (cpf, rs.getString("NOME_CLIENTE"),rs.getDouble("LIMITE_CRED_CLIENTE"));
                c.setCep(rs.getString("CEP_CLIENTE"));
                c.setCidade(rs.getString("CIDADE_CLIENTE"));
                c.setDdd(rs.getString("DDD_TEL_CLIENTE"));
                c.setTelefone(rs.getString("TELEFONE_CLIENTE"));
                c.setUf(rs.getString("UF_CLIENTE"));
                c.setEndereco(rs.getString("ENDERECO_CLIENTE"));
                c.setLimiteDisp(rs.getDouble("LIMITE_DISP_CLIENTE"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }    
     
     public void excluir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TB_CLIENTE where CPF_CLIENTE = ?");
            
            ps.setString(1, cliente.getCpf());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
