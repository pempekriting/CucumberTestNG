# Project Automation Web

Hi! This is a project automation web with study case [Automation Practice](http://automationpractice.com/index.php) using Maven, Cucumber, TestNG, and Selenium

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Intermezzo

**TestNG** is a testing framework inspired from JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use, such as:

* Annotations.
( Run your tests in arbitrarily big thread pools with various policies available (all methods in their own thread, one thread per test class, etc...).
( Test that your code is multithread safe.
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

- [Java Development Kit](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
- [Java Runtime Engine](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
- [Maven](https://maven.apache.org/install.html)
- [Docker](https://docs.docker.com/desktop/)
- [Docker Compose](https://docs.docker.com/compose/install/)
- [Selenoid](https://aerokube.com/selenoid/latest/)
- [Selenium Grid](https://github.com/SeleniumHQ/docker-selenium/tree/selenium-3)
- [Jenkins](https://www.jenkins.io/download/)

## How to Run the Project
* ### Running on Selenoid
	
	1. Install the Selenoid first on your Docker
	2. Open the project using any IDE (Eclipse, IDEA, etc)
    3. Download sources Maven and update the project
	4. Each machine that has Selenoid installed has a different port, you can change it in the `regression.xml` file
	5. Running the project using command `mvn test`
	
* ### Running on Selenium Grid
    
    1. Install the Docker Compose first on your machine
    2. Enter to the project using your terminal and run the command `docker-compose -f docker-compose.yml up`
    3. Wait until the Selenium Grid finished installing
    4. Open the project using any IDE (Eclipse, IDEA, etc)
    5. Download sources Maven and update the project
	6. Each machine that has Selenium Grid installed has a different port, you can change it in the `regression.xml` file
	7. Running the project using command `mvn test`

* ### Running on Jenkins
	1. Install the Jenkins first on your machine
	2. Make sure Selenoid or Selenium Gird on Docker is running
	3. Don't forget to setup your JDK and Maven inside your Jenkins
	4. Create Freestyle project on Jenkins
	5. Go to tab build and choose `Invoke top-level Maven targets`
	6. At the Goals field enter the value `test -PRegression`
	7. Click on the button Advanced
	8. At the POM field, enter the path of `pom-jenkins.xml`
	9. Click button save
	10. Click on the Build Now button
