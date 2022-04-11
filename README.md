[![Automation Test Runner](https://github.com/pempekriting/CucumberTestNG/actions/workflows/main.yml/badge.svg?branch=master)](https://github.com/pempekriting/CucumberTestNG/actions/workflows/main.yml)

# Project Automation Web

Hi! This is a project automation web with study case [Sauce Labs](https://www.saucedemo.com/) using Maven, Cucumber, TestNG, and Selenium

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Intermezzo

**TestNG** is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use, such as:

* Annotations.
( Run your tests in arbitrarily big thread pools with various policies available (all methods in their own thread, one thread per test class, etc...).
( Test that your code is multithreading safe.
* Flexible test configuration.
* Support for data-driven testing (with @DataProvider).
* Support for parameters.
* Powerful execution model (no more TestSuite).
* Supported by a variety of tools and plug-ins (Eclipse, IDEA, Maven, etc...).
* Embeds BeanShell for further flexibility.
* Default JDK functions for runtime and logging (no dependencies).
* Dependent methods for application server testing.

TestNG is designed to cover all categories of tests:  unit, functional, end-to-end, integration, etc...

### Prerequisites

What things you need to install:

- [Java Development Kit 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 
- [Maven](https://maven.apache.org/install.html)
- [Docker](https://docs.docker.com/desktop/)
- [Docker Compose](https://docs.docker.com/compose/install/)
- [Selenium Grid](https://github.com/SeleniumHQ/docker-selenium/tree/selenium-3)

## How to Run the Project
* ### Running on Selenium Grid
    
    1. Install the Docker Compose first on your machine
    2. Enter to the project using your terminal and run the command `docker-compose -f docker-compose.yml up`
    3. Wait until the Selenium Grid finished installing
    4. Open the project using any IDE (Eclipse, IDEA, etc)
    5. Download sources Maven and update the project
    6. Running the project using command `mvn clean test -Drunning-on-hub=true`

* ### Running on local machine

  1. Open the project using any IDE (Eclipse, IDEA, etc)
  2. Download sources Maven and update the project
  3. Running the project using command `mvn clean test`

## Report

You can check the report [here](https://pempekriting.github.io/CucumberTestNG/report/cucumber-html-reports/overview-features.html)
