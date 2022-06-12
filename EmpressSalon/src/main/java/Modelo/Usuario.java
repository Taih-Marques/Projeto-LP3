/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Tay
 */
public class Usuario extends Pessoa {

    protected String senha;
    protected String nivelAcesso;
   
    public Usuario(int id, String nome, char sexo, String dataAniv, String telefone,
            String email, String cpf,String senha, String nivelAcesso) {
        super(id, nome, sexo, dataAniv, telefone, email, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    public Usuario(int id, String nome, String senha){
        super(id, nome);
        this.senha=senha;
    }
    
    
    public void setSenha(String senha){this.senha=senha;}
    public String getSenha(){return senha;}
    public void setNivelAcesso(String nivelAcesso){this.nivelAcesso=nivelAcesso;}
    public String getNivelAcesso(){return nivelAcesso;}
}
