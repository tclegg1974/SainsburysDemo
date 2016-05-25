# SainsburysDemo
Demo parsing html application

# Building
The application is built using maven version 3.3.9.
Use the following command to build the application.

mvn clean install 

# IDE
The application was built using eclipse MARS edition and the Spring Tool Suite plugin. The STS plugin allows Spring Boot applications to be run from within the IDE. Without the STS plugin the application will need to be built from the command line.

# Testing
The application unit tests can be run using maven.
Use the following command to run the unit tests

mvn test

# Running
To run the application type the following command

java -jar target/demo-0.0.1-SNAPSHOT.jar

Now open a web browser and navigate to.

http://localhost:8080/results

The following results should be shown

{"results":[{"title":"Sainsbury's Apricot Ripe & Ready x5","size":"39.185kb","unit_price":3.5,"description":null},{"title":"Sainsbury's Avocado Ripe & Ready XL Loose 300g","size":"39.597kb","unit_price":1.5,"description":null},{"title":"Sainsbury's Avocado, Ripe & Ready x2","size":"44.479kb","unit_price":1.8,"description":null},{"title":"Sainsbury's Avocados, Ripe & Ready x4","size":"39.61kb","unit_price":3.2,"description":null},{"title":"Sainsbury's Conference Pears, Ripe & Ready x4 (minimum)","size":"39.465kb","unit_price":1.5,"description":null},{"title":"Sainsbury's Golden Kiwi x4","size":"39.485kb","unit_price":1.8,"description":null},{"title":"Sainsbury's Kiwi Fruit, Ripe & Ready x4","size":"39.911kb","unit_price":1.8,"description":null}],"total":15.100000000000001}

# Known issues

I was unsure which description field to use as I could not find anything matching your example so I have left this blank.
The html sizes are approximations and do not really take content into account but this maybe a limitation with java.
