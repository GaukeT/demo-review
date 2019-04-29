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
        sh './gradlew sonarqube -Dsonar.projectKey="GaukeT_demo-review" -Dsonar.organization="gauket-github" -Dsonar.host.url="https://sonarcloud.io" -Dsonar.login="dde7a6d2010646eff547ce2f5eb367976b57b587"'
      }
    }
  }
}