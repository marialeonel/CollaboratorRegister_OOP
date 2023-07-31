//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class Form_Administrativo extends javax.swing.JFrame {
 
    private Administrativo admin = new Administrativo();
    private static Form_Administrativo formAdmin;
    
    public Form_Administrativo() {
        initComponents();
    }
    
    public static Form_Administrativo getForm_Administrativo(){
        if (formAdmin == null) {
            formAdmin = new Form_Administrativo();
        }
        return formAdmin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        Id_Admin = new javax.swing.JLabel();
        Nome_Admin = new javax.swing.JLabel();
        Cx_Admissao_Admin = new javax.swing.JTextField();
        Cx_Nome_Admin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Cx_Setor_Admin = new javax.swing.JTextField();
        Funcao_Admin = new javax.swing.JLabel();
        Cx_Funcao_Admin = new javax.swing.JTextField();
        Admissao_Admin = new javax.swing.JLabel();
        Cx_Id_Admin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cx_Uni_Admin = new javax.swing.JTextField();
        Curso_Admin = new javax.swing.JLabel();
        Cx_Curso_Admin = new javax.swing.JTextField();
        Status_Admin = new javax.swing.JLabel();
        Cx_Status_Admin = new javax.swing.JTextField();
        INSERIR = new javax.swing.JButton();
        CONSULTAR = new javax.swing.JButton();
        ALTERAR = new javax.swing.JButton();
        EXCLUIR = new javax.swing.JButton();
        TOTAL = new javax.swing.JButton();
        SAIR = new javax.swing.JButton();
        Salario_Admin = new javax.swing.JLabel();
        Cx_Salario_Admin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro - Administrativo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        title.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 153));
        title.setText("ADMINISTRATIVE");

        Id_Admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Id_Admin.setText("ID:");

        Nome_Admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Nome_Admin.setText("NAME:");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("SECTOR:");

        Funcao_Admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Funcao_Admin.setText("FUNCTION:");

        Admissao_Admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Admissao_Admin.setText("ADMISSION(dd/mm/aaaa):");

        Cx_Id_Admin.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("UNIVERSITY:");

        Curso_Admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Curso_Admin.setText("COURSE:");

        Status_Admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Status_Admin.setText("COURSE'S STATUS:");

        Cx_Status_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cx_Status_AdminActionPerformed(evt);
            }
        });

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

        Salario_Admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Salario_Admin.setText("SALARY:");

        Cx_Salario_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cx_Salario_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(INSERIR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CONSULTAR)
                        .addGap(63, 63, 63)
                        .addComponent(ALTERAR))
                    .addComponent(TOTAL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EXCLUIR)
                    .addComponent(SAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_Admin)
                    .addComponent(Id_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admissao_Admin)
                    .addComponent(jLabel1)
                    .addComponent(Funcao_Admin)
                    .addComponent(jLabel2)
                    .addComponent(Curso_Admin)
                    .addComponent(Status_Admin)
                    .addComponent(Salario_Admin))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cx_Funcao_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cx_Admissao_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cx_Setor_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cx_Nome_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cx_Id_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cx_Status_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Cx_Curso_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cx_Uni_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cx_Salario_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_Admin)
                    .addComponent(Cx_Id_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_Admin)
                    .addComponent(Cx_Nome_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cx_Setor_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Funcao_Admin)
                            .addComponent(Cx_Funcao_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admissao_Admin)
                    .addComponent(Cx_Admissao_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Cx_Uni_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso_Admin)
                    .addComponent(Cx_Curso_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Status_Admin)
                    .addComponent(Cx_Status_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salario_Admin)
                    .addComponent(Cx_Salario_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSERIR)
                    .addComponent(CONSULTAR)
                    .addComponent(ALTERAR)
                    .addComponent(EXCLUIR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SAIR)
                    .addComponent(TOTAL))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERIRActionPerformed
        cadAdmin();
        Table_Admin.getTable_Admin().listarTab();
    }//GEN-LAST:event_INSERIRActionPerformed

    private void CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTARActionPerformed
        consAdmin();
    }//GEN-LAST:event_CONSULTARActionPerformed

    private void ALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERARActionPerformed
        altAdmin();
        Table_Admin.getTable_Admin().listarTab();
    }//GEN-LAST:event_ALTERARActionPerformed

    private void EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIRActionPerformed
        excAdmin();
        Table_Admin.getTable_Admin().listarTab();
    }//GEN-LAST:event_EXCLUIRActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        Table_Admin.getTable_Admin().setVisible(true);
    }//GEN-LAST:event_TOTALActionPerformed

    private void SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRActionPerformed
        saida();
    }//GEN-LAST:event_SAIRActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void Cx_Status_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cx_Status_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cx_Status_AdminActionPerformed

    private void Cx_Salario_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cx_Salario_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cx_Salario_AdminActionPerformed

    public void limpeza(){
        Cx_Id_Admin.setText("");
        Cx_Nome_Admin.setText("");
        Cx_Setor_Admin.setText("");
        Cx_Funcao_Admin.setText("");
        Cx_Admissao_Admin.setText("");
        Cx_Uni_Admin.setText("");
        Cx_Curso_Admin.setText("");
        Cx_Status_Admin.setText("");
        Cx_Salario_Admin.setText("");
        
        Cx_Id_Admin.requestFocus();
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
    
    public void cadAdmin(){
        try {
            admin = new Administrativo();
            admin.setId(Integer.parseInt(Cx_Id_Admin.getText()));
            admin.setNome(Cx_Nome_Admin.getText());
            admin.setSetor(Cx_Setor_Admin.getText());
            admin.setFuncao(Cx_Funcao_Admin.getText());
            admin.setAdmissao(Cx_Admissao_Admin.getText());
            admin.setUniversidade(Cx_Uni_Admin.getText());
            admin.setCurso(Cx_Curso_Admin.getText());
            admin.setStatus(Integer.parseInt(Cx_Status_Admin.getText()));
            admin.getSalario().setMensalista(Double.parseDouble(Cx_Salario_Admin.getText()));
        
            admin = Banco.getBanco().cadAdmin(admin);
        
        
            if(admin != null){
                JOptionPane.showMessageDialog(
                    null,
                    "Collaborator registered with success!",
                    "Collaborator's register - Administrative",
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
            
            Cx_Id_Admin.setText("");
            Cx_Status_Admin.setText("");
            Cx_Salario_Admin.setText("");
            
            Cx_Id_Admin.requestFocus();
            Cx_Status_Admin.requestFocus();
            Cx_Salario_Admin.requestFocus(); 
        }
        
        catch(CaracterErrException cee) {
            JOptionPane.showMessageDialog(
                null,
                "What you typed must be between 6 and 50 characters long!",
                "ERROR",
                1
            );
            
            Cx_Nome_Admin.setText("");
            Cx_Setor_Admin.setText("");
            Cx_Funcao_Admin.setText("");
            Cx_Uni_Admin.setText("");
            Cx_Curso_Admin.setText("");
            
            Cx_Nome_Admin.requestFocus();
            Cx_Setor_Admin.requestFocus();
            Cx_Funcao_Admin.requestFocus();
            Cx_Uni_Admin.requestFocus();
            Cx_Curso_Admin.requestFocus();   
        }
        catch(StatusErrException see) {
            JOptionPane.showMessageDialog(
                null,
                "\nThe status must be: \n1 - Studying \n2 - Finished \n3 - Locked \n 4 - Gave up\n\nType just the number that represents each option.",
                "ERROR",
                1
            );
            
            Cx_Status_Admin.setText("");
            Cx_Status_Admin.requestFocus();
        }
        
        catch(SalErrException saee) {
            JOptionPane.showMessageDialog(
                null,
                "Monthly salary: minimum of 1302,00!",
                "ERROR",
                1
            );
            
            Cx_Salario_Admin.setText("");
            Cx_Salario_Admin.requestFocus();
        }
        
        catch(DataErrException dee) {
            JOptionPane.showMessageDialog(
                null,
                "The date must be in the format: dd/mm/yyyy. For example: 01/01/1900.",
                "ERROR",
                1
            );
            
            Cx_Admissao_Admin.setText("");
            Cx_Admissao_Admin.requestFocus();
        }
            
    }
    
    public void consAdmin(){
        admin = new Administrativo();
        admin.setId(Integer.parseInt(Cx_Id_Admin.getText()));
        
        admin = Banco.getBanco().consIdAdmin(admin);
        
        if(admin != null){
            Cx_Id_Admin.setText(Integer.toString(admin.getId()));
            Cx_Nome_Admin.setText(admin.getNome());
            Cx_Setor_Admin.setText(admin.getSetor());
            Cx_Funcao_Admin.setText(admin.getFuncao());
            Cx_Admissao_Admin.setText(admin.getAdmissao());
            Cx_Uni_Admin.setText(admin.getUniversidade());
            Cx_Curso_Admin.setText(admin.getCurso());
            Cx_Status_Admin.setText(Integer.toString(admin.getStatus()));
            Cx_Salario_Admin.setText(Double.toString(admin.getSalario().getMensalista()));

            JOptionPane.showMessageDialog(
                null,
                "Collaborator found!",
                "Consultation of Employees of the Administrative type",
                1
            ); 
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Collaborator NOT found!",
                "Consultation of Employees of the Administrative type",
                1
            ); 
        }
        
        limpeza();  
    }
    
    public void altAdmin(){
        admin = new Administrativo();
        admin.setId(Integer.parseInt(Cx_Id_Admin.getText()));
        
        admin = Banco.getBanco().altIdAdmin(admin);
        
        if(admin != null){
            Cx_Setor_Admin.setText(admin.getSetor());
            Cx_Funcao_Admin.setText(admin.getFuncao());
            Cx_Status_Admin.setText(Integer.toString(admin.getStatus()));
            Cx_Salario_Admin.setText(Double.toString(admin.getSalario().getMensalista()));
            
            JOptionPane.showMessageDialog(
                null,
                "Employee successfully changed!",
                "SUCCESS",
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
    
    public void excAdmin(){
        admin = new Administrativo();
        admin.setId(Integer.parseInt(Cx_Id_Admin.getText()));
        
        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Do you really want to delete the collaborator?",
            "Collaborator's delete",
            JOptionPane.YES_NO_OPTION
        );

        if(confirm == 0){
            admin = Banco.getBanco().delIdAdmin(admin);
            
            if(admin != null){
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
    private javax.swing.JLabel Admissao_Admin;
    private javax.swing.JButton CONSULTAR;
    private javax.swing.JLabel Curso_Admin;
    private javax.swing.JTextField Cx_Admissao_Admin;
    private javax.swing.JTextField Cx_Curso_Admin;
    private javax.swing.JTextField Cx_Funcao_Admin;
    private javax.swing.JTextField Cx_Id_Admin;
    private javax.swing.JTextField Cx_Nome_Admin;
    private javax.swing.JTextField Cx_Salario_Admin;
    private javax.swing.JTextField Cx_Setor_Admin;
    private javax.swing.JTextField Cx_Status_Admin;
    private javax.swing.JTextField Cx_Uni_Admin;
    private javax.swing.JButton EXCLUIR;
    private javax.swing.JLabel Funcao_Admin;
    private javax.swing.JButton INSERIR;
    private javax.swing.JLabel Id_Admin;
    private javax.swing.JLabel Nome_Admin;
    private javax.swing.JButton SAIR;
    private javax.swing.JLabel Salario_Admin;
    private javax.swing.JLabel Status_Admin;
    private javax.swing.JButton TOTAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
