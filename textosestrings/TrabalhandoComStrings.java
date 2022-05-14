package textosestrings;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		
		//verificar se o valor é um número e retorna true ou false
		
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('a'));
		
		System.out.println("========================");
		
		//verificar se o valor é uma letra e retorna true ou false
		
		System.out.println(Character.isLetter('f'));
		System.out.println(Character.isLetter('5'));
		
		System.out.println("========================");
		
		//verificar se o valor é uma letra ou numero e retorna true ou false
		
		System.out.println(Character.isLetterOrDigit('1'));
		System.out.println(Character.isLetterOrDigit('c'));
		System.out.println(Character.isLetterOrDigit('@'));
				
		//Verificar se o valor está escrito com caracter maiusculo
				
		System.out.println(Character.isUpperCase('c'));	
		System.out.println(Character.isUpperCase('A'));
		
		//Verificar se o valor está escrito com caracter minusculo
		
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		
		//Verificar se o valor é um espaço em branco
				
		System.out.println(Character.isWhitespace('A'));
			
		//Strings		
		String arquivo = "escola.java";
		//Verifica valor antigo e substitui pelo novo 
		arquivo = arquivo.replace("java", "class");
		System.out.println(arquivo);
				
		//Compara 2 valores
		String nome1 = "Jessica";
		String nome2 = "jessica";
		
		//Coompara conteudo e carcateres maiusculo/minusculo
		
		System.out.println(nome1.equals(nome2));
		
		//Compara o ocnteudo do texto
		
		System.out.println(nome1.equalsIgnoreCase(nome2));
		
		//Verifica se inicia com exatamente a mesma sequencia de carcateres
		System.out.println(nome1.startsWith("fla"));
		System.out.println(nome1.startsWith("Fla"));
		
		//Verifica se finaliza com exatamente a mesma sequencia de carcateres
		System.out.println(nome1.endsWith("la"));
		System.out.println(nome1.endsWith("Fla"));
		
		//Compara as letras uma a uma
		//Muito usado para colocar em ordem alfabetica
		//colections
		System.out.println(nome1.compareTo(nome2));
		
		//mostra valor armazenado num determinado indice
		System.out.println(nome1.charAt(2));
		//Retorna uma parte de uma String (informas inicio e fim)
		System.out.println(nome1.substring(2,4));
		//Retorna a posição da 1ª ocorrencia de uma letra
		System.out.println(nome1.indexOf("a"));
		//Retorna a posição da ultima ocorrencia de uma letra
		System.out.println(nome1.lastIndexOf("a"));
		}
}
