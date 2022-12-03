package passwordGenerator;

public class App {

	public static void main(String[] args) {
		
		String password2 = PasswordGenerator.generatePassword(50, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?"); // Génère un mot de passe de 12 caractères
		System.out.println(password2);

	}

}
