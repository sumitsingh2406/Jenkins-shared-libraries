def call(String ProjectName, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'DOCKER_PASS', usernameVariable: 'dockerHubUser')]) {
    sh "docker login -u ${dockerHubUser} -p ${DOCKER_PASS}
  }
    sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}
}
