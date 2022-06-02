@Library("Peytonlib") _
pipeline {
    agent ('any')
    stages {
        stage('Example') {
            steps{
             helloWorld()   
            }
        }
    }
}