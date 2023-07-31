//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;
import javax.swing.JOptionPane;

public class StatusErrException extends Exception{

    public void impMsgStatusErr(){
        	
        JOptionPane.showMessageDialog(
            null,
            "\nThe status must be: \n1 - Studying \n2 - Finished \n3 - Locked \n 4 - Gave up\n\nType just the number that represents each option.",
            "ERROR",
            1
        );
    }
    
    public Administrativo corrStatus (Administrativo a) {
        try{
            a.setStatus(Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "New status: ",
                "UPDATE",
                1
            )));
        }

        catch(StatusErrException see){
            impMsgStatusErr();
            a = see.corrStatus(a);
        }
        return a;
    }

} 