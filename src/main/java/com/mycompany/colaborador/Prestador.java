//Maria Fernanda Leonel Bertelli - RA: 2503530
package com.mycompany.colaborador;

public class Prestador extends Colaborador implements CalcINSS {

    private String demissao; 
    private String interesse;

    public Prestador() {
        demissao = "";
        interesse = "";
    }

    //Polimorfismo por Sobrecarga
    public Prestador(String demissao, String interesse) {
        this.demissao = demissao;
        this.interesse = interesse;
    }

    public String getDemissao() {
        return demissao;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setDemissao(String demissao) throws DataErrException {
		if (demissao.length() == 10) {
			this.demissao = demissao;
		}
		else {
			throw new DataErrException();
		}
    }

    public void setInteresse(String interesse) throws DicotomicaErrException {
        if (interesse.equals("Y")) {
            this.interesse = interesse; 
        }

        else if (interesse.equals("N")) {
            this.interesse = interesse;
        }
        
        else {
            throw new DicotomicaErrException();
        }
    }

    public void calcularINSS() {
        double salario_horista = 0;
        double inss = 0;

        salario_horista = getSalario().getHorista() * getSalario().getHoras();

        if(salario_horista <= 1302.00) {
            inss = 0.075 * 1302.00;

        } else {
            if(salario_horista > 1302.00 && salario_horista <= 2571.30) {
                inss = 0.09 * (salario_horista - 1302.00) + 97.65;

            } else {
                if (salario_horista > 2571.30 && salario_horista <= 3856.94) {
                    inss = 0.12 * (salario_horista - 2607.70) + 97.65 + 114.27;

                } else {
                    if (salario_horista > 3856.94 && salario_horista <= 7507.49) {
                        inss = 0.14 * (salario_horista - 3911.56) + 97.65 + 114.27 + 154.64; 

                    } else {
                        if (salario_horista > 7507.49) {
                            inss = 0.14 * (salario_horista - 3911.56) + 97.65 + 114.27 + 154.64;

                        }
                    }
                }
            }
        }
        System.out.print("\nDESCONTO DO INSS SOBRE O SALARIO: ");
        System.out.printf("R$ %.2f", inss);
    }

    //Polimorfismo por Sobrescrição
    public void ExamePeriodico() {

        System.out.println("\n---EXAME PERIODICO---");
        System.out.println("Colaborador do tipo PRESTADOR nao realiza exame periodico, pois nao completou 1 ano de servico.");
    }

}