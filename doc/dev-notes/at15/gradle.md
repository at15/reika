# Gradle

- download `wget https://services.gradle.org/distributions/gradle-4.3-all.zip`
- extract to `~/app` as `~/app/gradle-4.3`
- edit `~/.env.jvm.sh`, I put it in a separated file instead of `~/.env.sh`

````sh
export GRADLE_HOME=/home/at15/app/gradle-4.3
export PATH=${GRADLE_HOME}/bin:${PATH}
````

- `gradle -v` should show the version number

The single project structure is just a single build.gradle

````
build.gradle
build
  libs
    tapl-0.0.1-SNAPSHOT.jar # got after run gradle build
````