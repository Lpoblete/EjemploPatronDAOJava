/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

public interface DAO <X,Y>
{
    ArrayList<X> listar();
    void insertar(X x);
    void modificar(X x);
    void eliminar(Y y);
}
