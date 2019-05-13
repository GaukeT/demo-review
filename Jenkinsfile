#!groovy
@Library('github.com/GaukeT/jenkins-common')

def app = 'demo-review'

pipeline {
  agent any
  stages {
    stage('Hello') {
      agent any
      steps {
        echo 'Hello World'
      }
    }
    stage('Update version') {
      steps {
        updateVersion()
      }
    }
  }
} 
