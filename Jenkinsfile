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
        // method of the imported library is used here. 
        // https://github.com/GaukeT/jenkins-common/blob/master/vars/updateVersion.groovy
        updateVersion()
      }
    }
  }
} 
