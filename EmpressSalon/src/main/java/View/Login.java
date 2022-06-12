package View;

import Controladores.LoginControl;
import Modelo.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Tay
 */
public class Login extends javax.swing.JFrame {

    private final LoginControl controladores;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controladores = new LoginControl(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entrar = new javax.swing.JButton();
        SenhaUsuario = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        FundoTransparente = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Entrar.setBackground(new java.awt.Color(51, 51, 51));
        Entrar.setFont(new java.awt.Font("Por Siempre Gótica", 0, 18)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 292, 180, 30));
        getContentPane().add(SenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 180, 30));

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 180, 30));

        Senha.setFont(new java.awt.Font("Por Siempre Gótica", 1, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Senha");
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 40, -1));

        Usuario.setFont(new java.awt.Font("Por Siempre Gótica", 1, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, 20));

        Login.setFont(new java.awt.Font("Por Siempre Gótica", 0, 36)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        FundoTransparente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tay\\Documents\\GitHub\\Projeto-LP3\\EmpressSalon\\src\\main\\resources\\View\\imagens\\Agenda-PainelFundo.png")); // NOI18N
        getContentPane().add(FundoTransparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, 190));

        Logo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        // executa botao entrar
           this.controladores.fizTarefa();
         
    }//GEN-LAST:event_EntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel FundoTransparente;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField SenhaUsuario;
    private javax.swing.JLabel Usuario;
    private javax.swing.JTextField campoUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
      
    }

    public JPasswordField getSenhaUsuario() {
        return SenhaUsuario;
    }

    public void setSenhaUsuario(JPasswordField SenhaUsuario) {
        this.SenhaUsuario = SenhaUsuario;
    }

    public JTextField getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(JTextField campoUsuario) {
        this.campoUsuario = campoUsuario;
    }
    
}
