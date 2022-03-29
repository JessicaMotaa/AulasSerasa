package fgabank;

public class TestaBanco {

	public static void main(String[] args) {
		
		/*Pessoa pessoaNumero1 = new Pessoa(); //Instância/cópia
		pessoaNumero1.nome= "Jose das Couves";
		pessoaNumero1.profissao= "Agricultor";
		pessoaNumero1.cpf="643.829.641-48";
		
		System.out.println("Nome: "+pessoaNumero1.nome);
		System.out.println("Profissão: "+pessoaNumero1.profissao);
		System.out.println("CPF: "+ pessoaNumero1.cpf);
		
		Pessoa pessoaNova = new Pessoa();
		pessoaNova.setNome("Jose da Couves");
		System.out.println(pessoaNova.getNome());
		Pessoa pessoaNumero2 = pessoaNumero1;
//		
		pessoaNumero2.nome = "João dos Tomates";
//		System.out.println("=================");
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Nome: " + pessoaNumero2.nome);
		
		Pessoa pessoaNova = new Pessoa(); //instanciar a classe Pessoa
		pessoaNova.setNome("Jose das Couves");
		System.out.println("Nome: " + pessoaNova.getNome());
		System.out.println("===============================");
		
		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "259.800.966-55", "123.456-78");
		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
		System.out.println("RG: " + pessoaComConstrutor1.getRg());
	}
}*/
		Conta conta1=new Conta();
		conta1.setAgencia(1234);
		conta1.setAgencia(7889);
		//conta1.setSaldo(1000000.50); -> Não se deve operar diretamente essa informação. Ela apenas pode ser exibida.
		conta1.setTitular("Jéssica");
		
		conta1.depositar(100.0);
				
		System.out.println("Agencia: "+ conta1.getAgencia());
		System.out.println("Conta: "+ conta1.getNumeroConta());
		System.out.println("Titular: "+ conta1.getTitular());
		System.out.printf("Saldo atual: %.2f\n",conta1.getSaldo());
			
		conta1.sacar(20.0);
		System.out.printf("Saldo atual: %.2f\n",conta1.getSaldo());
		
		
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Verifique valor do saque");
		}
		
		System.out.printf("Saldo atual: R$ %.2f\n", conta1.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		
		conta1.tranferir(10, conta2);
		
		System.out.printf("Saldo atual Jéssica: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo atual coleguinha: R$ %.2f\n", conta2.getSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
