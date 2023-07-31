//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class CaracterErrException extends Exception{

    public void impMsgCaracterErr(){
        JOptionPane.showMessageDialog(
            null,
            "What you typed must be between 6 and 50 characters long!",
            "ERROR",
            1
        );		
    }

    public Administrativo corrCaracterNome (Administrativo a){

        try{
            a.setNome(JOptionPane.showInputDialog(
                null,
                "New name: ",
                "UPDATE",
                1
            ));
        }

        catch(CaracterErrException cee){
            impMsgCaracterErr();
            a = cee.corrCaracterNome(a);
        }

        return a;
    }

    public Administrativo corrCaracterSetor (Administrativo a){
            try {
                a.setSetor(JOptionPane.showInputDialog(
                    null,
                    "New sector: ",
                    "UPDATE",
                    1
                ));
            }
            catch (CaracterErrException cee) {
                impMsgCaracterErr();
                a = cee.corrCaracterSetor(a);
            }

            return a;

    }

    public Administrativo corrCaracterFuncao (Administrativo a){
            try {
                a.setFuncao(JOptionPane.showInputDialog(
                    null,
                    "New function: ",
                    "UPDATE",
                    1
                ));
            }
            catch (CaracterErrException cee) {
                    impMsgCaracterErr();
                    a = cee.corrCaracterFuncao(a);
            }

            return a;
    }

    public Administrativo corrCaracterUni (Administrativo a){
        try {
            a.setUniversidade(JOptionPane.showInputDialog(
                null,
                "New University: ",
                "UPDATE",
                1
            ));
        }
        catch (CaracterErrException cee) {
            impMsgCaracterErr();
            a = cee.corrCaracterUni(a);
        }

        return a;
    }

    public Administrativo corrCaracterCurso (Administrativo a){
        try {
            a.setCurso(JOptionPane.showInputDialog(
                null,
                "New University: ",
                "UPDATE",
                1
            ));
        }
        catch (CaracterErrException cee) {
            impMsgCaracterErr();
            a = cee.corrCaracterCurso(a);
        }

        return a;
    }

    public Executor corrCaracterNome (Executor b){

        try{
                b.setNome(JOptionPane.showInputDialog(
                null,
                "New name: ",
                "UPDATE",
                1
            ));
        }

        catch(CaracterErrException cee){
            impMsgCaracterErr();
            b = cee.corrCaracterNome(b);
        }

        return b;
    }

    public Executor corrCaracterFuncao (Executor b){

        try{
            b.setFuncao(JOptionPane.showInputDialog(
                null,
                "New function: ",
                "UPDATE",
                1
            ));
        }

        catch(CaracterErrException cee){
            impMsgCaracterErr();
            b = cee.corrCaracterFuncao(b);
        }

        return b;
    }

    public Executor corrCaracterSetor (Executor b){

        try{
            b.setSetor(JOptionPane.showInputDialog(
                null,
                "New sector: ",
                "UPDATE",
                1
            ));
        }

        catch(CaracterErrException cee){
            impMsgCaracterErr();
            b = cee.corrCaracterSetor(b);
        }

        return b;
    }

public Prestador corrCaracterNome (Prestador c){

        try{
            c.setNome(JOptionPane.showInputDialog(
                null,
                "New name: ",
                "UPDATE",
                1
            ));
        }

        catch(CaracterErrException cee){
            impMsgCaracterErr();
            c = cee.corrCaracterNome(c);
        }
        return c;
    }

    public Prestador corrCaracterSetor (Prestador c){

        try {
            c.setSetor(JOptionPane.showInputDialog(
                null,
                "New sector: ",
                "UPDATE",
                1
            ));
        }

        catch(CaracterErrException cee){
            impMsgCaracterErr();
            c = cee.corrCaracterSetor(c);
        }

        return c;
    }

    public Prestador corrCaracterFuncao (Prestador c){
        try {
            c.setFuncao(JOptionPane.showInputDialog(
                null,
                "New function: ",
                "UPDATE",
                1
            ));
        }

        catch(CaracterErrException cee){
            impMsgCaracterErr();
            c = cee.corrCaracterFuncao(c);
        }

        return c;
    }

}