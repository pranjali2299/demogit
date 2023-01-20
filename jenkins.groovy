pipeline {
    agent any 
    stages {
        stage('git-pull') { 
            steps {
               git credentialsId: 'a7224201-f83c-4f3b-b4f6-53061054b227', url: 'git@github.com:pranjali2299/demogit.git'
            }
        }
    }
}
