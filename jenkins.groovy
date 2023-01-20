pipeline {
    agent {
            label 'ecs-node'
    }
    stages {
        stage('git-pull') { 
            steps {
               git credentialsId: '32898f20-e8d5-4a5b-9647-781fd9b000e1', url: 'https://github.com/pranjali2299/demogit.git'
            }
        }
    }
}
