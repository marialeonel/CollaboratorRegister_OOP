//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class CargaErrException extends Exception {
	

    public void impMsgCargaErr(){

        JOptionPane.showMessageDialog(
            null,
            "\nMinimum load: 1 kg \nMaximum load: 60 kg",
            "ERROR",
            1
        );
    }

    public Executor corrCarga (Executor b) {

        try{
            b.setCarga(Integer.parseInt(
            JOptionPane.showInputDialog(
                null,
                "New load: ",
                "ERROR",
                1
            )));
        }

        catch(CargaErrException caee){
            impMsgCargaErr();
            b = caee.corrCarga(b);
        }
        return b;
    }


}