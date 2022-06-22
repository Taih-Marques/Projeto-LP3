/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores.ajudah;

import Modelo.Agendamento;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tay
 */
public class AgendaHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTab(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel)view.getTabAgendamento().getModel();
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
    
   
    
}
