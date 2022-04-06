package fgabank;

import java.time.LocalDate;
import java.util.Locale;

public class TestaBanco {

	public static void main(String[] args) {
		
		/*Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates",
				"259.800.966-55","123.456-78");
		
		PessoaFisica pfJessica = new PessoaFisica();
		pfJessica.setNome("Jéssica");
		pfJessica.setEmail("jessica@digitalhouse.com");
		pfJessica.setTelefone("21971549772");
		pfJessica.setCpf("879.359.983-88");
		pfJessica.setProfissao("Aluna");
		pfJessica.setRg("12234578-9");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setTitular(pfJessica);

		
		conta1.depositar(100.0);
				
		System.out.println("Agencia: "+ conta1.getAgencia());
		System.out.println("Conta: "+ conta1.getNumeroConta());
		System.out.println("Titular: "+ conta1.getTitular().getNome());
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
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(1000);
		System.out.println("Saldo " + cc1.getSaldo());
		System.out.println("Limite "+cc1.getLimite());
		System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());
		cc1.sacar(1500);
		System.out.println("Saldo " + cc1.getSaldo());
		System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());	
		*/
		
		Locale.setDefault(new Locale("pt", "BR"));
		FuncionarioGerente funcionario = new FuncionarioGerente("Jéssica", "001.122.348-92","87759",LocalDate.now(),2500.0);
		
		System.out.println(funcionario.toString());
		System.out.printf("Bonus: %.2f\n",funcionario.getBonus());
		
		boolean resposta = funcionario.autenticarSistema("usuariopadrao", "mudar123");
		
		if(resposta)
			System.out.println("Bem vindo(a)"+funcionario.getNome());
		else
			System.out.println("Usuário ou senha inválidos");
	}
			
}
