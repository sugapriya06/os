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

