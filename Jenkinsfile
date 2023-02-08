/*
 * Jenkinsfile (Declarative Pipeline)
 *
 * Requires the Docker Pipeline plugin
 */
pipeline {
    agent none
    stages {
        stage('Build') {
            agent {
                docker {
                    image 'maven:3.8.7-eclipse-temurin-11'
                }
            }
            environment {
                DB_HOST = 'localhost'
                DB_PORT = '2306'
            }
            steps {
                sh 'java -version'
                sh 'mvn --version'
                echo "DB_HOST = ${DB_HOST}"
                echo "DB_PORT = ${DB_PORT}"
            }
        }
        stage("Test") {
            agent {
                docker {
                    image 'node:16.13.1-alpine'
                }
            }
            steps {
                sh 'node --version'
                sh 'npm -v'
            }
        }
        stage("Deploy") {
            agent any
            steps {
                input "Do you really want to deploy your changes to production?"
            }
        }
    }
    post {
        always {
            echo 'Pipeline ended '
        }
        success {
            echo 'successfully'
        }
        failure {
            echo 'with failure'
        }
    }
}