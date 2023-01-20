pipeline {
    agent any 
    stages {
        stage('git-pull') { 
            steps {
               git credentialsId: 'node', url: 'https://github.com/pranjali2299/demogit.git'
            }
        }
    }
}
