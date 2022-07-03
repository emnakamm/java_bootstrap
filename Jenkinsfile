pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            	bat 'mvn clean install'
                
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }

    }
}
