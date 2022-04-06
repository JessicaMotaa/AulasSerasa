package fgabank;

import java.time.LocalDate;

public class FuncionarioGerente extends Funcionario implements AcessoInterno{

	private String usuario= "usuariopadrao";
	private String senha= "mudar123";
	
	public FuncionarioGerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FuncionarioGerente(String nome, String cpf, String ctps, LocalDate dataDeAdmissao, Double salario) {
		super(nome, cpf, ctps, dataDeAdmissao, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonus() {
		return this.getSalario()*0.1;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if(this.usuario.equals(usuario) && this.senha.equals(senha)){
		return true;
	}
		return false;
	}
	@Override
	public boolean mudarSenha(String senhaAntiga, String senhaNova) {
		if (this.senha.equals(senhaAntiga) && senhaNova.length() == 8) {
			this.senha = senhaNova;
			return true;
		}
		return false;
	}

	@Override
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo) {
		if (this.usuario.equals(usuarioAntigo) && usuarioNovo.length() == 12) {
			this.usuario = usuarioNovo;
			return true;
		}
		return false;


}
}