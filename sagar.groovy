pipeline {  
  agent{
       label 'ecs-node'
  }
    stages{
      stage('git-pull') {
        steps { 
          git credentialsId: '71cc78d0-77eb-47ac-978a-f5f40124b213', url: 'https://github.com/pranjali2299/demogit.git'
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
