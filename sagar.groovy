pipeline {  
  agent{
       node ('agent-bigboss')
  }
    stages{
      stage('git-pull')
        steps { 
          git credentialsId: 'e247ea7b-e6b8-4aff-90ea-38e5566b78c0', url: 'git@github.com:pranjali2299/demogit.git'
          sh echo Hello
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
       stage('Deploy') { 
      steps {
           echo 'git deploy'
       } 
     } 
   }
}
