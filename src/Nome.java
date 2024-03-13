
public class Nome {
	public static void main(String[] args) {
		String primeiroNome = "Samuel";
		String segundoNome = "Andrade";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
	}



	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" " + segundoNome);
		

	}
}
