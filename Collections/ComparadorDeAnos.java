package Collections;

import java.util.Comparator;

public class ComparadorDeAnos implements Comparator <Carro> {

	@Override
	public int compare(Carro c1, Carro c2) { //c1 e c2 comparam dois posições, até conseguir comparar todos os valores.
		return Integer.compare(c1.getAno(), c2.getAno());
	}

}
