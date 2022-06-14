/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controladores.MenuControl;

/**
 *
 * @author Tay
 */
public class Menu extends javax.swing.JFrame {

    private final MenuControl control;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.control = new MenuControl(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundoMenu = new javax.swing.JLabel();
        MenuOpcao = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Servico = new javax.swing.JMenuItem();
        usuario = new javax.swing.JMenuItem();
        operacao = new javax.swing.JMenu();
        Agenda = new javax.swing.JMenuItem();
        Relatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FundoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgendaFundo.png"))); // NOI18N

        Cadastro.setText("Cadastro");

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/female-hair-shape-and-face-silhouette.png"))); // NOI18N
        Cliente.setText("Cliente");
        Cadastro.add(Cliente);

        Servico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scissor-and-comb.png"))); // NOI18N
        Servico.setText("Serviço");
        Cadastro.add(Servico);

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/engrenagem.png"))); // NOI18N
        usuario.setText("Usuario");
        Cadastro.add(usuario);

        MenuOpcao.add(Cadastro);

        operacao.setText("Operação");

        Agenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tay\\Documents\\GitHub\\Projeto-LP3\\EmpressSalon\\src\\main\\resources\\View\\imagens\\icons\\agenda-icon.png")); // NOI18N
        Agenda.setText("Agenda");
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        operacao.add(Agenda);

        MenuOpcao.add(operacao);

        Relatorio.setText("Relatorio");
        MenuOpcao.add(Relatorio);

        setJMenuBar(MenuOpcao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FundoMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        this.control.navegarParaAgenda();
        
    }//GEN-LAST:event_AgendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agenda;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JLabel FundoMenu;
    private javax.swing.JMenuBar MenuOpcao;
    private javax.swing.JMenu Relatorio;
    private javax.swing.JMenuItem Servico;
    private javax.swing.JMenu operacao;
    private javax.swing.JMenuItem usuario;
    // End of variables declaration//GEN-END:variables
}
