# Test automation boilerplate

## How to build

In case when you don't have installed maven on your hardware please don't install anything, just use maven wrapper.

### Maven

To build whole project, install dependencies, run tests etc execute in command line from root directory:

    mvn clean test
    
### Maven wrapper

To build whole project, install dependencies, run tests etc execute in command line from root directory:

    ./mvnw clean test
    
## Reporting 

### With maven
    
To serve project report, execute following command in terminal from root directory after running previous command:

    mvn allure:serve 
    
To build project report, execute following command in terminal from root directory after running previous command:

    mvn allure:report 
    
## With maven wrapper

To serve project report, execute following command in terminal from root directory after running previous command:

    ./mvnw allure:serve 
    
To build project report, execute following command in terminal from root directory after running previous command:

    ./mvnw allure:report 