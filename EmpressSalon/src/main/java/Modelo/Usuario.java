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
public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private String nivelAcesso;
    private char sexo;
    private Date dataAniv;
    private String telefone;
    private String email;
    private String cpf;

    public Usuario(int id, String nome, String senha, String nivelAcesso, char sexo, Date dataAniv, String telefone, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.sexo = sexo;
        this.dataAniv = dataAniv;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}
    public String getNivelAcesso() {return nivelAcesso;}
    public void setNivelAcesso(String nivelAcesso) {this.nivelAcesso = nivelAcesso;}
    public char getSexo() {return sexo;}
    public void setSexo(char sexo) {this.sexo = sexo;}
    public Date getDataAniv() {return dataAniv;}
    public void setDataAniv(Date dataAniv) {this.dataAniv = dataAniv;}
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    
}
