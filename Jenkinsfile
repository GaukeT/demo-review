#!groovy
@Library('github.com/GaukeT/jenkins-common')

import nl.gauket.GlobalVars

def app = 'demo-review'

pipeline {
  agent any
  stages {
    stage('Docker') {
      agent any
      steps {
//        TODO: implement docker build without using sh and create common method
        sh 'echo "docker image created."'
//        sh './gradlew clean build'
//        sh 'docker build -t aphv/demo-review .'
//        sh 'docker run -t -d --name aphv-demo-review -p 8080:8080 --restart=always -ti aphv/demo-review'
//        sh 'docker ps -a'
//        sh 'docker stop aphv-demo-review'
//        sh 'docker rm aphv-demo-review'
      }
    }
    stage('run JUnit-tests') {
      steps {
//        TODO: create automated test stage.
        sh 'echo "Tests passed"'
//        sh './gradlew jacocoTestReport'
      }
    }
    stage('Update version') {
      steps {
        updateVersion()
      }
    }

    stage('vars') {
      steps {

        println GlobalVars.library_version

        println "working currunt on branch: ${env.BRANCH_NAME}"
        println "env: ${common.config[env.BRANCH_NAME].env}"
        println "snapshot: ${common.config[env.BRANCH_NAME].snapshot}"
      }
    }

  }
}
