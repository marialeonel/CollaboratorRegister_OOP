//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class Form_Prestador extends javax.swing.JFrame {

    public Form_Prestador() {
        initComponents();
    }
    
    private Prestador prest = new Prestador();
    private static Form_Prestador formPrest;

    public static Form_Prestador getForm_Prestador(){
        if (formPrest == null) {
            formPrest = new Form_Prestador();
        }
        return formPrest;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        Id_Prestador = new javax.swing.JLabel();
        Cx_Id_Prest = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cx_Nome_Prest = new javax.swing.JTextField();
        Cx_Setor_Prest = new javax.swing.JTextField();
        Cx_Funcao_Prest = new javax.swing.JTextField();
        Cx_Admissao_Prest = new javax.swing.JTextField();
        Cx_Demissao_Prest = new javax.swing.JTextField();
        Demissao_Prestador = new javax.swing.JLabel();
        Interesse_Prest = new javax.swing.JLabel();
        Cx_Interesse_Prest = new javax.swing.JTextField();
        INSERIR = new javax.swing.JButton();
        ALTERAR = new javax.swing.JButton();
        CONSULTAR = new javax.swing.JButton();
        EXCLUIR = new javax.swing.JButton();
        TOTAL_Prest = new javax.swing.JButton();
        SAIDA = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Salario_Prest = new javax.swing.JLabel();
        Cx_Salario_Prest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cx_Horas_Prest = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTree1);

        jMenuItem1.setText("jMenuItem1");

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

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro - Prestador");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("PROVIDER");

        Id_Prestador.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Id_Prestador.setText("ID:");

        Cx_Id_Prest.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("NAME:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("SECTOR:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("ADMISSION(dd/mm/aaaa):");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("FUNCTION:");

        Demissao_Prestador.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Demissao_Prestador.setText("DISMISSAL:");

        Interesse_Prest.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Interesse_Prest.setText("INTEREST:");

        INSERIR.setText("Insert");
        INSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERIRActionPerformed(evt);
            }
        });

        ALTERAR.setText("Alter");
        ALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERARActionPerformed(evt);
            }
        });

        CONSULTAR.setText("Consult");
        CONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTARActionPerformed(evt);
            }
        });

        EXCLUIR.setText("Delete");
        EXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIRActionPerformed(evt);
            }
        });

        TOTAL_Prest.setText("General Report");
        TOTAL_Prest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTAL_PrestActionPerformed(evt);
            }
        });

        SAIDA.setText("Exit");
        SAIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIDAActionPerformed(evt);
            }
        });

        Salario_Prest.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Salario_Prest.setText("SALARY (HOURLY RATE):");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("WEEKLY HOURS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Interesse_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Demissao_Prestador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cx_Admissao_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Demissao_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Interesse_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Salario_Prest)
                                    .addComponent(jLabel6))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cx_Salario_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Horas_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Id_Prestador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cx_Setor_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Funcao_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Nome_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cx_Id_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INSERIR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CONSULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TOTAL_Prest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EXCLUIR)
                            .addComponent(SAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_Prestador)
                    .addComponent(Cx_Id_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cx_Nome_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cx_Setor_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cx_Funcao_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cx_Admissao_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cx_Demissao_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Demissao_Prestador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Interesse_Prest)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cx_Interesse_Prest)
                        .addGap(1, 1, 1)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salario_Prest)
                    .addComponent(Cx_Salario_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cx_Horas_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EXCLUIR)
                    .addComponent(ALTERAR)
                    .addComponent(CONSULTAR)
                    .addComponent(INSERIR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TOTAL_Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TOTAL_PrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTAL_PrestActionPerformed
        Table_Prest.getTable_Prest().setVisible(true);
    }//GEN-LAST:event_TOTAL_PrestActionPerformed

    private void INSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERIRActionPerformed
        cadPrest();
    }//GEN-LAST:event_INSERIRActionPerformed

    private void CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTARActionPerformed
        consPrest();
    }//GEN-LAST:event_CONSULTARActionPerformed

    private void ALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERARActionPerformed
        altPrest();
    }//GEN-LAST:event_ALTERARActionPerformed

    private void EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIRActionPerformed
        excPrest();
    }//GEN-LAST:event_EXCLUIRActionPerformed

    private void SAIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIDAActionPerformed
        saida();
    }//GEN-LAST:event_SAIDAActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated
    public void limpeza(){
        Cx_Id_Prest.setText("");
        Cx_Nome_Prest.setText("");
        Cx_Setor_Prest.setText("");
        Cx_Funcao_Prest.setText("");
        Cx_Admissao_Prest.setText("");
        Cx_Demissao_Prest.setText("");
        Cx_Interesse_Prest.setText("");
        Cx_Salario_Prest.setText("");
        Cx_Horas_Prest.setText("");
        

        Cx_Id_Prest.requestFocus();
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
    
    public void cadPrest(){
        try {
            prest = new Prestador();
            prest.setId(Integer.parseInt(Cx_Id_Prest.getText()));
            prest.setNome(Cx_Nome_Prest.getText());
            prest.setSetor(Cx_Setor_Prest.getText());
            prest.setFuncao(Cx_Funcao_Prest.getText());
            prest.setAdmissao(Cx_Admissao_Prest.getText());
            prest.setDemissao(Cx_Demissao_Prest.getText());
            prest.setInteresse(Cx_Interesse_Prest.getText());
            prest.getSalario().setHorista(Double.parseDouble(Cx_Salario_Prest.getText()));
            prest.getSalario().setHoras(Double.parseDouble(Cx_Horas_Prest.getText()));
        
            prest = Banco.getBanco().cadPrest(prest);
        
        
            if(prest != null){
                JOptionPane.showMessageDialog(
                    null,
                    "Collaborator registered with success!",
                    "Collaborator's register - Provider",
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
            
            Cx_Id_Prest.setText("");
            Cx_Salario_Prest.setText("");
            Cx_Horas_Prest.setText("");
            Cx_Id_Prest.requestFocus();
            Cx_Salario_Prest.requestFocus(); 
            Cx_Horas_Prest.requestFocus(); 
        }
        
        catch(CaracterErrException cee) {
            JOptionPane.showMessageDialog(
                null,
                "What you typed must be between 6 and 50 characters long!",
                "ERROR",
                1
            );
            
            Cx_Nome_Prest.setText("");
            Cx_Setor_Prest.setText("");
            Cx_Funcao_Prest.setText("");
            
            
            Cx_Nome_Prest.requestFocus();
            Cx_Setor_Prest.requestFocus();
            Cx_Funcao_Prest.requestFocus();  
        }
        
        catch(SalErrException saee) {
            JOptionPane.showMessageDialog(
                null,
                "Hourly-wage earners: minimum of 8,17 the hour and maximum of 9,97.",
                "ERROR",
                1
            );
            
            Cx_Salario_Prest.setText("");
            Cx_Salario_Prest.requestFocus();
        }
        
        catch(DataErrException dee) {
            JOptionPane.showMessageDialog(
                null,
                "The date must be in the format: dd/mm/yyyy. For example: 01/01/1900.",
                "ERROR",
                1
            );
            
            Cx_Admissao_Prest.setText("");
            Cx_Demissao_Prest.setText("");
            Cx_Admissao_Prest.requestFocus();
            Cx_Demissao_Prest.requestFocus();
        }
        
        catch(DicotomicaErrException dee) {
            JOptionPane.showMessageDialog(
                null,
                "\nIf 'YES' = type 'Y' \nIf 'NO' = type 'N'",
                "ERROR",
                1
            );
            
            Cx_Interesse_Prest.setText("");
            Cx_Interesse_Prest.requestFocus();
        }
        
        catch(HorasErrException hee) {
            JOptionPane.showMessageDialog(
                null,
                "\nHours worked must be: \nMINIMUM: 30 weekly hours; \nMAXIMUM: 56 weekly hours.",
                "ERROR",
                1
            );
            
            Cx_Horas_Prest.setText("");
            Cx_Horas_Prest.requestFocus();
        }
        
    }
    
    public void consPrest(){
        prest = new Prestador();
        prest.setId(Integer.parseInt(Cx_Id_Prest.getText()));
        
        prest = Banco.getBanco().consIdPrest(prest);
        
        if(prest != null){
            Cx_Id_Prest.setText(Integer.toString(prest.getId()));
            Cx_Nome_Prest.setText(prest.getNome());
            Cx_Setor_Prest.setText(prest.getSetor());
            Cx_Funcao_Prest.setText(prest.getFuncao());
            Cx_Admissao_Prest.setText(prest.getAdmissao());
            Cx_Demissao_Prest.setText(prest.getDemissao());
            Cx_Interesse_Prest.setText(prest.getInteresse());
            Cx_Salario_Prest.setText(Double.toString(prest.getSalario().getHorista()));
            Cx_Horas_Prest.setText(Double.toString(prest.getSalario().getHoras()));


            JOptionPane.showMessageDialog(
                null,
                "Collaborator found!",
                "Consultation of Employees of the Provider type",
                1
            ); 
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Collaborator NOT found!",
                "Consultation of Employees of the Provider type",
                1
            ); 
        }
        
        limpeza();  
    }
    
    public void altPrest(){
        prest = new Prestador();
        prest.setId(Integer.parseInt(Cx_Id_Prest.getText()));
        
        prest = Banco.getBanco().altIdPrest(prest);
        
        if(prest != null){
            Cx_Demissao_Prest.setText(prest.getDemissao());
            
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
    
    public void excPrest() {
        prest = new Prestador();
        prest.setId(Integer.parseInt(Cx_Id_Prest.getText()));
        
        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Do you really want to delete the collaborator?",
            "Collaborator's delete",
            JOptionPane.YES_NO_OPTION
        );

        if(confirm == 0){
            prest = Banco.getBanco().delIdPrest(prest);
            
            if(prest != null){
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
    private javax.swing.JTextField Cx_Admissao_Prest;
    private javax.swing.JTextField Cx_Demissao_Prest;
    private javax.swing.JTextField Cx_Funcao_Prest;
    private javax.swing.JTextField Cx_Horas_Prest;
    private javax.swing.JTextField Cx_Id_Prest;
    private javax.swing.JTextField Cx_Interesse_Prest;
    private javax.swing.JTextField Cx_Nome_Prest;
    private javax.swing.JTextField Cx_Salario_Prest;
    private javax.swing.JTextField Cx_Setor_Prest;
    private javax.swing.JLabel Demissao_Prestador;
    private javax.swing.JButton EXCLUIR;
    private javax.swing.JButton INSERIR;
    private javax.swing.JLabel Id_Prestador;
    private javax.swing.JLabel Interesse_Prest;
    private javax.swing.JButton SAIDA;
    private javax.swing.JLabel Salario_Prest;
    private javax.swing.JButton TOTAL_Prest;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
