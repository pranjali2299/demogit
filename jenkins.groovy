pipeline {
    agent any 
    stages {
        stage('git-pull') { 
            steps {
               git credentialsId: 'demo', url: 'git@github.com:pranjali2299/demogit.git'
            }
        }
    }
}
