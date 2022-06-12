/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import View.Login;

/**
 *
 * @author Tay
 */
public class LoginControl {

    private final Login view;

    public LoginControl(Login view) {
        this.view = view;
    }
    
    public void fizTarefa(){
        System.out.println("Busca no banco de Dados ");
        this.view.exibeMensagem("Executado");
    }
    
}
