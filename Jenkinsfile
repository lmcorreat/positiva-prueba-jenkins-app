pipeline {
    agent any
    stages {
        stage('Prepare') {
            steps {
                sh 'chmod +x ./mvnw'
            }
        }
        stage('Compile') {
            steps {
                withMaven(mavenSettingsConfig: 'MavenJenkinsSettings') {
                    sh './mvnw clean compile'
                }
            }
        }
        stage('Verify') {
            steps {
                withMaven(mavenSettingsConfig: 'MavenJenkinsSettings') {
                    sh './mvnw verify'
                }
            }
        }  
    }
    post {
            always{
               sh "echo ' Fase que siempre se ejecuta!'"
            }
            success {
                sh "echo 'Fase Ok!'"
            }
            failure {
                sh "echo 'Fase fallido!'"
            }
        }
}
