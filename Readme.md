#create project using CLI

mvn archetype:generate "-DarchetypeGroupId=io.cucumber" "-DarchetypeArtifactId=cucumber-archetype" "-DarchetypeVersion=7.5.0" "-DgroupId=hellocucumber" "-DartifactId=hellocucumber" "-Dpackage=hellocucumber" "-Dversion=1.0.0-SNAPSHOT" "-DinteractiveMode=false"

mvn test

mvn clean

#issue: No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?
#solution: verify path of maven, must be pointing to JDK not JRE


