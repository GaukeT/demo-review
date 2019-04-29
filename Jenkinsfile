pipeline {
  agent any
  stages {
    stage('Run') {
      parallel {
        stage('Hello World') {
          agent any
          steps {
            echo 'Hello World'
          }
        }
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
      }
    }
    stage('SonarQube Analysis') {
      steps {
        sh './gradlew sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.projectKey=nl.gauket.demoreview -Dsonar.login=1481429e863f8c1fac142a91a2f21de7184ca9e4'
      }
    }
  }
}