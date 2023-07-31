// Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Banco{
    
    static Administrativo admin = new Administrativo();
    static List <Administrativo> BDAdmin; 
    
    static Executor exec = new Executor();
    static List <Executor> BDExec;
    
    static Prestador prest = new Prestador();
    static List <Prestador> BDPrest;
    
    private static Banco bancoUnico;
    
    private Banco(){
        BDAdmin = new ArrayList<Administrativo>();
        BDExec = new ArrayList<Executor>();   
        BDPrest = new ArrayList<Prestador>();
    }
    
    public static Banco getBanco(){
        if(bancoUnico == null){
            bancoUnico = new Banco();
        }
        return bancoUnico;
    }
    
    public List<Administrativo> getBdAdmin(){
        return BDAdmin;
    }
    
    public List<Executor> getBdExecutor(){
        return BDExec;
    }
    
    public List<Prestador> getBdPrestador(){
        return BDPrest;
    }

//------------------------------------------------------------------------------
   public static Administrativo cadAdmin(Administrativo admin){
        if(consIdAdmin(admin)== null){
            BDAdmin.add(admin);
            return admin;
        }
        
        return null;
    } 
   
   public static Executor cadExec(Executor exec){
        if(consIdExec(exec)== null){
            BDExec.add(exec);
            return exec;
        }
        
        return null;
    }
   
   public static Prestador cadPrest(Prestador prest){
        if(consIdPrest(prest)== null){
            BDPrest.add(prest);
            return prest;
        }
        
        return null;
    }

    public static Administrativo consIdAdmin(Administrativo admin){
        for(int i = 0; i < BDAdmin.size(); i++){
            if(admin.getId() == BDAdmin.get(i).getId()){
                return BDAdmin.get(i);
            }
        }
	return null;
    }
    
    public static Executor consIdExec(Executor exec){
        for(int i = 0; i < BDExec.size(); i++){
            if(exec.getId() == BDExec.get(i).getId()){
                return BDExec.get(i);
            }
        }
	return null;
    }
    
    public static Prestador consIdPrest(Prestador prest){
        for(int i = 0; i < BDPrest.size(); i++){
            if(prest.getId() == BDPrest.get(i).getId()){
                return BDPrest.get(i);
            }
        }
	return null;
    }

    
    public static Administrativo altIdAdmin(Administrativo admin){
        for(int i = 0; i < BDAdmin.size(); i++){
            if(admin.getId()== BDAdmin.get(i).getId()){
                admin = BDAdmin.get(i);
                
                String novo_setor = JOptionPane.showInputDialog(
                null,
                "SECTOR ",
                "UPDATE",
                1 //ICONE
            );
                try {
                    BDAdmin.get(i).setSetor(novo_setor);
                }
                
                catch(CaracterErrException cee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "What you typed must be between 6 and 50 characters long!",
                        "ERROR",
                        1
                    );
                    
                    admin = cee.corrCaracterSetor(admin);
                }
                
                String nova_funcao = JOptionPane.showInputDialog(
                null,
                "FUNCTION: ",
                "UPDATE",
                1 //ICONE
                );
                
                try {
                    BDAdmin.get(i).setFuncao(nova_funcao);
                }
                
                catch(CaracterErrException cee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "What you typed must be between 6 and 50 characters long!",
                        "ERROR",
                        1
                    );
                    admin = cee.corrCaracterFuncao(admin);
                    
                }
                
                String novo_status = JOptionPane.showInputDialog(
                null,
                "STATUS: ",
                "UPDATE",
                1 //ICONE
                );
                
                try {
                    BDAdmin.get(i).setStatus(Integer.parseInt(novo_status));
                }
                
                catch(StatusErrException see) {
                    JOptionPane.showMessageDialog(
                        null,
                        "\nThe status must be: \n1 - Studying \n2 - Finished \n3 - Locked \n 4 - Gave up\n\nType just the number that represents each option.",
                        "ERROR",
                        1
                    );
                    admin = see.corrStatus(admin);
                }
                
                catch(NumberFormatException nee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "What you typed must be a number!",
                        "ERROR",
                        1
                    );
                }
                
                String novo_salario = JOptionPane.showInputDialog(
                null,
                "SALARY: ",
                "UPDATE",
                1 //ICONE
                );
                
                try {
                    BDAdmin.get(i).getSalario().setMensalista(Double.parseDouble(novo_salario));
                }
                
                catch(SalErrException saee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "\nMonthly salary: minimum of 1302,00!",
                        "ERROR",
                        1
                    );
                    
                    admin = saee.corrSalario(admin);
                }
                
                catch(NumberFormatException nee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "What you typed must be a number!",
                        "ERROR",
                        1
                    );
                }
                
                return BDAdmin.get(i);
            }    
        }
        return null;
    } 
    
    public static Executor altIdExec(Executor exec){
        for(int i = 0; i < BDExec.size(); i++){
            if(exec.getId()== BDExec.get(i).getId()){
                exec = BDExec.get(i);
                String novo_setor = JOptionPane.showInputDialog(
                null,
                "SECTOR: ",
                "UPDATE",
                1 //ICONE

            );
               
                try {
                    BDExec.get(i).setSetor(novo_setor);
                }
                catch(CaracterErrException cee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "What you typed must be between 6 and 50 characters long!",
                        "ERROR",
                        1
                    );
                    
                    exec = cee.corrCaracterSetor(exec);
                }
                
                String nova_funcao = JOptionPane.showInputDialog(
                null,
                "FUNCTION: ",
                "UPDATE",
                1 //ICONE

            );
               
                try {
                    BDExec.get(i).setFuncao(nova_funcao);
                }
                catch(CaracterErrException cee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "What you typed must be between 6 and 50 characters long!",
                        "ERROR",
                        1
                    );
                    exec = cee.corrCaracterFuncao(exec);
                }
                
                String nova_epi = JOptionPane.showInputDialog(
                null,
                "CORRECT USE OF PPE: ",
                "UPDATE",
                1 //ICONE

            );
               
                try {
                    BDExec.get(i).setEpi(nova_epi);
                }
                catch(DicotomicaErrException dee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "\nIf 'YES' = type 'Y' \nIf 'NO' = type 'N'",
                        "ERROR",
                        1
                    );
                    exec = dee.corrDicotomia(exec);
                }
                
                String novo_salario = JOptionPane.showInputDialog(
                null,
                "SALARY: ",
                "UPDATE",
                1 //ICONE
                );
                
                try {
                    BDExec.get(i).getSalario().setMensalista(Double.parseDouble(novo_salario));
                }
                
                catch(SalErrException see) {
                    JOptionPane.showMessageDialog(
                        null,
                        "\nMonthly salary: minimum of 1302,00!",
                        "ERROR",
                        1
                    );
                    exec = see.corrSalario(exec);
                }
                
                catch(NumberFormatException nee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "What you typed must be a number!!",
                        "ERROR",
                        1
                    );
                }
                
                return BDExec.get(i);
            }
            
        }
        return null;
    } 
    
    public static Prestador altIdPrest(Prestador prest){
        for(int i = 0; i < BDPrest.size(); i++){
            if(prest.getId()== BDPrest.get(i).getId()){
                prest= BDPrest.get(i);
                
                String nova_demissao = JOptionPane.showInputDialog(
                null,
                "NEW DISMISSAL DATE: ",
                "UPDATE",
                1 //ICONE
                        
            ); 
                try {
                    BDPrest.get(i).setDemissao(nova_demissao);
                }
                
                catch(DataErrException daee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "\nThe date must be in the format: dd/mm/yyyy. For example: 01/01/1900.",
                        "ERROR",
                        1
                    );
                    prest = daee.corrData(prest);
                }
                
                String novo_interesse = JOptionPane.showInputDialog(
                null,
                "INTEREST: ",
                "UPDATE",
                1 //ICONE
                        
            );
                try{
                    BDPrest.get(i).setInteresse(novo_interesse);
                }
     
                catch(DicotomicaErrException dee) {
                    JOptionPane.showMessageDialog(
                        null,
                        "\nIf 'YES' = type 'Y' \nIf 'NO' = type 'N'",
                        "ERROR",
                        1
                    );
                    prest = dee.corrDicotomia(prest);
                }
                
                return BDPrest.get(i);
            }            
        }
        return null;
    } 

    public static Administrativo delIdAdmin(Administrativo admin){
        for(int i = 0; i < BDAdmin.size(); i++){
            if(admin.getId() == BDAdmin.get(i).getId()){
                BDAdmin.remove(BDAdmin.get(i));
                return null;
            }
        }
	return admin;	
    }
    
    public static Executor delIdExec(Executor exec){
        for(int i = 0; i < BDExec.size(); i++){
            if(exec.getId() == BDExec.get(i).getId()){
                BDExec.remove(BDExec.get(i));
                return null;
            }
        }
	return exec;	
    }
    
    public static Prestador delIdPrest(Prestador prest){
        for(int i = 0; i < BDPrest.size(); i++){
            if(prest.getId() == BDPrest.get(i).getId()){
                BDPrest.remove(BDPrest.get(i));
                return null;
            }
        }
	return prest;	
    }

	
}
