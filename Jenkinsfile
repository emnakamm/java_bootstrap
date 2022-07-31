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
        stage('Build docker image') {
            steps {
            	bat 'docker build --tag backdocker  . '
            	
                
            }
        }
        stage('run docker image') {
            steps {
            	bat 'docker run -d -p 8082:8082 backdocker '
            	
                
            }
        }


    }
}
