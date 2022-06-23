/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Controladores.ajudah.AgendaHelper;
import Modelo.Agendamento;
import Modelo.Cliente;
import Modelo.DAO.AgendamentoDAO;
import Modelo.DAO.ClienteDAO;
import Modelo.DAO.ServicoDAO;
import Modelo.Servico;
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

    public void attTabela() {
        //Buscar lista com agendamento no Banco
        AgendamentoDAO agendaDao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendaDao.selectAll();
        //exibir a lista na view

        ajudah.preencherTab(agendamentos);

    }

    public void attCliente() {
        //buscar clientes no Banco
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();

        //Exibir clientes no combobox cliente
        ajudah.preencherCli(clientes);

    }

    public void attServico() {
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();

        ajudah.preencherServ(servicos);
    }

    public void attValor() {
        Servico servico = ajudah.obterServico();
        ajudah.apontarValor(servico.getValor());

    }

    public void agendar() {
        //buscar da tela objeto agendamento
        Agendamento agendamento = ajudah.obterModelo();
        //salvar banco de dado
        new AgendamentoDAO().insert(agendamento);
        //inserir na tabela
        attTabela();
        ajudah.limparTela();
    }

}
