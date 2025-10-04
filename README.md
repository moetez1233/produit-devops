# Projet Product & Pets API

Ce projet contient :  

- **OpenAPI** : Génération automatique d'API pour les produits et les animaux de compagnie.  
- **Dockerfile** : Permet de construire l'image Docker du projet.  
- **Jenkinsfile** : Contient les pipelines qui permettent de :  
  - Construire le projet (build ).  
  - Construire et pousser l'image Docker vers Docker Hub.  (build , push)
  - Exécuter l'image Docker sur le port **9094**.  

---

### Exemple d'utilisation

Pour afficher tous les produits, rendez-vous sur :  
[http://localhost:9090/produit](http://localhost:9090/produit)
