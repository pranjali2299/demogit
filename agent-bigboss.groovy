pipeline {  
  agent{
       node ('agent-bigboss')
  }
    stages{
      stage('git-pull')
        steps { 
          echo 'git pull from the git repository'
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
