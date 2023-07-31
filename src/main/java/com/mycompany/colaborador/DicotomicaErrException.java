//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class DicotomicaErrException extends Exception {

	public void impMsgDicotomicaErr(){	
                JOptionPane.showMessageDialog(
                null,
                "\nIf 'YES' = type 'Y' \nIf 'NO' = type 'N'",
                "ERROR",
                1
            );
	}

    public Executor corrDicotomia (Executor b) {

		try{
                    b.setEpi(JOptionPane.showInputDialog(
                        null,
                        "Usually use IPE (Individual Protection Equipment) correctly? ",
                        "UPDATE",
                        1
                    ));
		}

		catch(DicotomicaErrException dee){
			impMsgDicotomicaErr();
			b = dee.corrDicotomia(b);
		}

		return b;
	}

	public Prestador corrDicotomia (Prestador c) {

		try{
                    c.setInteresse(JOptionPane.showInputDialog(
                        null,
                        "Interest: ",
                        "UPDATE",
                        1
                    ));
		}

		catch(DicotomicaErrException dee){
			impMsgDicotomicaErr();
			c = dee.corrDicotomia(c);
		}


		return c;
	}





}