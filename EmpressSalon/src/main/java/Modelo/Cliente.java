package Modelo;

import java.util.Date;

/**
 *
 * @author Tay
 */
public class Cliente extends Pessoa{
    protected String endereco;
    protected String cep;

    public Cliente(String endereco, String cep, int id, String nome, char sexo, String dataAniv, String telefone, String email, String cpf) {
        super(id, nome, sexo, dataAniv, telefone, email, cpf);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    public Cliente(int id, String nome, String endereco, String cep){
        super(id,nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}
    

}
