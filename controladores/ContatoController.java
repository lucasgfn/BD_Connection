/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acessandobd.BD_Connection.controladores;


import acessandobd.ConectaBD;
import acessandobd.interfaces.ICrud;
import acessandobd.BD_Connection.modelos.Contato;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author lucas
 */
public class ContatoController implements ICrud<Contato>{
    private Connection conn = ConectaBD.conectar();

    @Override
    public void salvar(Contato t) {
       try{
        String sql = "insert into tb_table(nome, email, fone) values (?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, t.getNome());
        pstm.setString(2, t.getEmail());
        pstm.setString(3, t.getFone());
        
        pstm.execute();
        
       }catch(SQLException ex){
           System.out.println("Erro: "+ ex.getMessage());
       }
    }

    @Override
    public List<Contato> consultarTodos() {
       List<Contato> contatos = new ArrayList<>();
        try{
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM tb_table");
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                Contato contato = new Contato();
                contato.setNome(rs.getString("nome"));
                 contato.setEmail(rs.getString("email"));
                  contato.setFone(rs.getString("fone"));
                   contato.setId(rs.getInt("id"));
                
                contatos.add(contato);
            }

            
        }catch(SQLException ex){
            System.out.print("Erro: "+ ex.getMessage());
        }
        
        return contatos;
    }
    

    @Override
    public Contato consultarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void excluir(int id) {
        Connection conn = ConectaBD.conectar();
        try {
            PreparedStatement stm = conn.prepareStatement("delete from tb_table where id = ?");
            stm.setInt(1, id);
            stm.execute();
            
        }catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
    
        }finally{
           // ConectaBD.fecharCoenxao();
        }
        
    }

    @Override
    public void update(Contato t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
        
    
}
