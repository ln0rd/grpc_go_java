# GRPC_GO_JAVA Project

## Introduction

This project has been created with the purpose to create a communication with 2 system with distintcs languages Golang and Java;

## Requeriments

- Java 11
- Golang 1.15.6
- Gradle 6.7.1

## Setup

### Generating Go proto files
```
make gen
```

### Cleaning Go proto files
```
make clean
```

### Generating Java proto files
```
./gradlew build
```

### Cleaning Java proto files
```
./gradlew clean
```
