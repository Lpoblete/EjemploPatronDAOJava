/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author LeandroAndres
 */
public class ClienteDAO implements DAO<Cliente,String> {

    final ArrayList<Cliente> clies = new ArrayList<>();

    @Override
    public ArrayList listar() {
        return clies;
    }

    @Override
    public void insertar(Cliente x) {
        clies.add(x);
    }

    @Override
    public void modificar(Cliente x) {
        
        for(int i = 0;i<clies.size();i++)
        {
            if(clies.get(i).getRut().equals(x.getRut()))
            {
                System.out.println("modificando a: " + clies.get(i).getNombre());
                clies.remove(i);
                clies.add(x);
            }
        }
    }

    @Override
    public void eliminar(String y) {
        for(int i = 0;i<clies.size();i++)
        {
            if(clies.get(i).getRut().equals(y))
            {
                System.out.println("eliminando a: " + clies.get(i).getNombre());
                clies.remove(i);
            }
        }
    }
    
    //metodos y funciones exclusivas
    
    public Cliente buscarCliente(String rut)
    {
        for(int i = 0;i<clies.size();i++)
        {
            if(clies.get(i).getRut().equals(rut))
            {
                return clies.get(i);
            }
        }
        return null;
    }
}
