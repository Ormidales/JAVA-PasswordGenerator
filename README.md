# Générateur de mot de passe sécurisé

Ce projet permet de générer des mots de passe aléatoires et sécurisés en java.

## Installation

Pour utiliser ce projet, vous devez d'abord le télécharger ou le cloner à partir de ce dépôt GitHub.

```git
git clone https://github.com/Ormidales/JAVA-PasswordGenerator.git
```

Ensuite, vous pouvez importer le projet dans votre environnement de développement préféré, comme Eclipse ou IntelliJ.

## Utilisation

Pour utiliser le générateur de mot de passe, vous pouvez créer une instance de la classe `PasswordGenerator` et appeler la méthode `generatePassword` en lui fournissant la longueur souhaitée du mot de passe en argument.

```java
PasswordGenerator generator = new PasswordGenerator();
String password = generator.generatePassword(12); // Génère un mot de passe de 12 caractères
```

Vous pouvez également personnaliser les caractères autorisés dans les mots de passe générés en passant une liste de caractères autorisés en argument de la méthode `generatePassword`.

```java
String password = generator.generatePassword(12, "abcdefghijklmnopqrstuvwxyz"); // Génère un mot de passe de 12 caractères avec seulement des minuscules
```

## Auteurs

- Ormidales (https://github.com/Ormidales / https://hugodoueil.fr)
