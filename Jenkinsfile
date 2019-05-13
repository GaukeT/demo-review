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
            // store Global config in local variable
            // https://github.com/GaukeT/jenkins-common/blob/master/src/nl/gauket/GlobalConfig.groovy
            def libraryVersion = GlobalConfig.library_version
            def environment = GlobalConfig.config[env.BRANCH_NAME]

            // print config
            echo "Library verson: ${libraryVersion}"
            echo "Environment: ${environment}"
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
