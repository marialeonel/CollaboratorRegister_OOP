//Maria Fernanda Leonel Bertelli - RA:2503530
package com.mycompany.colaborador;

import javax.swing.JOptionPane;

public class Executor extends Colaborador implements CalcINSS {

    private int carga;
    private String epi; 

    public Executor() {
        carga = 0;
        epi = "";
    }

    //Polimorfismo por Sobrecarga
    public Executor(int carga, String epi) {
        this.carga = carga;
        this.epi = epi;
    }

    public int getCarga(){
        return carga;
    }

    public void setCarga(int carga) throws CargaErrException {
        if (carga >= 1 && carga <= 60) {
            this.carga = carga;
        }
        else {
            throw new CargaErrException();
        }
    }

    public String getEpi() {
        return epi;
    }

    public void setEpi(String epi) throws DicotomicaErrException{
        if(epi.equals("y")) {
            this.epi = epi; 
        }

        else if (epi.equals("N")) {
            this.epi = epi; 
        }

        else {
            throw new DicotomicaErrException();
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
    
    //Polimorfismo por sobrescrição 
    public void ExamePeriodico() {
      //  Leitura ler = new Leitura();
        boolean yes = true;

        while(yes) {
            System.out.println("---EXAME PERIODICO---");
            System.out.println("\n\nCondicoes de trabalho:");
            System.out.println("\n1) ALTURA (NR-35);  ");
            System.out.println("\n2) PRESSAO SONORA ELEVADA (NR-15);  ");
            System.out.println("\n3) ELETRICIDADE(NR-10);  ");
            System.out.println("\n4) TRANSPORTE E MOVIMENTACAO DE CARGAS(NR-11);  ");

            int choice = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Escolha uma opcao: ",
                "Exame Periódico",
                1
            ));

            switch(choice) { 
                case 1:
                    System.out.println("\n\nRealizacao de exames complementares: \n- Acuidade visual; \n- Hemograma; \n- Glicemia de Jejum, \n- Eletrocardiograma, \n- Eletro encefalograma.");
                    System.exit(0);
                    break;

                case 2: 
                    System.out.println("\n\nRealizacao de exames complementares: \n- Audiometria.");
                    System.exit(0);
                    break;

                case 3: 
                    System.out.println("\n\nRealizacao de exames complementares: \n- Acuidade visual; \n- Teste de discriminação de cores; \n- Eletrocardiograma; \n- Eletro encefalograma.");
                    System.exit(0);
                    break;

                case 4: 
                    System.out.println("\n\nRealizacao de exames complementares: \n- Dinanometria; \n- Raio X da coluna lombar.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}