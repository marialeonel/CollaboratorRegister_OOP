//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;
import javax.swing.JOptionPane;

public class HorasErrException extends Exception {

    public void impMsgHorasErr(){
        JOptionPane.showMessageDialog(
            null,
            "\nHours worked must be: \nMINIMUM: 30 weekly hours; \nMAXIMUM: 56 weekly hours.",
            "ERROR",
            1
        );

    }

    public Prestador corrHoras (Prestador c) {

            try{
                c.getSalario().setHoras(Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Weekly hours worked: ",
                    "UPDATE",
                    1
                )));
            }

            catch(HorasErrException hee){
                impMsgHorasErr();
                c = hee.corrHoras(c);
            }

            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                    null,
                    "\nThe hour must be a number.",
                    "ERROR",
                    1
                );
            }

            return c;
    }


}