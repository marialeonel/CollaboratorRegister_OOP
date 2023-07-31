//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class SalErrException extends Exception{

	public void impMsgSalErr(){
            JOptionPane.showMessageDialog(
                null,
                "\nMonthly salary: minimum of 1302,00!\nHourly-wage earners: minimum of 8,17 the hour and maximum of 9,97.",
                "ERROR",
                1
            );
	}

	public Administrativo corrSalario (Administrativo a) {
		try{
                    a.getSalario().setMensalista(Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "New salary: ",
                        "ERROR",
                        1
                    )));
		}

		catch(SalErrException saee){
			impMsgSalErr();
			a = saee.corrSalario(a);
		}

		catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(
                        null,
                        "\nThe salary must be a number.",
                        "ERROR",
                        1
                    );
		}

		return a;
	}

	public Executor corrSalario (Executor b) {

            try{
                b.getSalario().setMensalista(Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "New salary: ",
                    "ERROR",
                    1
                )));
            }

            catch(SalErrException saee){
                impMsgSalErr();
                b = saee.corrSalario(b);
            }

            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                    null,
                    "\nThe salary must be a number.",
                    "ERROR",
                    1
                );
            }

            return b;
	}

	public Prestador corrSalario (Prestador c) {

            try{
                c.getSalario().setHorista(Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "New salary: ",
                    "ERROR",
                    1
                )));
            }

            catch(SalErrException saee){
                impMsgSalErr();
                c = saee.corrSalario(c);
            }

            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                    null,
                    "\nThe salary must be a number.",
                    "ERROR",
                    1
                );
            }

            return c;
	}

	
	
}
	

 