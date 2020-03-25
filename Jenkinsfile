pipeline {
	agent any

	stages('Build') {
		sh './gradlew build'
	}
	stages('Archive') {
		archiveArtifacts artifcats: '**/build/libs/*.jar', fingerprint: true
	}
}