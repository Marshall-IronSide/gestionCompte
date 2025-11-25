# Gestion de Compte 💼

Un système de gestion de comptes bancaires développé en Java dans le cadre d'un projet académique.

## 📋 Description

Ce projet implémente un système de gestion de comptes bancaires permettant de gérer différents types de comptes, effectuer des transactions et suivre l'historique des opérations. Il démontre l'utilisation des concepts de programmation orientée objet en Java.

## ✨ Fonctionnalités

- **Gestion des comptes**
  - Création de comptes (compte courant, compte épargne)
  - Consultation de solde
  - Modification des informations de compte
  - Suppression de comptes

- **Opérations bancaires**
  - Dépôt d'argent
  - Retrait d'argent
  - Virement entre comptes
  - Historique des transactions

- **Gestion des clients**
  - Enregistrement de nouveaux clients
  - Mise à jour des informations clients
  - Association clients-comptes

## 🛠️ Technologies utilisées

- **Langage** : Java
- **IDE recommandé** : IntelliJ IDEA, Eclipse, ou NetBeans
- **Version Java** : JDK 8 ou supérieur

## 📦 Structure du projet

```
gestionCompte/
│
├── src/
│   ├── models/           # Classes métier (Compte, Client, Transaction)
│   ├── services/         # Logique métier
│   ├── utils/            # Classes utilitaires
│   └── Main.java         # Point d'entrée de l'application
│
├── docs/                 # Documentation
├── tests/                # Tests unitaires
└── README.md
```

## 🚀 Installation et exécution

### Prérequis

- JDK 8 ou version supérieure installé
- Un IDE Java ou un terminal avec javac

### Étapes d'installation

1. **Cloner le dépôt**
   ```bash
   git clone https://github.com/Marshall-IronSide/gestionCompte.git
   cd gestionCompte
   ```

2. **Compiler le projet**
   ```bash
   javac -d bin src/**/*.java
   ```

3. **Exécuter l'application**
   ```bash
   java -cp bin Main
   ```

### Utilisation avec un IDE

1. Ouvrir le projet dans votre IDE
2. Configurer le JDK dans les paramètres du projet
3. Exécuter la classe `Main.java`

## 💡 Utilisation

### Exemple de création de compte

```java
// Créer un client
Client client = new Client("Dupont", "Jean", "jean.dupont@email.com");

// Créer un compte courant
CompteCourant compte = new CompteCourant("FR7630001007941234567890185", 1000.0);

// Effectuer un dépôt
compte.deposer(500.0);

// Effectuer un retrait
compte.retirer(200.0);

// Consulter le solde
System.out.println("Solde actuel: " + compte.getSolde() + "€");
```

## 🏗️ Architecture

Le projet suit une architecture en couches :

- **Couche modèle** : Représente les entités (Compte, Client, Transaction)
- **Couche service** : Contient la logique métier
- **Couche présentation** : Interface utilisateur (console ou GUI)

### Concepts OOP utilisés

- Encapsulation
- Héritage (CompteCourant, CompteEpargne extends Compte)
- Polymorphisme
- Abstraction
- Gestion des exceptions

## 🧪 Tests

Pour exécuter les tests unitaires (si implémentés) :

```bash
java -cp bin:junit.jar org.junit.runner.JUnitCore TestSuite
```

## 📝 Fonctionnalités futures

- [ ] Interface graphique (Swing/JavaFX)
- [ ] Persistance des données (fichiers/base de données)
- [ ] Authentification et sécurité
- [ ] Génération de relevés bancaires
- [ ] Calcul d'intérêts pour comptes épargne
- [ ] Export des transactions (PDF, CSV)

## 🤝 Contribution

Ce projet étant un travail académique, les contributions externes ne sont pas acceptées. Cependant, n'hésitez pas à forker le projet pour vos propres expérimentations.

## 👨‍💻 Auteur

**Marshall IronSide**
- GitHub: [@Marshall-IronSide](https://github.com/Marshall-IronSide)

## 📄 Licence

Ce projet est développé dans un cadre éducatif. Tous droits réservés.

## 📞 Contact

Pour toute question ou suggestion concernant ce projet, n'hésitez pas à ouvrir une issue sur GitHub.

---

⭐ Si ce projet vous a été utile, n'hésitez pas à lui donner une étoile !
