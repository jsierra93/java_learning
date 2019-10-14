# JAVA LEARNING
This repository is used for learning of languaje Java

# Automatización de pruebas con Serenity
    
# Preparación del proyecto Compilación y dependencias

1. Instalar gradle en local o crear el wrapper desde el proyecto con el comando.
    gradlew wrapper

   para actualizar la versión del wrapper

   gradlew wrapper --gradle-version=5.6.2 --distribution-type=bin

2. Agregar el plugin de serenity
cambiar como se implementa el plugin de java a la siguiente forma:

    apply plugin: 'java'

Luego importar el plugin de serenity
apply plugin: 'net.serenity-bdd.aggregator'

buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:1.1.1")
    }
}

3. Le decimos a gradle que compile los test con el core de serenity y Junit

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
    testCompile 'net.serenity-bdd:serenity-core:1.1.1'
    testCompile 'net.serenity-bdd:serenity-junit:1.1.1'
    testCompile('org.assertj:assertj-core:1.7.0')
    testCompile('org.slf4j:slf4j-simple:1.7.7')
}