package passwordGenerator;

public class App {

	public static void main(String[] args) {
		
		// Créer et affiche un code créer par la classe PasswordGenerator
		String password = PasswordGenerator.generatePassword(50, "zefzeui534564$^$^ù:");
		System.out.println(password);

	}

}
