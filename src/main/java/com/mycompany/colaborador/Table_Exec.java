//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Table_Exec extends javax.swing.JFrame {
    private static Table_Exec show_table_exec; 
    public Table_Exec() {
        initComponents();
    }
    
    public static Table_Exec getTable_Exec(){
        if(show_table_exec == null) {
            show_table_exec = new Table_Exec();
        }
        
        return show_table_exec;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tab_Exec = new javax.swing.JTable();
        saida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Geral - Executor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Tab_Exec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Sector", "Function", "Load", "IPE", "Salary"
            }
        ));
        Tab_Exec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_ExecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tab_Exec);

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
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saida)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(saida)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void Tab_ExecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_ExecMouseClicked
        selectTab();
    }//GEN-LAST:event_Tab_ExecMouseClicked

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
    
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel)Tab_Exec.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Executor exec : Banco.getBanco().getBdExecutor()){
            tabModel.insertRow(posLin, new Object[]{exec.getId(), exec.getNome(),exec.getSetor(), exec.getFuncao(), exec.getCarga(), exec.getEpi(), exec.getSalario().getMensalista()} );
            posLin++;
        }
    }
    public void selectTab(){
        String[] enunciado = {"ID: ", "Name: ", "Sector: ", "Function: ", "Daily load: ", " Correct use of IPE: ", "Salary: "};
        String valLin = "";
        int posLin = Tab_Exec.getSelectedRow();
        
        for(int col = 0; col < Tab_Exec.getColumnCount(); col++){
            valLin += enunciado[col] + Tab_Exec.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < Tab_Exec.getColumnCount()){
                valLin += "\n";
            }
        }
        JOptionPane.showMessageDialog(
            null,
            "\n"+valLin,
            "EXECUTOR",
            2
        );
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tab_Exec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saida;
    // End of variables declaration//GEN-END:variables
}
