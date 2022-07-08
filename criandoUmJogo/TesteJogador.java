package criandoUmJogo;

public class TesteJogador {
	
	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
			
		Pistola pistola = new Pistola();
		pistola.atirar(15);
		pistola.recarregar(60);
		
		ArcoEflexa arco = new ArcoEflexa();
		arco.atirar(3);
		arco.recarregar(120);
				
}
}