#!groovy
@Library('github.com/GaukeT/jenkins-common')

import nl.gauket.GlobalConfig

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
    stage('Global config') {
        steps {
            // print variables from the shared library
            // https://github.com/GaukeT/jenkins-common/blob/master/src/nl/gauket/GlobalConfig.groovy
            echo "Library verson: ${GlobalConfig.library_version}"
            echo "Environment: ${GlobalConfig.config[env.BRANCH_NAME]}"
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
