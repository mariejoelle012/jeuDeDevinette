# Jeu de Devinettes en Java

## Description
Ce programme Java est un jeu de devinettes. L'ordinateur génère un nombre aléatoire entre 1 et 100 et l'utilisateur a 10 essais pour le trouver. Après chaque essai, le programme indique si le nombre proposé est trop grand ou trop petit.

---

## Structure du projet

MonProjet/
├── src/
│   └── Main.java

---

## Code source expliqué

### 1. Les imports

import java.util.Random;
import java.util.Scanner;

Ces deux imports sont nécessaires pour :
- Random : générer un nombre aléatoire
- Scanner : lire les saisies de l'utilisateur dans la console

---

### 2. Génération du nombre secret

Random random = new Random();
int nombreSecret = random.nextInt(100) + 1;

- On crée un objet Random pour générer des nombres aléatoires.
- nextInt(100) génère un nombre entre 0 et 99.
- On ajoute + 1 pour obtenir un nombre entre 1 et 100.
- Ce nombre est stocké dans nombreSecret et l'utilisateur doit le deviner.

---

### 3. Les variables du jeu

int maxEssais = 10;
boolean gagne = false;

- maxEssais : définit le nombre maximum d'essais autorisés (10).
- gagne : indique si l'utilisateur a trouvé le nombre. Elle est false au départ et passe à true si l'utilisateur trouve le bon nombre.

---

### 4. La boucle principale

for (int essai = 1; essai <= maxEssais; essai++) {
System.out.print("Essai " + essai + "/" + maxEssais + " → Entrez votre nombre : ");
int devine = scanner.nextInt();
}

- La boucle for tourne jusqu'à 10 fois maximum.
- A chaque tour, l'utilisateur entre un nombre stocké dans devine.
- Le compteur essai s'incrémente automatiquement à chaque tour.

---

### 5. La comparaison avec le nombre secret

if (devine < nombreSecret) {
System.out.println("Nombre proposé plus grand !");
} else if (devine > nombreSecret) {
System.out.println("Nombre proposé plus petit !");
} else {
gagne = true;
break;
}

Trois cas possibles :
- Si devine est plus petit que nombreSecret : on dit à l'utilisateur de proposer plus grand.
- Si devine est plus grand que nombreSecret : on dit à l'utilisateur de proposer plus petit.
- Si devine est égal à nombreSecret : l'utilisateur a gagné, gagne passe à true et break sort de la boucle.

---

### 6. Fin de partie

if (!gagne) {
System.out.println("Dommage ! Vous avez épuisé vos " + maxEssais + " essais.");
System.out.println("Le nombre secret était : " + nombreSecret);
}

Si après 10 essais l'utilisateur n'a pas trouvé :
- On affiche un message de défaite.
- On révèle le nombre secret pour que l'utilisateur sache ce qu'il fallait trouver.

---

### 7. Fermeture du Scanner

scanner.close();

On ferme le Scanner après utilisation pour libérer la mémoire.
C'est une bonne pratique à toujours respecter.

---

## Exemple de partie gagnée

=== Jeu de Devinettes ===
Devinez un nombre entre 1 et 100.
Vous avez 10 essais.

Essai 1/10 → Entrez votre nombre : 50
Nombre proposé plus grand !

Essai 2/10 → Entrez votre nombre : 75
Nombre proposé plus petit !

Essai 3/10 → Entrez votre nombre : 63
Félicitations ! Vous avez trouvé le nombre 63 en 3 essai(s) !

---

## Exemple de partie perdue

=== Jeu de Devinettes ===
Devinez un nombre entre 1 et 100.
Vous avez 10 essais.

Essai 10/10 → Entrez votre nombre : 42
Nombre proposé plus petit !

Dommage ! Vous avez épuisé vos 10 essais.
Le nombre secret était : 37

---

## Comment importer le projet

1. Cloner le dépôt :
   git clone https://github.com/votre-utilisateur/jeu-de-devinettes.git

2. Ouvrir le projet dans IntelliJ IDEA.

3. Exécuter la classe Main.java.

4. Entrer un nombre entre 1 et 100 dans la console.

---

## Prérequis
- Java 8 ou supérieur
- IntelliJ IDEA (recommandé)