/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Controladores.ajudah.LoginHelper;
import Modelo.DAO.UsuarioDAO;
import Modelo.Usuario;
import View.Login;
import View.Menu;

/**
 *
 * @author Tay
 */
public class LoginControl {

    private final Login view;
    private final LoginHelper helper;

    public LoginControl(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() {
        //pegar um usuario da view    
        Usuario usuario = helper.obterModelo();

        //pesquisar no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        //se ambos forem iguais, redirecionar pro menu
        // se nao, mostrar msg de usuario ou senha incorreta
        if (usuarioAutenticado != null) {
            //navegar para menu
            Menu menu = new Menu();
            menu.setVisible(true);
            this.view.dispose();
        } else {
            view.exibeMensagem("Usuario ou senha invalidos");
        }

    }

    public void fizTarefa() {
        System.out.println("Busca no banco de Dados ");
        this.view.exibeMensagem("Executado");
    }

}
