![assignments badge](https://github.com/fresh-minds/kotlin-foundation-assignments/actions/workflows/build-main.yml/badge.svg)
![solutions badge](https://github.com/fresh-minds/kotlin-foundation-assignments/actions/workflows/build-and-test-solutions.yml/badge.svg)

# Kotlin Foundation Assignments

This repository contains the assignments for the Kotlin Foundation training.

## Project structure

Assignments are split up across modules. Each module corresponds to a theoretical module we'll cover during the
training.
The higher the module number, the more prerequisite knowledge is required to effectively solve the assignments.

The assignments are just Kotlin files. They can be found under `src/main`. For most assignments a test file is
available under `src/test`. After solving an assignment you can run the tests to validate your solution.

Solutions for every assignment can be found in the `solutions` branch. Since there usually are multiple ways to solve
an assignment it's a good idea to compare your own solutions against the `solutions` branch.

## Before coming to the training

To ensure we can hit the ground running come training day, please follow these steps before coming to the training.

1. Download and install a recent version of [IntelliJ](https://www.jetbrains.com/idea/).
2. [Fork this repository](https://docs.github.com/en/get-started/quickstart/fork-a-repo#forking-a-repository) (optional
   but recommended).
3. [Clone your forked repository](https://docs.github.com/en/get-started/quickstart/fork-a-repo#cloning-your-forked-repository)

### Troubleshooting

TODO: Try cloning this repo on a couple of machines and see what happens.

## Build and test

This project uses Gradle as build tool. There is no need to install Gradle manually as builds are executed via the
[Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html). The wrapper script invokes a declared
version of Gradle, downloading it beforehand if necessary.

### Building

Gradle's `build` command builds and tests the project:

```
./gradlew build
```

Running `build` on the `main` branch will result in test errors. This is expected. The tests won't pass until the
assignments are finished. To make the build pass, simply exclude the tests:

```
./gradlew build -x test
```

### Testing
Starting tests directly from the IDE (using the 'play' buttons) is the most convenient. But you can also use the
wrapper if you want.

Run all tests in all modules:

```
./gradlew test
```

Run all tests in a single module:

```
./gradlew :module-01:test
```

Run a single test file:

```
./gradlew :module-01:test --tests '*Assignment02Test'
```

## TODO

- [ ] Setup renovate/dependabot?
- [ ] Add requirements (java 11)
- [ ] Add license
