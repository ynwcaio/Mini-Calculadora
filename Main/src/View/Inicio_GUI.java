package View;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Inicio_GUI extends javax.swing.JFrame {

    public Inicio_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sla3 = new javax.swing.JLabel();
        sla = new javax.swing.JLabel();
        valor1_txt = new javax.swing.JTextField();
        fechar_BTN = new javax.swing.JButton();
        valor2_txt = new javax.swing.JTextField();
        sla2 = new javax.swing.JLabel();
        Multi_BTN = new javax.swing.JButton();
        Somar_BTN = new javax.swing.JButton();
        Sub_BTN = new javax.swing.JButton();
        Div_BTN = new javax.swing.JButton();
        r_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULADORA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N
        jPanel1.setLayout(null);

        sla3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        sla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sla3.setText("RESULTADO :");
        jPanel1.add(sla3);
        sla3.setBounds(70, 170, 140, 50);

        sla.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        sla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sla.setText("VALOR 1 :");
        jPanel1.add(sla);
        sla.setBounds(110, 50, 100, 50);
        jPanel1.add(valor1_txt);
        valor1_txt.setBounds(229, 60, 220, 40);

        fechar_BTN.setBackground(new java.awt.Color(0, 0, 0));
        fechar_BTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        fechar_BTN.setForeground(new java.awt.Color(255, 255, 255));
        fechar_BTN.setText("FECHAR");
        fechar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(fechar_BTN);
        fechar_BTN.setBounds(530, 30, 190, 60);
        jPanel1.add(valor2_txt);
        valor2_txt.setBounds(230, 120, 220, 40);

        sla2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        sla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sla2.setText("VALOR 2 :");
        jPanel1.add(sla2);
        sla2.setBounds(110, 110, 100, 50);

        Multi_BTN.setBackground(new java.awt.Color(0, 0, 0));
        Multi_BTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Multi_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Multi_BTN.setText("MULTIPLICAR");
        Multi_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Multi_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Multi_BTN);
        Multi_BTN.setBounds(40, 280, 190, 60);

        Somar_BTN.setBackground(new java.awt.Color(0, 0, 0));
        Somar_BTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Somar_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Somar_BTN.setText("SOMAR");
        Somar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Somar_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Somar_BTN);
        Somar_BTN.setBounds(670, 280, 190, 60);

        Sub_BTN.setBackground(new java.awt.Color(0, 0, 0));
        Sub_BTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Sub_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Sub_BTN.setText("SUBTRAIR");
        Sub_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sub_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Sub_BTN);
        Sub_BTN.setBounds(450, 280, 190, 60);

        Div_BTN.setBackground(new java.awt.Color(0, 0, 0));
        Div_BTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Div_BTN.setForeground(new java.awt.Color(255, 255, 255));
        Div_BTN.setText("DIVIDIR");
        Div_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Div_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Div_BTN);
        Div_BTN.setBounds(250, 280, 190, 60);

        r_txt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        r_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(r_txt);
        r_txt.setBounds(230, 170, 170, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 380);

        setSize(new java.awt.Dimension(898, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fechar_BTNActionPerformed

    private void Multi_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Multi_BTNActionPerformed
        Controller.Calcula_DAO.multiplicacao();
    }//GEN-LAST:event_Multi_BTNActionPerformed

    private void Somar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Somar_BTNActionPerformed
         Controller.Calcula_DAO.soma();
    }//GEN-LAST:event_Somar_BTNActionPerformed

    private void Sub_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sub_BTNActionPerformed
        Controller.Calcula_DAO.subtracao();
    }//GEN-LAST:event_Sub_BTNActionPerformed

    private void Div_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Div_BTNActionPerformed
       Controller.Calcula_DAO.divisao();
    }//GEN-LAST:event_Div_BTNActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Div_BTN;
    public static javax.swing.JButton Multi_BTN;
    public static javax.swing.JButton Somar_BTN;
    public static javax.swing.JButton Sub_BTN;
    public static javax.swing.JButton fechar_BTN;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel r_txt;
    public static javax.swing.JLabel sla;
    public static javax.swing.JLabel sla2;
    public static javax.swing.JLabel sla3;
    public static javax.swing.JTextField valor1_txt;
    public static javax.swing.JTextField valor2_txt;
    // End of variables declaration//GEN-END:variables
}
