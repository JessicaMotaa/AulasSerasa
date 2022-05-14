package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {
	
	public static void main(String[] args) {
		
		List<Carro> meusCarros = new ArrayList<>();
		
		Carro carro1 = new Carro("Audi X1",2022, "prata","2.2");
		meusCarros.add(carro1);
		
		meusCarros.add(new Carro("Renegade",2018,"preto","2.0"));
		meusCarros.add(new Carro("Etios Sedan",2019,"vermelho","1.6"));
		
		//meusCarros.remove(2);
		
		/*for (Carro carro : meusCarros) {
			System.out.println(carro.toString());
		}*/
		
		System.out.println("==========================================");
		
		/*for(int i =0; i< meusCarros.size();i++) { //Esse for tbm pode ser usado, porém o outro é mais simples
			Carro carroTemp = meusCarros.get(i);
			System.out.println(carroTemp.toString());// Mesmo sem o toString ele imprimiria, porém é bom usar pra ter um código limpo
		}*/
		
		System.out.println("==========================================");
		
		//System.out.println(meusCarros.get(1)); //Se souber a posição. Ex: 1. Pode ou não colocar toString.
		
		//boolean resp = meusCarros.contains(carro1);
		boolean resp = meusCarros.contains(new Carro("Etios Sedan",2019,"vermelho","1.6")); //Verifica se o item está na lista => melhor forma.
		System.out.println(resp);
		
		//Sort->comparable->Strings Se fosse numeros seria Comparator
		Collections.sort(meusCarros);		
		System.out.println(meusCarros.toString());
		
		System.out.println("==========================================");
		
		meusCarros.sort(new ComparadorDeAnos()); //Coloca em ordem crescente os anos
		System.out.println(meusCarros.toString());
		

		Collections.shuffle(meusCarros); //Colocar em ordem aleatoria
		System.out.println(meusCarros.toString());
	}
}
