package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TesteMaps {
	
	public static void main(String[] args) {
	
		Map<String, Integer>quadroMedalhasOlimpicas2020 = new HashMap<>();
		
		// .put -> Adiciona valores ao Map.
		
		quadroMedalhasOlimpicas2020.put("Eua",113);
		quadroMedalhasOlimpicas2020.put("China",88);
		quadroMedalhasOlimpicas2020.put("Japao",58);
		quadroMedalhasOlimpicas2020.put("Grã-bretanha",65);
		quadroMedalhasOlimpicas2020.put("Brasil",21);
		
		//containsKey -> Busca info através de uma chave e retorna booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("EUA"));
		
		
		//containsValue -> Busca info através de uma valor e retorna booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(88));
		
		//size -> Informa o tamanho do Map
		System.out.println(quadroMedalhasOlimpicas2020.size());
				
		//get -> Consultar valor armazenado na chave
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));
		
		//remove ->Remover valor da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		for (Map.Entry<String, Integer> entry : quadroMedalhasOlimpicas2020.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println("==========================");
		
		for (String key : quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key +" => "+ quadroMedalhasOlimpicas2020.get(key));
		}
		
		System.out.println("==========================");
		System.out.println("TreeMap");
		
		TreeMap<String, Integer>quadroMedalhasOlimpicas2016 = new TreeMap<>();//Implementação de TreeMap
		
		quadroMedalhasOlimpicas2016.put("EUA", 103);
		quadroMedalhasOlimpicas2016.put("China", 90);
		quadroMedalhasOlimpicas2016.put("Japão", 50);
		quadroMedalhasOlimpicas2016.put("Grã-Bretanha", 70);
		quadroMedalhasOlimpicas2016.put("Brasil", 17);
		
		// O TreeMap organiza as chaves em ordem alfabética, pois utiliza o valor da chave.
		
		System.out.println(quadroMedalhasOlimpicas2016.firstKey()); //pega a primeira chave
		System.out.println(quadroMedalhasOlimpicas2016.lastKey()); //pega a ultima chave
		
		System.out.println(quadroMedalhasOlimpicas2016.lowerKey("China")); //exibe a chave anterior 
		System.out.println(quadroMedalhasOlimpicas2016.higherKey("China")); //exibe a chave posterior

			
		System.out.println(quadroMedalhasOlimpicas2016.pollFirstEntry()); //exibe o valor e apaga posteriormente 
		System.out.println(quadroMedalhasOlimpicas2016.pollLastEntry()); //exibe o valor e apaga posteriormente
		
		System.out.println("==========================");
		
		for (String key : quadroMedalhasOlimpicas2016.keySet()) {
			System.out.println(key +" => "+ quadroMedalhasOlimpicas2016.get(key));
	}

	}	
	}

