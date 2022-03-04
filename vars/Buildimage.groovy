#! /usr/bin/env groovy
def call(string ImageName) {
  echo "Building the docker image..."
  withCredentials([usernamePassword(credentialsId: 'docker_hub', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
    sh "echo $PwD | docker login -u $USER --password-stdin"
    sh "docker build -t $ImageName ."
    sh "docker push $ImageName" 
  }
}