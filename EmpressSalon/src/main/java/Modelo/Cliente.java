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
public class Cliente {
    private int id;
    private String nome;
    private char sexo;
    private Date dataAniv;
    private String telefone;
    private String email;
    private String cpf;
    private String endereco;
    private String cep;

    public Cliente(int id, String nome, char sexo, Date dataAniv, String telefone, String email, String cpf, String endereco, String cep) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataAniv = dataAniv;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, char sexo, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
    }
    
    
    public void setId(int id){ this.id=id;}
    public int getId(){return id;}
    public void setNome(String nome){ this.nome=nome;}
    public String getNome(){return nome;}
    public void setSexo(char sexo){this.sexo=sexo;}
    public char getSexo(){return sexo;}
    public void setDate(Date dataAniv){this.dataAniv=dataAniv;}
    public Date getDataAniv(){return dataAniv;}
    public void setTelefone(String telefone){this.telefone=telefone;}
    public String getTelefone(){return telefone;}
    public void setEmail(String email){ this.email=email;}
    public String getEmail(){return email;}
    public void setCpf(String cpf){this.cpf=cpf;}
    public String getCpf(){return cpf;}
    public void setEndereco(String endereco){this.endereco=endereco;}
    public String getEndereco(){return endereco;}
    public void setCep(String cep){this.cep=cep;}
    public String getCep(){return cep;}
    
    
    
    
    
    
}
