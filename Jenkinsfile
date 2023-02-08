/*
 * Jenkinsfile (Declarative Pipeline)
 *
 * Requires the Docker Pipeline plugin
 */
pipeline {
    agent { docker { image 'maven:3.8.7-eclipse-temurin-11' } }
    stages {
        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn --version'
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