//Maria Fernanda Leonel Bertelli - RA:2503530
package com.mycompany.colaborador;

public abstract class Colaborador {

        private int id;
	private String nome;
	private String setor;
	private String admissao;
	private String funcao;

	public Colaborador() {
                id = 0;
		nome = "";
		setor = "";
		admissao = "";
		funcao = "";
	}

	//Polimorfismo por sobrecarga
	public Colaborador(int id, String nome, String setor, String admissao, String funcao) {
                this.id = id;
		this.nome = nome;
		this.setor = setor;
		this.admissao = admissao;
		this.funcao = funcao;
	}
//____________________________________________________
	Salario salario = new Salario();

	public Salario getSalario(){
		return salario;
	}

	public void setSalario(Salario salario){
		
		this.salario = salario;
	}
//________________________________________________________
        public int getId() {
            return id;
        }

	public String getNome(){
		return nome;
	}

	public String getSetor(){
		return setor;
	}

	public String getAdmissao(){
		return admissao;
	}

	public String getFuncao() {
		return funcao;
	}
        
        public void setId(int id){
            this.id = id;
        }

	public void setNome(String nome) throws CaracterErrException {
		if(nome.length()>=6 && nome.length() <=50){
			this.nome = nome;
		}
		else{
			throw new CaracterErrException();
		}
	}

	public void setSetor(String setor) throws CaracterErrException{
		if(setor.length()>=6 && setor.length() <=50){
			this.setor = setor;
		}
		else{
			throw new CaracterErrException();
		}
	}

	public void setAdmissao(String admissao) throws DataErrException {
		if (admissao.length() == 10) {
			this.admissao = admissao;
		}
		else {
			throw new DataErrException();
		}
	}

	public void setFuncao(String funcao) throws CaracterErrException {
		if(funcao.length()>=6 && funcao.length() <=50){
			this.funcao = funcao;
		}
		else{
			throw new CaracterErrException();
		}
	}

	public abstract void ExamePeriodico();

}