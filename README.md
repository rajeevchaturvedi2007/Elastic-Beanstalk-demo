# Elastic-Beanstalk-demo
This project using Spring Boot and My SQL database and deploy the JAR file in the AWS Elastic Beanstalk

## Key Points:
VERY IMPORTNAT: Must add  **SERVER>PORT=5000** in the **application.property** file of the Spring Boot, otherwise get **502 Bad Gateway** error. 
From command prompt used the - **mvn clan package** command and create the JAr file of the project
Go to AWS Elastic Beanstalk console - https://eu-west-2.console.aws.amazon.com/elasticbeanstalk/home?region=eu-west-2#/applications
Create the Application and Environment using Java 8
From AWS Elastic Beanstalk Console , upload the JAR file, After upload configure the environment - choose RDS for database 
From the AWS Elastic Beanstalk Console, create the RDS (database)and set user name and password of the database -choosing MySQL
Once the Green tick seen, go to Configuration -->RDS and then --:Security Group -->Inbound Rule -->Edit . Add a new Rule
Add New rule as : **'All Traffic' ---> 0.0.0.0/0**(automatically added zero values). This will allow to access your database from **anywhere**.

# Test the Database connection


