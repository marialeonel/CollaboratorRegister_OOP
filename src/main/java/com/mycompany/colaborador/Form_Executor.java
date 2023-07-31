//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class Form_Executor extends javax.swing.JFrame {
    
    private Executor exec = new Executor();
    private static Form_Executor formExec;
    
    public Form_Executor() {
        setLocationRelativeTo(null);
        initComponents();
    }

    public static Form_Executor getForm_Executor(){
        if (formExec == null) {
            formExec = new Form_Executor();
        }
        return formExec;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        Id_Exec = new javax.swing.JLabel();
        Cx_Id_Exec = new javax.swing.JTextField();
        Nome_Exec = new javax.swing.JLabel();
        Cx_Nome_Exec = new javax.swing.JTextField();
        Setor_Exec = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cx_Setor_Exec = new javax.swing.JTextField();
        Cx_Funcao_Exec = new javax.swing.JTextField();
        Cx_Admissao_Exec = new javax.swing.JTextField();
        Carga_Exec = new javax.swing.JLabel();
        Cx_Carga_Exec = new javax.swing.JTextField();
        Epi_Exec = new javax.swing.JLabel();
        Cx_Epi_Exec = new javax.swing.JTextField();
        Salario_Exec = new javax.swing.JLabel();
        Cx_Salario_Exec = new javax.swing.JTextField();
        INSERIR = new javax.swing.JButton();
        CONSULTAR = new javax.swing.JButton();
        ALTERAR = new javax.swing.JButton();
        EXCLUIR = new javax.swing.JButton();
        TOTAL = new javax.swing.JButton();
        SAIR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro - Executor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("EXECUTOR");

        Id_Exec.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Id_Exec.setText("ID:");

        Cx_Id_Exec.setBackground(new java.awt.Color(204, 204, 255));

        Nome_Exec.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Nome_Exec.setText("NAME:");

        Setor_Exec.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Setor_Exec.setText("SECTOR:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("FUNCTION:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("ADMISSION (dd/mm/aaaa):");

        Carga_Exec.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Carga_Exec.setText("DAILY LOAD:");

        Epi_Exec.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Epi_Exec.setText("CORRECT USE OF EPI:");

        Salario_Exec.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Salario_Exec.setText("SALARY:");

        INSERIR.setText("Insert");
        INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERIRActionPerformed(evt);
            }
        });

        CONSULTAR.setText("Consult");
        CONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTARActionPerformed(evt);
            }
        });

        ALTERAR.setText("Alter");
        ALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERARActionPerformed(evt);
            }
        });

        EXCLUIR.setText("Delete");
        EXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIRActionPerformed(evt);
            }
        });

        TOTAL.setText("General Report");
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });

        SAIR.setText("Exit");
        SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Setor_Exec)
                                    .addComponent(Nome_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Id_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(172, 172, 172)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cx_Setor_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Id_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Nome_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Epi_Exec)
                                    .addComponent(Salario_Exec)
                                    .addComponent(Carga_Exec)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cx_Salario_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Funcao_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Admissao_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Carga_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Epi_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(INSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CONSULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TOTAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))))
                    .addComponent(jLabel1))
                .addGap(12, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_Exec)
                    .addComponent(Cx_Id_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cx_Nome_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome_Exec))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Setor_Exec)
                    .addComponent(Cx_Setor_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cx_Funcao_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cx_Admissao_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carga_Exec)
                    .addComponent(Cx_Carga_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Epi_Exec)
                    .addComponent(Cx_Epi_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salario_Exec)
                    .addComponent(Cx_Salario_Exec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSERIR)
                    .addComponent(ALTERAR)
                    .addComponent(EXCLUIR)
                    .addComponent(CONSULTAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAIR)
                    .addComponent(TOTAL))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERARActionPerformed
       altExec();
    }//GEN-LAST:event_ALTERARActionPerformed

    private void INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERIRActionPerformed
        cadExec();
    }//GEN-LAST:event_INSERIRActionPerformed

    private void CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTARActionPerformed
        consExec();
    }//GEN-LAST:event_CONSULTARActionPerformed

    private void EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIRActionPerformed
        excExec();
    }//GEN-LAST:event_EXCLUIRActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        Table_Exec.getTable_Exec().setVisible(true);
    }//GEN-LAST:event_TOTALActionPerformed

    private void SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRActionPerformed
        saida();
    }//GEN-LAST:event_SAIRActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated
    public void limpeza(){
        Cx_Id_Exec.setText("");
        Cx_Nome_Exec.setText("");
        Cx_Setor_Exec.setText("");
        Cx_Funcao_Exec.setText("");
        Cx_Admissao_Exec.setText("");
        Cx_Carga_Exec.setText("");
        Cx_Epi_Exec.setText("");
        Cx_Salario_Exec.setText("");

        Cx_Id_Exec.requestFocus();
    }
    
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
    
    public void cadExec(){
        try {
            exec = new Executor();
            exec.setId(Integer.parseInt(Cx_Id_Exec.getText()));
            exec.setNome(Cx_Nome_Exec.getText());
            exec.setSetor(Cx_Setor_Exec.getText());
            exec.setFuncao(Cx_Funcao_Exec.getText());
            exec.setAdmissao(Cx_Admissao_Exec.getText());
            exec.setCarga(Integer.parseInt(Cx_Carga_Exec.getText()));
            exec.setEpi(Cx_Epi_Exec.getText());
            exec.getSalario().setMensalista(Double.parseDouble(Cx_Salario_Exec.getText()));
        
            exec = Banco.getBanco().cadExec(exec);
        
        
            if(exec != null){
                JOptionPane.showMessageDialog(
                    null,
                    "Collaborator registered with success!",
                    "Collaborator's register - Executor",
                    1
                );
            } 
            else{
                JOptionPane.showMessageDialog(
                    null,
                    "DUPLICATED ID!",
                    "ERROR",
                    1
                );         
            }   
            limpeza();
        }
        
        catch(NumberFormatException nee) {
            JOptionPane.showMessageDialog(
                null,
                "What you typed must be a number!",
                "ERROR",
                1
            );
            
            Cx_Id_Exec.setText("");
            Cx_Carga_Exec.setText("");
            Cx_Salario_Exec.setText("");
            
            Cx_Id_Exec.requestFocus();
            Cx_Carga_Exec.requestFocus();
            Cx_Salario_Exec.requestFocus(); 
        }
        
        catch(CaracterErrException cee) {
            JOptionPane.showMessageDialog(
                null,
                "What you typed must be between 6 and 50 characters long!",
                "ERROR",
                1
            );
            
            Cx_Nome_Exec.setText("");
            Cx_Setor_Exec.setText("");
            Cx_Funcao_Exec.setText("");
            
            Cx_Nome_Exec.requestFocus();
            Cx_Setor_Exec.requestFocus();
            Cx_Funcao_Exec.requestFocus();  
        }
        
        catch(SalErrException saee) {
            JOptionPane.showMessageDialog(
                null,
                "Monthly salary: minimum of 1302,00!",
                "ERROR",
                1
            );
            
            Cx_Salario_Exec.setText("");
            Cx_Salario_Exec.requestFocus();
        }
        
        catch(DataErrException dee) {
            JOptionPane.showMessageDialog(
                null,
                "The date must be in the format: dd/mm/yyyy. For example: 01/01/1900.",
                "ERROR",
                1
            );
            
            Cx_Admissao_Exec.setText("");
            Cx_Admissao_Exec.requestFocus();
        }
        
        catch(CargaErrException caee) {
            JOptionPane.showMessageDialog(
                null,
                "\nMinimum load: 1 kg \nMaximum load: 60 kg.",
                "ERROR",
                1
            );
            
            Cx_Carga_Exec.setText("");
            Cx_Carga_Exec.requestFocus();
        } 
        
        catch(DicotomicaErrException dee) {
            JOptionPane.showMessageDialog(
                null,
                "\nUsually use IPE (Individual Protection Equipment) correctly?\nIf 'YES' = type 'Y' \nIf 'NO' = type 'N'",
                "ERROR",
                1
            );
            
            Cx_Epi_Exec.setText("");
            Cx_Epi_Exec.requestFocus();
        }
        
    }
    
    public void consExec(){
        exec = new Executor();
        exec.setId(Integer.parseInt(Cx_Id_Exec.getText()));
        
        exec = Banco.getBanco().consIdExec(exec);
        
        if(exec != null){
            Cx_Id_Exec.setText(Integer.toString(exec.getId()));
            Cx_Nome_Exec.setText(exec.getNome());
            Cx_Setor_Exec.setText(exec.getSetor());
            Cx_Funcao_Exec.setText(exec.getFuncao());
            Cx_Admissao_Exec.setText(exec.getAdmissao());
            Cx_Carga_Exec.setText(Integer.toString(exec.getCarga()));
            Cx_Epi_Exec.setText(exec.getEpi());
            Cx_Salario_Exec.setText(Double.toString(exec.getSalario().getMensalista()));

            JOptionPane.showMessageDialog(
                null,
                "Collaborator found!",
                "Consultation of Employees of the Executor type",
                1
            ); 
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Collaborator not found!",
                "Consultation of Employees of the Executor type",
                1
            ); 
        }
        
        limpeza();  
    }
    
    public void altExec(){
        exec = new Executor();
        exec.setId(Integer.parseInt(Cx_Id_Exec.getText()));
        
        exec = Banco.getBanco().altIdExec(exec);
        
        if(exec != null){
            Cx_Setor_Exec.setText(exec.getSetor());
            Cx_Funcao_Exec.setText(exec.getFuncao());
            Cx_Epi_Exec.setText(exec.getEpi());
            Cx_Salario_Exec.setText(Double.toString(exec.getSalario().getMensalista()));
            
            JOptionPane.showMessageDialog(
                null,
                "Employee successfully changed!",
                "SUCESS",
                1
            ); 
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Collaborator NOT found!",
                "ERROR",
                1
            ); 
        }
        
        limpeza();
    }
    
    public void excExec() {
        exec = new Executor();
        exec.setId(Integer.parseInt(Cx_Id_Exec.getText()));
        
        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Do you really want to delete the collaborator?",
            "Collaborator's delete",
            JOptionPane.YES_NO_OPTION
        );

        if(confirm == 0){
            exec = Banco.getBanco().delIdExec(exec);
            
            if(exec != null){
                JOptionPane.showMessageDialog(
                    null,
                    "ID not found!",
                    "ERROR",
                    1
                ); 
            }
            else{
                JOptionPane.showMessageDialog(
                    null,
                    "Collaborator deleted with success!",
                    "SUCCESS",
                    1
                ); 
            }
        }
        else {
            limpeza();
        }
        
        limpeza();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTERAR;
    private javax.swing.JButton CONSULTAR;
    private javax.swing.JLabel Carga_Exec;
    private javax.swing.JTextField Cx_Admissao_Exec;
    private javax.swing.JTextField Cx_Carga_Exec;
    private javax.swing.JTextField Cx_Epi_Exec;
    private javax.swing.JTextField Cx_Funcao_Exec;
    private javax.swing.JTextField Cx_Id_Exec;
    private javax.swing.JTextField Cx_Nome_Exec;
    private javax.swing.JTextField Cx_Salario_Exec;
    private javax.swing.JTextField Cx_Setor_Exec;
    private javax.swing.JButton EXCLUIR;
    private javax.swing.JLabel Epi_Exec;
    private javax.swing.JButton INSERIR;
    private javax.swing.JLabel Id_Exec;
    private javax.swing.JLabel Nome_Exec;
    private javax.swing.JButton SAIR;
    private javax.swing.JLabel Salario_Exec;
    private javax.swing.JLabel Setor_Exec;
    private javax.swing.JButton TOTAL;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

