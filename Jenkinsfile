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
