# Elastic-Beanstalk-demo
This project using Spring Boot and My SQL database and deploy the JAR file in the AWS Elastic Beanstalk

## Key Points:
1) VERY IMPORTNAT: Must add  **SERVER.PORT=5000** in the **application.property** file of the Spring Boot, otherwise get **502 Bad Gateway** error. 
2) From command prompt used the - **mvn clan package** command and create the JAr file of the project
3) Go to AWS Elastic Beanstalk console - https://eu-west-2.console.aws.amazon.com/elasticbeanstalk/home?region=eu-west-2#/applications
4) Create the Application and Environment using Java 8
5) From AWS Elastic Beanstalk Console , upload the JAR file, After upload configure the environment - choose RDS for database 
6) From the AWS Elastic Beanstalk Console, create the RDS (database)and set user name and password of the database -choosing MySQL
7) Once the Green tick seen, go to Configuration -->RDS and then --:Security Group -->Inbound Rule -->Edit . Add a new Rule
Add New rule as : **'All Traffic' ---> 0.0.0.0/0**(automatically added zero values). This will allow to access your database from **anywhere**.
8) In your **application.properties** file add the details of the RDS database such as Host, user name , password etc. and then packaged in JAR file. **Mush have SERVER.PORT=5000** in the property file.
9) Now you will received request on the **PORT 5000, not on the PORT 8080**. This is must for AWS Elastic Beanstalk


# Test the Database connection
1) Copy the **Endpoint, userName, password** details from the Configuration-->RDS from Elastic Beanstalk Console.  
2) Open the MYSQL-SQLyog and ceate a New Connection.
3) In place of HOST , put the above copy **EndPoint and userName, Password** . Port will remeain **3306**. **Make sure there is no white space when pasting Endpoint**
4) Now, Test The Connection
5) If successful, it means you are connected with AWS RDS database. 
6) Now copy paste your database from any existing and paste into newly created 
7) Now modify the appliaction.properties and do the needful database interaction

# Sample **application.properties** File

**server.port=5000**   
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://aa1librljrh4vh2.cr4epiajkjcu.eu-west-2.rds.amazonaws.com:3306/users_database?useSSL=false
spring.datasource.username = masterUser
spring.datasource.password = masterPassword
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update

## Important Notes
A) No need to give port number in the API endpoint URL
    Example : http://domain1.eu-west-2.elasticbeanstalk.com/api/v1/users   (working URL, No Port Number)
B) No need to set any environmnt Property in the AWS Elastic BeanSole --> Application-->Software
C) Just for info - Your JAR file Application deploy in the EC2 instance and which has a Security Group and which has Inbound Rule
D) Probably the EC2 instance belongs to AWS Elastic Beanstalk start with - 'awsesb...

## To re-used existig project
---------------------------------
1) Go to AWS Elastic Beanstalk console - https://eu-west-2.console.aws.amazon.com/elasticbeanstalk/home?region=eu-west-2#/applications
2) Create Application, upload JAR, create RDS using **Configuration-->RDS**, add new rule in the inbound as 'AnyWhere' the test connection by MYSQLyog, create the database, create the table, update application.prperties with database details.
3) Test the application end points.
 
# Key Git Commands:
-------------- Git Commands -------------------------------

1. git clone cloneURL
2. git add –all
3. git commit -m “Initial Message"
4. git push -u origin master
5. git status

## Move from one Branch (feature) to master or vice versa
git fetch && git checkout branchName
Example: git checkout master ( Suppose you are in feature branch currently and want to move in master

## Merge branches:
a. git merge master feature_1234 ( merging feature with master)
b. git push -u origin master

