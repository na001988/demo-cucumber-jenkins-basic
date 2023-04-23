pipeline{
	agent any

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