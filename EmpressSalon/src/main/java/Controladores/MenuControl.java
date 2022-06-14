/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import View.Agenda;
import View.Menu;

/**
 *
 * @author Tay
 */
public class MenuControl {
    private final Menu view;

    public MenuControl(Menu view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
     
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        this.view.dispose();
    
    }
    
    
}
