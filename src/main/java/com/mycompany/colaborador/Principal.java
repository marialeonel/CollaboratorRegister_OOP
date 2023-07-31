//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Barra_Menu = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenu();
        Cad_Admin = new javax.swing.JMenuItem();
        Cad_Exec = new javax.swing.JMenuItem();
        Cad_Prest = new javax.swing.JMenuItem();
        Relatorio = new javax.swing.JMenu();
        Relat_Admin = new javax.swing.JMenuItem();
        Relat_Exec = new javax.swing.JMenuItem();
        Relat_Prest = new javax.swing.JMenuItem();
        Saida = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        title.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        title.setForeground(new java.awt.Color(153, 0, 102));
        title.setText("COLLABORATOR'S REGISTER");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Apache NetBeans IDE 17");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Maria Fernanda Leonel Bertelli");

        Menu.setText("Menu");

        Cadastro.setText("Register Collaborators");

        Cad_Admin.setText("Administrative...");
        Cad_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_AdminActionPerformed(evt);
            }
        });
        Cadastro.add(Cad_Admin);

        Cad_Exec.setText("Executor...");
        Cad_Exec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_ExecActionPerformed(evt);
            }
        });
        Cadastro.add(Cad_Exec);

        Cad_Prest.setText("Provider...");
        Cad_Prest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_PrestActionPerformed(evt);
            }
        });
        Cadastro.add(Cad_Prest);

        Menu.add(Cadastro);

        Relatorio.setText("General Report's Collaborators");

        Relat_Admin.setText("Administrative...");
        Relat_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relat_AdminActionPerformed(evt);
            }
        });
        Relatorio.add(Relat_Admin);

        Relat_Exec.setText("Executor...");
        Relat_Exec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relat_ExecActionPerformed(evt);
            }
        });
        Relatorio.add(Relat_Exec);

        Relat_Prest.setText("Provider...");
        Relat_Prest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Relat_PrestActionPerformed(evt);
            }
        });
        Relatorio.add(Relat_Prest);

        Menu.add(Relatorio);

        Saida.setText("Exit");
        Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaidaActionPerformed(evt);
            }
        });
        Menu.add(Saida);

        Barra_Menu.add(Menu);

        setJMenuBar(Barra_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(title)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cad_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_AdminActionPerformed
        Form_Administrativo.getForm_Administrativo().setVisible(true);
    }//GEN-LAST:event_Cad_AdminActionPerformed

    private void Relat_PrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relat_PrestActionPerformed
        Table_Prest.getTable_Prest().setVisible(true);
    }//GEN-LAST:event_Relat_PrestActionPerformed

    private void Cad_ExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_ExecActionPerformed
        Form_Executor.getForm_Executor().setVisible(true);
    }//GEN-LAST:event_Cad_ExecActionPerformed

    private void Cad_PrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_PrestActionPerformed
        Form_Prestador.getForm_Prestador().setVisible(true);
    }//GEN-LAST:event_Cad_PrestActionPerformed

    private void Relat_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relat_AdminActionPerformed
        Table_Admin.getTable_Admin().setVisible(true);
    }//GEN-LAST:event_Relat_AdminActionPerformed

    private void Relat_ExecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Relat_ExecActionPerformed
        Table_Exec.getTable_Exec().setVisible(true);
    }//GEN-LAST:event_Relat_ExecActionPerformed

    private void SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaidaActionPerformed
        saida();
    }//GEN-LAST:event_SaidaActionPerformed

    public void saida(){
        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Do you really want to leave?",
            "Closing the employee register...",
            JOptionPane.YES_NO_OPTION
        );

        if(confirm == 0){
            dispose();
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JMenuItem Cad_Admin;
    private javax.swing.JMenuItem Cad_Exec;
    private javax.swing.JMenuItem Cad_Prest;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem Relat_Admin;
    private javax.swing.JMenuItem Relat_Exec;
    private javax.swing.JMenuItem Relat_Prest;
    private javax.swing.JMenu Relatorio;
    private javax.swing.JMenuItem Saida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
