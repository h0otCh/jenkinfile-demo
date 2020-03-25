pipeline {
	agent any

	stages {
		stage('Build') {
        	sh './gradlew build'
        }
        stage('Archive') {
        	archiveArtifacts artifcats: '**/build/libs/*.jar', fingerprint: true
        }
	}
}