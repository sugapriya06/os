# os
mvn exec:java -Dexec.mainClass="com.example.App"
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
cd my-app
git init
echo "target/">.gitignore
echo "idea/">>.gitignore
echo "*.iml/">>.gitignore
git add .
git remote add origin https://github.com/sugapriya06/os.git
git push -u origin master
git status
pipeline {     agent any     environment { 
        MAVEN_HOME = tool 'Maven'  
        SONARQUBE_SERVER = 'SonarQube'  
    }     stages {         stage('Checkout') {             steps { 
                git url: 'file:///path/to/your/local/repo' // Update this path 
            } 
        } 
 stage('Build') { 
            steps {                 script {                     try { 
                        sh "${MAVEN_HOME}/bin/mvn clean compile" 
                    } catch (Exception e) {                         error("Build failed: ${e.message}") 
                    } 
                } 
            } 
        } 
        stage('Unit Test') {             steps {                 script {                     try { 
                        sh "${MAVEN_HOME}/bin/mvn test" 
                    } catch (Exception e) {                         error("Tests failed: ${e.message}") 
                    } 
                }             }             post {                 always {                     junit 'pom.xml'  
                } 
            } 
        } 
        stage('Quality Gate') {             steps {                 script { 
                    withSonarQubeEnv(SONARQUBE_SERVER) { 
                        sh "${MAVEN_HOME}/bin/mvn sonar:sonar -Dsonar.login=YOUR_TOKEN"  
                    } 
                } 
            } 
        } 
        stage('Deploy') {             steps {                 script {                     try { 
                        echo "Deploying application locally..." 
                    } catch (Exception e) { 
                        error("Deployment failed: ${e.message}") 
                    } 
                } 
            } 
        }     }     post {         success { 
            echo 'Pipeline completed successfully!' 
        }         failure { 
            echo 'Pipeline failed!' 
        } 
    } 
}
package com.Ost;
import org.junit.Test;
import static junit. framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
public class AppTest { new*
@Test new*
public void testHelloWorldOutput() {
assertEquals(axpected: "Hello, World!", actual: "Hello, World!"); 
}
}
