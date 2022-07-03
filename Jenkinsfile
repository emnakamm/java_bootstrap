pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            	mvn clean install
                
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
