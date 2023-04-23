pipeline{
	agent any
		stages{
    		stage("get code"){
                 steps{
                    url: 'https://github.com/na001988/demo-cucumber-jenkins-basic.git', branch: 'main'
                 }
    		}
        }
	stages{
		stage("mvn package"){
             steps{
                def mvnHome = tool name: 'maven', type: 'maven'
                def mvnCMD = "${mvnHome}/bin/mvn"
                sh '''
                ${mvnCMD} clean package
                '''
             }
		}
    }
}