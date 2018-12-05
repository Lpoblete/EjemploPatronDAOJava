/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoproject;

import classes.Cliente;
import classes.ClienteDAO;

/**
 *
 * @author LeandroAndres
 */
public class DAOProject {

    public static void main(String[] args) {
        // TODO code application logic here
        ClienteDAO clieDAO = new ClienteDAO();
        Cliente clie = new Cliente();

        clie.setRut("19481438-0");
        clie.setEdad(22);
        clie.setNombre("Leandro");
        clieDAO.insertar(clie);
        clie = new Cliente();

        clie.setRut("17812465-K");
        clie.setEdad(30);
        clie.setNombre("Alejandro");
        clieDAO.insertar(clie);
        clie = new Cliente();

        clie.setRut("18469733-5");
        clie.setEdad(26);
        clie.setNombre("Leonardo");
        clieDAO.insertar(clie);
        clie = new Cliente();

        System.out.println("clientes: " + clieDAO.listar());

        clieDAO.eliminar("17812465-K");

        System.out.println("clientes: " + clieDAO.listar());

        clie.setRut("18469733-5");
        clie.setEdad(30);
        clie.setNombre("Leonardo el Leopardo");
        clieDAO.modificar(clie);

        System.out.println("clientes: " + clieDAO.listar());
        
        System.out.println("cliente: " + clieDAO.buscarCliente("19481438-0"));
        
        System.out.println("cliente: " + clieDAO.buscarCliente("17812465-K"));
    }

}
