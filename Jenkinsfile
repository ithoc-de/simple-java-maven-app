pipeline {
    agent {
        docker {
            image 'maven:3.8.7-eclipse-temurin-17'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deploy') {
            agent any
            steps {
                echo "Commit ID: ${GIT_COMMIT}"
                script {
                    echo "BUILD_NUMBER = $BUILD_NUMBER"
                }
            }
        }
    }
}