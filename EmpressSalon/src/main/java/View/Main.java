/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Modelo.Cliente;
import Modelo.Servico;
import Modelo.Usuario;
import Modelo.Agendamento;

/**
 *
 * @author Tay
 */
public class Main {
    public static void main (String[] args){
      
    
        String nome= "tayh";
        System.out.println(nome);
        
        Servico corte = new Servico(1,"corte",30);
        System.out.println(corte.getDescricao());
        
        Cliente clien = new Cliente(1,"taih","90445","tajshdjasd");
        System.out.println(clien.getEndereco());
        Usuario usu= new Usuario(1, "taih","dagsdja");
        System.out.println(usu);
        Agendamento agen = new Agendamento(1,clien, corte,30, "08/02/2023 10:00");
        System.out.println(agen);
        System.out.println(agen.getCliente().getNome());
        


        
    }
}
