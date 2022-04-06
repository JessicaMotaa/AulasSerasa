package fgabank;

public class FuncionarioDiretor extends Funcionario {
	
	@Override
	public double getBonus() {
		return this.getSalario()*0.15;
	}
}
