pipeline{
	agent any

	stages{
		stage("mvn package"){
             steps{
                def mvnCMD = "/usr/bin/mvn"
                sh '''
                ${mvnCMD} clean package
                '''
             }
		}
    }
}