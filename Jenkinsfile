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
            mail bcc: '', body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "enseignant.formateur@protonmail.com";  
        }
    }
}
