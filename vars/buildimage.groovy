def call() {
  echo "Building the docker image..."
  withCredentials([usernamePassword(credentialsId: 'docker_hub', passwordVariable: 'PWD', usernameVariable: 'USER')]) {
    sh "echo $PwD | docker login -u $USER --password-stdin"
    sh 'docker build -t doc299/java-maven-app:1.1 .'
    sh 'docker push doc299/java-maven-app:1.1'
  }
}