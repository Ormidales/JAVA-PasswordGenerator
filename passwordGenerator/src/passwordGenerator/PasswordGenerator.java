package passwordGenerator;

import java.security.SecureRandom;

public class PasswordGenerator {
  // Définir les caractères autorisés dans le mot de passe
  static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";

  // Générateur de nombres aléatoires sécurisé
  private static final SecureRandom RANDOM = new SecureRandom();

  //Générer un mot de passe
  public static String generatePassword(int passwordLength, String allowedCharacters) {
    // Initialiser le mot de passe généré
    StringBuilder password = new StringBuilder(passwordLength);

    // Générer le mot de passe en sélectionnant des caractères aléatoires dans la liste des caractères autorisés
    for (int i = 0; i < passwordLength; i++) {
      int index = RANDOM.nextInt(allowedCharacters.length());
      password.append(allowedCharacters.charAt(index));
    }

    // Retourner le mot de passe généré
    return password.toString();
  }
}
