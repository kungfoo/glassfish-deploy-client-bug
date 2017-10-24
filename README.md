# Reproduces a bug in the dependencies of glassfish-nucleus

## Problem

The version of hk2 `2.5.0-b44` does not exist anywhere I dared to look. There is `2.5.0-b43` and `2.5.0-b45`, but no `b44`.

This version of the dependency was introduced here: https://github.com/javaee/glassfish/pull/22090

## How to reproduce

### TL:DR;

    ./gradlew build cargoDeployRemote

This fails to resolve the dependency of the glassfish-deploy-client (actually glassfish-nucleus).

### More elaborate

- Clone this project
- run `./gradlew tasks`
- you should see the normal tasks of a web application
- run `./gradlew build`
- you have a `war` you can deploy in glassfish
- run `./gradlew cargoDeployRemote`
- observe


