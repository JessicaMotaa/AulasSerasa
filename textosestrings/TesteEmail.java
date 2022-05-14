package textosestrings;

public class TesteEmail {
	public static void main(String[] args) {
		
		ExpressoesRegulares emailValido = new ExpressoesRegulares("teste@teste.com.br");
		System.out.println("Email:"+emailValido.getEmail());
		
		ExpressoesRegulares emailInvalido = new ExpressoesRegulares("teste@teste.com.br");	
		
		ExpressoesRegulares2 telefoneValido = new ExpressoesRegulares2 ("21","999999999");
		System.out.println(telefoneValido.toString());
		
		ExpressoesRegulares2 dddinvalido = new ExpressoesRegulares2("210","99999999");
		ExpressoesRegulares2 numeroinvalido = new ExpressoesRegulares2("21","99999999");
	}
}
