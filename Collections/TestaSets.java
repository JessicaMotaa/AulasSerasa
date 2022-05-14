package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaSets {
	public static void main(String[] args) {
		
		Set<Double>notas = new HashSet<>(Arrays.asList(7.5,8.9,10.0,5.5,3.1)); //Adicionar valores a uma collection
		
		notas.add(7.5);
		System.out.println(notas);//Imprime de forma aleatória. List (pesquisa, porém uso computacional maior) 
		
		for (Double doubleTemp : notas) { //Notas(Lista), Double(tipo), Doubletemp (onde sera armazenado temporariamente)
		System.out.println(doubleTemp);	
		}
		
		System.out.println("Maior nota " +Collections.max(notas));
		System.out.println("Menor nota " +Collections.min(notas));
		
		double soma =0;
		for(Double doubletemp : notas) {
			soma +=doubletemp;
		}
		System.out.println("Média notas: " +(soma/notas.size()));
		
		//Collections.shuffle (coloca os  numeros em ordem aleatoria)
	
	}
}
