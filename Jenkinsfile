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
            steps {
                echo "Commit ID: ${GIT_COMMIT}"
                echo "BUILD_NUMBER = $BUILD_NUMBER"
                sh 'pwd'
                sh 'ls'
                sh 'docker info' => /var/jenkins_home/workspace/ven-app-pipeline_deploy-java-app@tmp/durable-b7f63982/script.sh: 1: docker: not found
                echo "Done"
            }
        }
    }
}