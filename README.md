# 🛒 Product & Pets API Project

This project implements a backend API for managing products and pets, leveraging modern CI/CD practices with Docker and Jenkins, and providing a quick reference for common commands.

## 📦 Project Components

| Component | Description |
| :--- | :--- |
| **OpenAPI** | Automatically generates API documentation and structure for the Product and Pet endpoints. |
| **Dockerfile** | Defines the instructions to build the project's standardized Docker image. |
| **Jenkinsfile** | Contains CI/CD pipelines for automating the development lifecycle, including: <ul><li>Building the project artifacts.</li><li>Building and pushing the Docker image to **Docker Hub**.</li><li>Executing the Docker image on port **9090**.</li></ul> |

---

## 🛠️ Usage Example

The API is exposed on port `9090`. Once the Docker container is running, you can access the product endpoint:

🔗 **Endpoint Example:** `http://localhost:9090/produit`

---

## 🐳 Docker Command Reference

These are the essential commands for working with the project's Docker image and container.

| Command | Description | Example |
| :--- | :--- | :--- |
| **List Images** | Displays a list of all locally stored Docker images. | `docker images` |
| **List Containers** | Displays a list of all running containers (`-a` for all containers). | `docker ps` |
| **Create Image** | Builds a Docker image from the current directory's `Dockerfile`. | `docker build -t madmoetez/pc-produit:1.0 .` |
| **Run Image** | Runs the image, detaching (`-d`), and mapping the host port 9090 to the container port 9090. | `docker run -d -p 9090:9090 madmoetez/poc-produit:1.0` |
| **Push Image** | Uploads the tagged local image to Docker Hub. | `docker push madmoetez/poc-produit:1.0` |
| **Enter Container** | Executes an interactive shell inside a running container. | `docker exec -it <dockerId> /bin/sh` |

---

## 🚀 Essential Kubernetes Commands Reference

This section provides a quick reference for the most common `kubectl` commands, grouped by resource type.

### Pod Management

| Command | Description | Example |
| :--- | :--- | :--- |
| **List Pods** | Shows a list of all Pods in the current namespace. | `kubectl get pod` |
| **Create Pod** | Creates a Pod (or any resource) from a YAML manifest file. | `kubectl apply -f produitPod.yaml` |
| **Delete Pod** | Deletes a Pod by its name. | `kubectl delete pod produit` |
| **Get Details** | Shows detailed information (events, status, configuration) about a specific Pod. | `kubectl describe pod produit` |

### Deployment and Resource Management

| Command | Description | Example |
| :--- | :--- | :--- |
| **List Resources** | Lists all resources of a specific type (e.g., deployments, services). | `kubectl get deployment` |
| **Get Details** | Shows detailed information about any resource (Pod, Deployment, Service, etc.). | `kubectl describe deployment my-app` |
| **Edit Resource** | Opens the live configuration of a resource in an editor (`EDITOR` env variable). | `kubectl edit deployment metrics-server -n kube-system` |

### Namespace Management

| Command | Description | Example |
| :--- | :--- | :--- |
| **List Namespaces** | Shows all namespaces in the cluster. | `kubectl get namespace` |
| **Create Namespace** | Creates a new namespace. | `kubectl create ns dev-environment` |
| **View Pods in NS** | Lists the Pods within a specific namespace. | `kubectl get pods -n kube-system` |
| **View All Pods** | Lists **all** Pods across **all** namespaces (`-A` or `--all-namespaces`). | `kubectl get pods -A` |

### Monitoring and Metrics (Static)

| Command | Description | Example |
| :--- | :
