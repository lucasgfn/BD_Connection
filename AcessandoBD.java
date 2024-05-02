/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acessandobd.BD_Connection;

import acessandobd.BD_Connection.controladores.ContatoController;
import acessandobd.BD_Connection.modelos.Contato;
import acessandobd.BD_Connection.views.FrameContato;
import acessandobd.BD_Connection.views.FrameMenu;
import acessandobd.BD_Connection.views.tabela;
import java.util.List;

/**
 *
 * @author lucas
 */
public class AcessandoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //usarSwing();
       //consultarTodosDados();
       //conceitoTabela();
      menu();
      consultarTodosContatos();
      System.out.print("Fim");
    }
    
    static void conceitoTabela(){
        new tabela().setVisible(true);
    }
    
    static void usarSwing(){
        new FrameContato().setVisible(true);
    }
    
    static void menu(){
         new FrameMenu().setVisible(true);
        
    }
    
    static void consultarTodosContatos(){
        ContatoController ctc = new ContatoController();
        List<Contato> contatos =  ctc.consultarTodos();
        for(Contato ct: contatos){
            System.out.print(ct.toString());
        }
    }
    
    static void SalvarContato(){
        Contato ct= new Contato("Joao", "joao@gmail.com", "(47)9999001111");
        
        ContatoController ctc = new ContatoController();
        ctc.salvar(ct);
   
        
    }
    
    
    
}
