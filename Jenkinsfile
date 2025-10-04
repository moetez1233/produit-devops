pipeline {
    agent any
  tools {
        maven 'maven3_9_11'
    }

    stages {
        stage('checkout and build') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/moetez1233/produit-devops']])
                sh 'mvn clean install -DskipTests'
                echo 'checkout and build with success'
            }
        }
        stage('Build docker') {
            steps {
                script{
                     sh "docker build -t madmoetez/poc-produit:1.0 ."
                }
            }
        }
        stage('push to docker hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpass', variable: 'dockerhubpass')]) {
                        sh 'docker login -u madmoetez -p ${dockerhubpass}'
                       sh "docker push madmoetez/poc-produit:1.0"

                    }
                }
            }
        }
    }


}
