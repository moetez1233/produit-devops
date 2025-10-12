# Projet Product & Pets API

Ce projet contient :  

- **OpenAPI** : Génération automatique d'API pour les produits et les animaux de compagnie.  
- **Dockerfile** : Permet de construire l'image Docker du projet.  
- **Jenkinsfile** : Contient les pipelines qui permettent de :  
  - Construire le projet (build ).  
  - Construire et pousser l'image Docker vers Docker Hub.  (build , push)
  - Exécuter l'image Docker sur le port **9090**.  

---

### Exemple d'utilisation

Pour afficher tous les produits, rendez-vous sur :  
[http://localhost:9090/produit](http://localhost:9090/produit)
### Docker commande 
docker images 
docker ps 
crearte image from dockerFile : docker build -t dockerhubName/jarName:tagVersion
                   example : docker build -t madmoetez/pc-produit:1.0
enter inside docker image : docker exec -it dockerId /bin/sh
push docker to dockerImage to dockerHub : docker push dockerHubName/imageName:tagVersion
                    example : docker push admoetez/poc-produit:1.0
run dockerImage: docker run -d -p 9090:9090 madmoetez/poc-produit:1.0
# 🚀 Essential Kubernetes Commands Reference

This document provides a quick reference for the most common `kubectl` commands, grouped by resource type.

## Pod Management

| Command | Description | Example |
| :--- | :--- | :--- |
| **List Pods** | Shows a list of all Pods in the current namespace. | `kubectl get pod` |
| **Create Pod** | Creates a Pod (or any resource) from a YAML manifest file. | `kubectl apply -f produitPod.yaml` |
| **Delete Pod** | Deletes a Pod by its name. | `kubectl delete pod produit` |
| **Get Details** | Shows detailed information (events, status, configuration) about a specific Pod. | `kubectl describe pod produit` |

## Deployment and Resource Management

| Command | Description | Example |
| :--- | :--- | :--- |
| **List Resources** | Lists all resources of a specific type (e.g., deployments, services). | `kubectl get deployment` |
| **Get Details** | Shows detailed information about any resource (Pod, Deployment, Service, etc.). | `kubectl describe deployment my-app` |
| **Edit Resource** | Opens the live configuration of a resource in an editor (like `nano` or `vim`). | `kubectl edit deployment metrics-server -n kube-system` |

## Namespace Management

| Command | Description | Example |
| :--- | :--- | :--- |
| **List Namespaces** | Shows all namespaces in the cluster. | `kubectl get namespace` |
| **Create Namespace** | Creates a new namespace. | `kubectl create ns dev-environment` |
| **View Pods in NS** | Lists the Pods within a specific namespace. | `kubectl get pods -n kube-system` |
| **View All Pods** | Lists **all** Pods across **all** namespaces (`-A` or `--all-namespaces`). | `kubectl get pods -A` |

## Monitoring and Metrics (Static)

| Command | Description | Example |
| :--- | :--- | :--- |
| **Show Node Metrics** | Shows CPU and Memory usage for all Nodes (requires Metrics Server). | `kubectl top nodes` |
| **Show Pod Metrics** | Shows CPU and Memory usage for all Pods across all namespaces. | `kubectl top pods -A` |



