package fgabank;

import java.time.LocalDate;

public abstract class Funcionario {

		private final double INDICE = 0.05; //Final = Constante
		private String nome;
		private String cpf; 
		private String ctps;
		private LocalDate dataDeAdmissao;
		private Double salario; 

		public Funcionario() {
			
		}

		
		public Funcionario(String nome, String cpf, String ctps, LocalDate dataDeAdmissao, Double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataDeAdmissao = dataDeAdmissao;
		this.salario = salario;
		}

		/**
		 * Calculo de bonus para todos os funcionarios
		 * @version 1.0
		 * @since 01/04/2022
		 * @author Jéssica
		 * @return
		 */
		
		public double getBonus() {
			return this.salario*INDICE;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getCtps() {
			return ctps;
		}

		public void setCtps(String ctps) {
			this.ctps = ctps;
		}

		public LocalDate getdataDeAdmissao() {
			return dataDeAdmissao;
		}

		public void setDataAdmissao(LocalDate dataDeAdmissao) {
			this.dataDeAdmissao = dataDeAdmissao;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalario(Double salario) {
			this.salario = salario;
		}
				

		@Override
		public String toString() {
			return "Nome: "+getNome()+"\nCTPS: "+getCtps()+"\n Data Admissão: "+getdataDeAdmissao()+"\n Salário: "+getSalario();
}
}