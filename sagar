pipeline {  
  agent{
       label 'cloud'
  }
    stages{
      stage('git-pull') {
        steps { 
          git credentialsId: 'node', url: 'https://github.com/pranjali2299/demogit.git'
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
