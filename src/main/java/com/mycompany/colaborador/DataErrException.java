//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class DataErrException extends Exception {

    public void impMsgDataErr(){
        JOptionPane.showMessageDialog(
            null,
            "The date must be in the format: dd/mm/yyyy. For example: 01/01/1900.",
            "ERROR",
            1
        );
    }

    public Administrativo corrData (Administrativo a){

        try{
            a.setAdmissao(JOptionPane.showInputDialog(
                null,
                "New date (dd/mm/yyyy): ",
                "UPDATE",
                1
            ));
        }

        catch(DataErrException daee){
            impMsgDataErr();
            a = corrData(a);
        }

        return a;
    }

    public Executor corrData (Executor b){

        try{
        b.setAdmissao(JOptionPane.showInputDialog(
                null,
                "New date (dd/mm/yyyy): ",
                "UPDATE",
                1
            ));
        }

        catch(DataErrException daee){
            impMsgDataErr();
            b = corrData(b);
        }

        return b;
    }

    public Prestador corrData (Prestador c){

        try{
            c.setDemissao(JOptionPane.showInputDialog(
                null,
                "New date (dd/mm/yyyy): ",
                "UPDATE",
                1
            ));
        }

        catch(DataErrException daee){
            impMsgDataErr();
            c = corrData(c);
        }

        return c;
    }


}