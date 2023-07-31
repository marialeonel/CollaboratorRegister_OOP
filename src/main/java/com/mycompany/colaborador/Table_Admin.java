//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Table_Admin extends javax.swing.JFrame {
    private static Table_Admin show_table_admin;

    public Table_Admin() {
        initComponents();
    }
    
    public static Table_Admin getTable_Admin(){
        if(show_table_admin == null) {
            show_table_admin = new Table_Admin();
        }
        
        return show_table_admin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tab_Admin = new javax.swing.JTable();
        saida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Geral - Administrativo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Tab_Admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Sector", "Function", "Admission", "University", "Course", "Status", "Salary"
            }
        ));
        Tab_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_AdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tab_Admin);

        saida.setText("Exit");
        saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saida)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(saida)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void Tab_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_AdminMouseClicked
        selectTab();
    }//GEN-LAST:event_Tab_AdminMouseClicked

    private void saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaActionPerformed
        saida();
    }//GEN-LAST:event_saidaActionPerformed
    public void saida(){
        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Do you really want to leave?",
            "Closing the table...",
            JOptionPane.YES_NO_OPTION
        );

        if(confirm == 0){
            dispose();
        }
    }
    public void selectTab(){
        String[] enunciado = {"ID: ", "Name: ", "Sector: ", "Function: ", "Admission: ", "University: ", "Course: ", "Course's Status: ", "Salary: "};
        String valLin = "";
        int posLin = Tab_Admin.getSelectedRow();
        
        for(int col = 0; col < Tab_Admin.getColumnCount(); col++){
            valLin += enunciado[col] + Tab_Admin.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < Tab_Admin.getColumnCount()){
                valLin += "\n";
            }
        }
        JOptionPane.showMessageDialog(
            null,
            "\n"+valLin,
            "ADMINISTRATIVO",
            2
        );
       
    }
    
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel)Tab_Admin.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Administrativo admin : Banco.getBanco().getBdAdmin()){
            tabModel.insertRow(posLin, new Object[]{admin.getId(),admin.getNome(), admin.getSetor(), admin.getFuncao(), admin.getAdmissao(), admin.getUniversidade(), admin.getCurso(), admin.getStatus(), admin.getSalario().getMensalista()} );
            posLin++;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tab_Admin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saida;
    // End of variables declaration//GEN-END:variables
}
