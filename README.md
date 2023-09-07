![assignments badge](https://github.com/fresh-minds/kotlin-professional-development-assignments/actions/workflows/build-main.yml/badge.svg)
![solutions badge](https://github.com/fresh-minds/kotlin-professional-development-assignments/actions/workflows/build-and-test-solutions.yml/badge.svg)
![dependabot badge](https://badgen.net/github/dependabot/fresh-minds/kotlin-professional-development-assignments)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/fresh-minds/kotlin-professional-development-assignments/blob/main/LICENSE)

# Kotlin Professional Development

This repository is your go-to source for all assignments you'll be tackling throughout the training.

## Project structure

We've split the assignments into modules, each corresponding to a theoretical module we'll cover during the training.
As you progress through the modules, assignments become more challenging, so get ready to flex those Kotlin muscles!

You'll find the assignments as Kotlin files under `src/main`. To help you test your solutions, we've included tests
for most assignments under `src/test`. After completing an assignment, run the tests to validate your solution.

Feeling stuck? Don't worry, we've got your back. You can find solutions to every assignment in the `solutions` branch.
Keep in mind that there are often multiple ways to solve a problem, so it's a good idea to compare your solutions
with the ones we've provided.

## Before coming to the training

Want to hit the ground running on training day? Great! Here's what you need to do to make sure you're all set:

<details>
  <summary>Step 1: Install IntelliJ</summary>

You'll need to download and install a recent version of [IntelliJ](https://www.jetbrains.com/idea/). You are free to use
another IDE, but if you run into issues the trainer might not be able to support you.

</details>

<details>
  <summary>Step 2: Fork this project</summary>

We recommend that you [Fork](https://docs.github.com/en/get-started/quickstart/fork-a-repo#forking-a-repository) this
repository. This will give you your own copy of the codebase to which you can commit your solutions.

> **Note**
> By default GitHub only forks the `main` branch. If you want local access to the `solutions` branch, make sure
> to uncheck the "Copy the `main` branch only" checkbox during the forking process.

</details>

<details>
  <summary>Step 3: Clone your forked project</summary>

[Clone](https://docs.github.com/en/get-started/quickstart/fork-a-repo#cloning-your-forked-repository) your forked
repository.

</details>

<details>
  <summary>Step 4: Open the project in IntelliJ</summary>

Open the project in IntelliJ via `file -> open`. Opening the project for the first time might take a while.

If you run into reference resolving issues try refreshing Gradle via `Gradle -> Reload All Gradle Projects`.

</details>

## Build and test

We use Gradle as our trusty build tool. Don't worry about manually installing it!
The [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) takes care of everything for you.
It automatically invokes a declared version of Gradle, downloading it if necessary.

> **Note**
> This section was written with unix users in mind. Windows users should omit the `./` prefix and just write
> `gradlew <arguments>` instead of `./gradlew <arguments>`.

To build and test the project, simply run the following command:

```bash
./gradlew build
```

**However, there's a catch!** Running the build command on the `main` branch will result in test errors. Don't panic -
this is totally normal.
The tests won't pass until you've completed the assignments. To make the build pass, simply exclude the tests like this:

```bash
./gradlew build -x test
```

### Testing

Are you ready to put your solutions to the test?

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
