pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Clean') {
            steps {
                // Get some code from a GitHub repository
                //git 'https://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@github.com/Enseignant69/helloJenkins.git'

                // Run Maven on a Unix agent.
                //sh "mvn clean"

                // To run Maven on a Windows agent, use
                //dir('Jenkins') {
                    bat "mvn clean"
                //}
                
            }
        }
        
        stage('Test') {
            steps {
                // To run Maven on a Windows agent, use
                //dir('Jenkins') {
                    bat "mvn test"
                //}
                
            }
        }
        stage('Install') {
            steps {
                // To run Maven on a Windows agent, use
                //dir('Jenkins') {
                    bat "mvn install"
                //}
                
            }
        }
    }
    
    post {
        always {  
             echo 'This will always run'  
         }  
         success {  
             echo 'This will run only if successful'  
         }  
         failure {  
            echo 'This will run only if failure'
         }  
         unstable {  
             echo 'This will run only if the run was marked as unstable'  
         }  
         changed {  
             echo 'This will run only if the state of the Pipeline has changed'  
             echo 'For example, if the Pipeline was previously failing but is now successful'  
         }  
    }
}
