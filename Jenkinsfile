pipeline {
  agent any
  stages {
    stage('Hello') {
      parallel {
        stage('Hello') {
          agent any
          steps {
            echo 'Hello World'
          }
        }
        stage('Hi') {
          steps {
            echo 'Hi'
          }
        }
      }
    }
    stage('Update version') {
      steps {
        updateVersion()
      }
    }
  }
}