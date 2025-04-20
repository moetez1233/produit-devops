# Étape 1 : Utiliser une image JDK 17 comme base
FROM eclipse-temurin:17-jdk-alpine

# Étape 2 : Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Étape 3 : Copier le fichier JAR généré dans l'image
COPY target/poc-produit.jar poc-produit.jar

# Étape 4 : Exposer le port (ex: 8080)
EXPOSE 9090

# Étape 5 : Définir la commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "poc-produit.jar"]
