/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.ajudah;

import Modelo.Usuario;
import View.Login;

/**
 *
 * @author Tay
 */
public class LoginHelper {

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Usuario obterModel() {
        String nome = view.getCampoUsuario().getText();
        String senha = view.getSenhaUsuario().getText();

        Usuario modelo = new Usuario(0, nome, senha);

        return modelo;
    }

    public void setarModel(Usuario modelo) {
        String nome = modelo.getNome();
        String senha = modelo.getSenha();

        view.getCampoUsuario().setText(nome);
        view.getSenhaUsuario().setText(senha);
    }

    public void limparTela() {
        view.getCampoUsuario().setText("");
        view.getSenhaUsuario().setText("");
    }

}
