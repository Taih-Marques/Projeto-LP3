/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Controladores.ajudah.LoginHelper;
import Modelo.Usuario;
import View.Login;

/**
 *
 * @author Tay
 */
public class LoginControl {

    private final Login view;
    private LoginHelper helper;

    public LoginControl(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    public void entrarNoSistema(){ 
        //pegar um usuario da view    
        Usuario usuario = helper.obterModel();
       
        //pesquisar no banco
        //se ambos forem iguais, redirecionar pro menu
        // se nao, mostrar msg de usuario ou senha incorreta
        
    }
    public void fizTarefa(){
        System.out.println("Busca no banco de Dados ");
        this.view.exibeMensagem("Executado");
    }
    
}
