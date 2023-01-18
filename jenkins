pipeline {
    agent any 
    stages {
        stage('git-pull') { 
            steps {
                git branch: '*/master', credentialsId: 'pranjali', url: 'git@github.com:pranjali2299/demogit.git'
            }
        }
    }
}
