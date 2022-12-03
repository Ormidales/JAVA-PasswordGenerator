package passwordGenerator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordGeneratorTest {
  @Test
  public void testGeneratePassword() {
    // Générer un mot de passe
    String password = PasswordGenerator.generatePassword(15, "djherjierjerh");

    // Vérifier que le mot de passe n'est pas vide
    assertTrue(password.length() > 0);
    assertFalse(password.length() < 0);

    // Vérifier que le mot de passe ne contient que des caractères autorisés
    for (int i = 0; i < password.length(); i++) {
      assertTrue(PasswordGenerator.ALLOWED_CHARACTERS.contains(String.valueOf(password.charAt(i))));
    }
  }
}
