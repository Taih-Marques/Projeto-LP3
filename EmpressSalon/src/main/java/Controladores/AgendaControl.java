/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Controladores.ajudah.AgendaHelper;
import Modelo.Agendamento;
import Modelo.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Tay
 */
public class AgendaControl {
    private final Agenda view;
    private final AgendaHelper ajudah;

    public AgendaControl(Agenda view) {
        this.view = view;
        this.ajudah = new AgendaHelper(view);
    }
    
    public void attTabela(){
        //Buscar lista com agendamento no Banco
       AgendamentoDAO agendaDao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendaDao.selectAll();
        //exibir a lista na view
        
        ajudah.preencherTab(agendamentos);
        
    }
    
}
