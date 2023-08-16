pipeline {
    agent any
    stages {
        stage('Prepare') {
            steps {
                 sh "echo 'Fase Preparación!'"
            }
        }
        stage('Compile') {
            steps {
                sh "echo 'Fase Compilación!'"
            }
        } 
        stage('Test') {
            steps {
                sh "echo 'Fase lanzar pruebas!'"
            }
        } 
        stage('Deploy') {
            steps {
                sh "echo 'Fase hacer despliegue en el entorno!'"
            }
        } 
    }
    post {
            success {
                sh "echo 'Fase Ok!'"
            }
            failure {
                sh "echo 'Fase fallido!'"
            }
        }
}
