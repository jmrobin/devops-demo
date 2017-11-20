node {
    stage 'prepare'
    git url: 'git@github.com:jmrobin/devops-demo.git', branch: 'develop'

    stage 'build'
    sh 'mvn clean package'

    stage 'unit test'
    junit '**/target/surefire-reports/TEST-*.xml'

    stage 'archivage'
    archiveArtifacts 'target/*.?ar'

    stage 'integration test'
    sh 'mvn clean verify'

    stage 'sonar'
    sh 'mvn sonar:sonar'

    stage 'deploy'
    sh 'mvn deploy'
}
