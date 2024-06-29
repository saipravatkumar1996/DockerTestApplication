pipeline{
agent any
 environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-11.0.12'
    }

stages{
  stage('Build'){
     steps{
      echo "Building the Code......."
      bat "mvn clean"
    }
  }
stage('Test'){
     steps{
      echo "Test the project......."
       bat "mvn test"
    }
  }
stage('Compile'){
     steps{
      echo "Test the project......."
       bat "mvn compile"
    }
  }
stage('Deploy'){
     steps{
      echo "deploy the project......."
     bat "mvn install"
    }
  }
  stage('Release'){
    steps{
      bat "docker build -f Dockerfile -t jenkisnappfile ."
    }
  }
}

}
