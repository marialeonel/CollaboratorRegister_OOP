//Maria Fernanda Leonel Bertelli - RA:2503530
package com.mycompany.colaborador;

public class Administrativo extends Colaborador implements CalcINSS {

    private String universidade;
    private String curso;
    private int status;

    public Administrativo () {
        universidade = "";
        curso = "";
        status = 0;
    }

    //Polimorfismo por Sobrecarga
    public Administrativo (String universidade, String curso, int status) {
        this.universidade = universidade;
        this.curso = curso;
        this.status = status;
    }

    public String getUniversidade(){
        return universidade;
    }

    public String getCurso(){
        return curso;
    }

    public int getStatus() {
        return status;
    }

    public void setUniversidade(String universidade) throws CaracterErrException{
        if(universidade.length()>=6 && universidade.length() <=50){
            this.universidade = universidade;
        }
        else{
            throw new CaracterErrException();
        }
    }

    public void setCurso(String curso) throws CaracterErrException{
        if(curso.length()>= 6 && curso.length() <= 50){
            this.curso = curso;
        }
        else{
            throw new CaracterErrException();
        }
    }

    public void setStatus(int status) throws StatusErrException {
        if(status == 1 || status == 2 || status == 3 || status == 4) {
            this.status = status;  
        }
        else{
            throw new StatusErrException();
        }
    }

    public void calcularINSS() {

        double inss = 0;

        if(getSalario().getMensalista() <= 1302.00) {
            inss = 0.075 * 1302.00;

        } else {
            if(getSalario().getMensalista() > 1302.00 && getSalario().getMensalista() <= 2571.30) {
                inss = 0.09 * (getSalario().getMensalista() - 1302.00) + 97.65;

            } else {
                if (getSalario().getMensalista() > 2571.30 && getSalario().getMensalista() <= 3856.94) {
                    inss = 0.12 * (getSalario().getMensalista() - 2607.70) + 97.65 + 114.27;

                } else {
                    if (getSalario().getMensalista() > 3856.94 && getSalario().getMensalista() <= 7507.49) {
                        inss = 0.14 * (getSalario().getMensalista() - 3911.56) + 97.65 + 114.27 + 154.64; 

                    } else {
                        if (getSalario().getMensalista() > 7507.49) {
                            inss = 0.14 * (getSalario().getMensalista() - 3911.56) + 97.65 + 114.27 + 154.64;

                        }
                    }
                }
            }
        }
        System.out.print("\nDESCONTO DO INSS SOBRE O SALARIO: ");
        System.out.printf("R$ %.2f", inss);
    }
    
    //Polimorfismo por sobrescrita
    public void ExamePeriodico() {

        System.out.println("---EXAMES PERIODICOS ---");
        System.out.println("Colaborador do tipo ADMINISTRATIVO: \n1) Exame Clinico; \n2)Exame psicologico.");
    } 


}