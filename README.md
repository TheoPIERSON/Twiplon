# Twi-plon :  Réseau Social avec Spring Boot

## Description

Bienvenue dans l'application de réseau social développée avec Spring Boot ! Cette application permet aux utilisateurs de créer des publications, d'interagir avec celles-ci en laissant des likes et des commentaires.

## Fonctionnalités

1. Inscription et Connexion :
   - Les utilisateurs peuvent s'inscrire en fournissant un nom d'utilisateur unique et un mot de passe sécurisé.
   - Les utilisateurs peuvent se connecter à leur compte pour accéder aux fonctionnalités du réseau social.

2. Publications :
   - Les utilisateurs peuvent créer des publications en partageant du contenu texte.
   - Les publications affichent l'auteur, la date de création et le contenu.

3. Likes :
   - Les utilisateurs peuvent interagir avec les publications en laissant des likes.
   - Les likes sont associés à l'utilisateur et à la publication correspondante.

4. Commentaires :
   - Les utilisateurs peuvent laisser des commentaires sur les publications.
   - Les commentaires affichent l'auteur, la date de création et le contenu.

## Configuration du Projet

1. Prérequis :
   - Java 17 ou version ultérieure.
   - Maven pour la gestion des dépendances.

2. Configuration de la Base de Données :
- Lien de connexion vers la bdd Neon : `jdbc:postgresql://ep-white-wildflower-32703547.eu-central-1.aws.neon.tech/neondb?user=benbahlouli.nahim&password=wipIM6cmOR0y`
- Dans le fichier `application.properties` situé dans le dossier `src/main/resources`, configurez les paramètres de connexion à votre base de données.
- Script de création de la structure de la base de données : `create_tables.sql`

3. Compilation et Exécution :
- Allez dans le dossier racine du projet.
- Exécutez la commande suivante pour compiler le projet :
# Twiplon
