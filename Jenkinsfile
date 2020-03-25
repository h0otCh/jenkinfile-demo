pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				sh 'chmod + x gradlew'
        		sh './gradlew build'
			}
        }
        stage('Archive') {
        	steps {
        		archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
        	}
        }
	}
}