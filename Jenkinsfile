pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            	bat 'mvn clean install -DskipTests'
            	
                
            }

        }
        stage('Test') {
            steps {
            
                bat ' mvn test'
            }
        }
         stage('sonar') {
            steps {
            
                bat '  mvn clean verify sonar:sonar'
            }
        }


    }
}
