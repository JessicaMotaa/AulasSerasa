package criandoUmJogo;

public class Arma2 {
	
	private int quantidadeDeTiros;
	private int tempoRecarga;
	
	public void atirar(int quantidadeDeTiros) {
		this.quantidadeDeTiros=quantidadeDeTiros;
	}
	
	public void recarrregar(int tempoRecarga) {
		this.tempoRecarga=tempoRecarga;
	}
	@Override
	public String toString() {
		return "Minha arma tem "+quantidadeDeTiros+" tiros e para recarregar leva "+tempoRecarga+" segundos ";
	}

}
