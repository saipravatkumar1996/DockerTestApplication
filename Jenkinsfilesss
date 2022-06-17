pipeline{
agent any
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
  
  stage('BuildImpage'){
     steps{
      /* This builds the actual image */

        app = docker.build("pravat199665/javaapp")
    }
  }
   stage('Test image') {
        steps{
		app.inside {
            echo "Tests passed"
        }
	}
        
    }
    stage('Push image') {
	    steps{
	 
        /* 
			You would need to first register with DockerHub before you can push images to your account
		*/
        docker.withRegistry('https://registry.hub.docker.com', 'docker_hub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
            } 
                echo "Trying to Push Docker Build to DockerHub"
		    
		       }
    }
}

}
