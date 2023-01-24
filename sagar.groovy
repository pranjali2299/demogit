pipeline {  
  agent any
    stages{
      stage('git-pull') {
        steps { 
         git credentialsId: '4857def3-322b-4fec-957b-1ae64dc76559', url: 'git@github.com:pranjali2299/demogit.git'
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
