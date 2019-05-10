#!groovy
// TODO: implement library
// @Library('github.com/GaukeT/jenkins-common')

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
    stage('Update version') {
      steps {
        sh 'echo version_update'
        // TODO: implement method from library
        // updateVersion()
      }
    }
  }
}
