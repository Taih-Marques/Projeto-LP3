    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.ajudah;

import Modelo.Agendamento;
import Modelo.Cliente;
import Modelo.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tay
 */
public class AgendaHelper implements HelpGeral{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTab(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabAgendamento().getModel();
        tableModel.setNumRows(0);
        
        ///percorrer a lista preenchendo o tabModel
        
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataForm(),
                agendamento.getHoraForm(),
                agendamento.getObs()
            });
            
        }
        
    }

    public void preencherCli(ArrayList<Cliente> clientes) {
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboCliente().getModel();
      
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);//truk aq
            
        }
    }

    public void preencherServ(ArrayList<Servico> servicos) {
       
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboServico().getModel();
       
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }

    public Cliente obterCliente() {
       return (Cliente) view.getComboCliente().getSelectedItem();
      
    }
    public Servico obterServico() {
       return (Servico) view.getComboServico().getSelectedItem();
      
    }

    public void apontarValor(float valor) {
      view.getTextValor().setText(valor +"");
    } 

    @Override
    public Agendamento obterModelo() {
        String idString = view.getTextID().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente= obterCliente();
        Servico servico = obterServico();
        String valorString= view.getTextValor().getText();
        float valor= Float.parseFloat(valorString);
        String data= view.getTextData().getText();
        String hora= view.getTextHora().getText();
        String dataHora= data + " " + hora;
        String obs = view.getTextObs().getText();
        
        Agendamento agendamento= new Agendamento(id, cliente, servico, valor, dataHora, obs);
        return agendamento;
         //new Agendamento(); 
         
    }

    @Override
    public void limparTela() {
        view.getTextID().setText("0");
        view.getTextData().setText("");
        view.getTextHora().setText("");
        view.getTextObs().setText("");
    }
    
    
   
    
}
