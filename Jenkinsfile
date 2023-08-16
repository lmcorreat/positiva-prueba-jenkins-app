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
}
