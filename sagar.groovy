pipeline {  
  agent{
       label 'ecs-node'
  }
    stages{
      stage('git-pull') {
        steps { 
          git credentialsId: '4711255b-4730-4250-b972-e1590ede61ce', url: 'git@github.com:pranjali2299/demogit.git'
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
