# Projet compétences

## Présentation

Ce projet est la réalisation de la partie Back end du projet de l'ECF. Le but de ce projet est de concevoir une application de gestion de location de vehicule destiné
à usage interne des employé de la société Localib.
Un employé peut ajouter un nouveau client, modifier ses informations ou bien le spprimer.
Il peut aussi ajouter un nouveau véhicules à la flotte de la société, modifier ses informatons u le supprimer.
Il peut effectuer une location durant une période donnée d'un véhicule avec un locataire spécifique.

Il nous a été demandé de faire le back avec spring boot soit en jpa (mySql) ou avec mongoDB.

## Prérequis

- Java 11+
- [docker](https://docs.docker.com/get-docker/)
- [docker-compose](https://docs.docker.com/compose/install/)
- ou une base de donnée installé localement dans notre cas Mongo Compas
- un IDE (IntelliJ, Eclipse)

## Installation

### Base de données

Si aucune base de données est présente localement effectuer la démarche suivante:

Pour lancer la base de données, il faut se placer dans le dossier `docker` et lancer la commande suivante :

```bash
docker-compose up -d
```

### Lancement de l'application sans IDE

Pour lancer l'application, il faut se placer dans le dossier racine et lancer la commande suivante :

```bash
./gradlew spring-boot:run
```

### Lancement de l'application avec IntelliJ

Pour laancer l'application avec un IDE, lancer la class `MycompApplication`
