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
                    bat "mvn -Dmaven.test.failure.ignore=true clean"
                //}
                
            }
        }
        
        stage('Test') {
            steps {
                // To run Maven on a Windows agent, use
                //dir('Jenkins') {
                    bat "mvn -Dmaven.test.failure.ignore=true test"
                //}
                
            }
        }
        stage('Install') {
            steps {
                // To run Maven on a Windows agent, use
                //dir('Jenkins') {
                    bat "mvn -Dmaven.test.failure.ignore=true install"
                //}
                
            }
        }
    }
    
    post {
        success {
        mail to: 'enseignant.formateur@protonmail.com', from: 'enseignant.formateur@protonmail.com',
                subject: "Example Build: ${env.JOB_NAME} - Failed", 
                body: "Job Failed - \"${env.JOB_NAME}\" build: ${env.BUILD_NUMBER}\n\nView the log at:\n ${env.BUILD_URL}\n\nBlue Ocean:\n${env.RUN_DISPLAY_URL}"    
        }
    }
}
