/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package acessandobd.interfaces;

import java.util.List;

/**
 *
 * @author lucas
 */
public interface ICrud<T> {
    public void salvar(T t);
    public List<T> consultarTodos();
    public T consultarPorId(int id);
    public void excluir(int id);
    public void update(T t);
    
}
