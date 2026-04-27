def call(String ProjectName, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
    sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}
  }
    sh "docker push ${DOCKER_USER}/${ProjectName}:${ImageTag}
}
