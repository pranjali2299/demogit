pipeline {
    agent {
            label 'ecs-node'
    }
    stages {
        stage('git-pull') { 
            steps {
               git credentialsId: 'abaebc55-d7c5-4d0f-b457-269aa91f0cd5', url: 'https://github.com/pranjali2299/demogit.git'
            }
        }
    }
}
