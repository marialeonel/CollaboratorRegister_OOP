//Maria Fernanda Leonel Bertelli - RA:2503530
package com.mycompany.colaborador;

public class Salario{ 

	private double mensalista; 
	private double horista;
    private double horas;

	public Salario(){
		mensalista = 0;
		horista = 0;
        horas = 0;
	}

    //Polimorfismo por Sobrecarga
	public Salario(double mensalista, double horista, double horas) {
            this.mensalista = mensalista;
            this.horista = horista;
            this.horas = horas;
	}

	public double getMensalista(){
		return mensalista;
	}

	public double getHorista(){
		return horista;
	}

    public double getHoras(){
		return horas;
	}

	public void setMensalista(double mensalista) throws SalErrException{
        if (mensalista >= 1302.00) {
            this.mensalista = mensalista;
        }
        else {
            throw new SalErrException();
        }
        
	}

	public void setHorista(double horista)  throws SalErrException{
        if(horista >= 8.17 && horista <= 9.97) {
            this.horista = horista;
        }
        else {
            throw new SalErrException();
        }
	}

    public void setHoras(double horas) throws HorasErrException{
        if (horas >= 30 && horas <= 56) {
            this.horas = horas;
        }
        else {
            throw new HorasErrException();
        }
    } 
    
}

