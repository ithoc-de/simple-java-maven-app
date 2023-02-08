/*
 * Jenkinsfile (Declarative Pipeline)
 *
 * Requires the Docker Pipeline plugin
 */
pipeline {
    agent none
    stages {
        stage('Backend') {
            agent {
                docker {
                    image 'maven:3.8.7-eclipse-temurin-11'
                }
            }
            steps {
                sh 'java -version'
                sh 'mvn --version'
            }
        }
        stage("Frontend") {
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
    }
    post {
        always {
            echo 'Build done '
        }
        success {
            echo 'successfully'
        }
        failure {
            echo 'with failure'
        }
    }
}