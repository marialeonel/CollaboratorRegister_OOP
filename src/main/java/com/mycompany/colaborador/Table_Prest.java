//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Table_Prest extends javax.swing.JFrame {
    private static Table_Prest show_table_prest;
    
    public Table_Prest() {
        initComponents();
    }

    public static Table_Prest getTable_Prest(){
        if(show_table_prest == null) {
            show_table_prest = new Table_Prest();
        }
        
        return show_table_prest;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tab_Prest = new javax.swing.JTable();
        saida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Geral - Prestador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Tab_Prest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Sector", "Function", "Admission", "Dismissal", "Interest", "Salary (hourly rate)", "Weekly Hours"
            }
        ));
        Tab_Prest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_PrestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tab_Prest);
        if (Tab_Prest.getColumnModel().getColumnCount() > 0) {
            Tab_Prest.getColumnModel().getColumn(7).setResizable(false);
            Tab_Prest.getColumnModel().getColumn(8).setResizable(false);
        }

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
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saida)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(saida)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    private void Tab_PrestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_PrestMouseClicked
        selectTab();
    }//GEN-LAST:event_Tab_PrestMouseClicked

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
        String[] enunciado = {"ID: ", "Name: ", "Sector: ", "Funtion: ", "Admission: ", "Dismissal: ", "Salary(hourly rate): ", "Weekly Hours: "};
        String valLin = "";
        int posLin = Tab_Prest.getSelectedRow();
        
        for(int col = 0; col < Tab_Prest.getColumnCount(); col++){
            valLin += enunciado[col] + Tab_Prest.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < Tab_Prest.getColumnCount()){
                valLin += "\n";
            }
        }
        JOptionPane.showMessageDialog(
            null,
            "\n"+valLin,
            "PRESTADOR",
            2
        );
       
    }
    
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel)Tab_Prest.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Prestador prest : Banco.getBanco().getBdPrestador()){
            tabModel.insertRow(posLin, new Object[]{prest.getId(),prest.getNome(), prest.getSetor(), prest.getFuncao(), prest.getAdmissao(), prest.getDemissao(), prest.getSalario().getHorista(), prest.getSalario().getHoras()} );
            posLin++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tab_Prest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saida;
    // End of variables declaration//GEN-END:variables
}
