pipeline{
agent any
stages{
  stage('Build'){
     steps{
      echo "Building the Code......."
      bat "mvn clear"
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
}

}