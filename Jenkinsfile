pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            	bat 'mvn clean install -DskipTests'
            	
                
            }
         stage('sonarqube analysis') 
            {mvn clean sonar:sonar}
        }
        stage('Test') {
            steps {
            
                bat ' mvn test'
            }
        }


    }
}
