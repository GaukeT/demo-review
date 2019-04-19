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
        stage('Docker') {
          agent any
          steps {
            sh 'docker build -t aphv/demo-review .'
            sh 'docker run -t -d --name aphv-demo-review -p 8080:8080 --restart=always -ti aphv/demo-review'
            sh 'docker ps -a'
            sh 'docker stop aphv-demo-review'
          }
        }
      }
    }
  }
}