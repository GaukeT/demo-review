pipeline {
  agent any
  stages {
    stage('Docker') {
      agent any
      steps {
        sh './gradlew clean build'
        sh 'docker build -t aphv/demo-review .'
        sh 'docker run -t -d --name aphv-demo-review -p 8080:8080 --restart=always -ti aphv/demo-review'
        sh 'docker ps -a'
        sh 'docker stop aphv-demo-review'
        sh 'docker rm aphv-demo-review'
      }
    }
    stage('Jacoco test') {
      steps {
        sh './gradlew jacocoTestReport'
      }
    }
    stage('SonarQube Analysis') {
      steps {
        withCredentials([string(credentialsId: '35e7ba71-5499-41f2-bcf2-4ebf4854ea2e', variable: 'TOKEN')]) {
            sh './gradlew sonarqube -Dsonar.projectKey="GaukeT_demo-review" -Dsonar.organization="gauket-github" -Dsonar.host.url="https://sonarcloud.io" -Dsonar.login=$TOKEN'
        }
      }
    }
  }
}
