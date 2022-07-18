/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import Modelo.Agendamento;

/**
 *
 * @author Tay
 */
public class Correio {
    
    public void notificacao(Agendamento agendamento){
        String modeloEmail = formatEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        //uso da classe de email
        Email email = new Email ("Agendamento Empress Salon", modeloEmail, destinatario);
        email.enviar();
        
    }

    private String formatEmail(Agendamento agendamento) {
        String clienteNome = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String agendamentoData = agendamento.getDataForm();
        String agendamentoHora = agendamento.getHoraForm();
        Float valor = agendamento.getValor();
        
        return "Prezado cliente, \n"+ clienteNome+ 
                "Seu agendamento para" + servico + "no dia "+ agendamentoData+ "às: "+ agendamentoHora + 
                "foi marcado com sucesso. \n Valor a ser pago:"+ valor+"Atenciosamente, \n Empress Salon";
    }
    
    
}
