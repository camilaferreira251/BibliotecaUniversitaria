package BibliotecaUniversitária.entidades;



public class ValidaTelefone {
	
	public static boolean validaTelefone(String telefone){
		
		if( telefone.length() < 10 && telefone.length() >7)
			return true;

		
		if(telefone.charAt(0) != '0' && telefone.charAt(0) != '1')
			return true;
		
		return false;
		
	}

}
