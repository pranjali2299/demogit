pipeline {  
  agent{
       label 'ecs-node'
  }
    stages{
      stage('git-pull') {
        steps { 
          git credentialsId: 'a67a9ad3-642b-4bbe-9b64-869824e33f0a', url: 'https://github.com/pranjali2299/demogit.git'
          echo 'Hello'
        }
    }
    stage('Build') { 
      steps {
          echo 'git build successfully'
      }
    }
    stage('Test') { 
      steps {
           echo 'git test'
      }
    }
       stage('Deploy') { 
        steps {
         echo 'git deploy'
       } 
     } 
   }
}
