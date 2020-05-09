# WebApplication

This is my first project that deals with spring boot and a web application. I was able to learn MVC(Model View Controller)
this process. Through this Web application we were able to use the crud operations in a database.




In this java program we are trying to make a web application api using MVC (Model , View , Controller) pattern. Components like a model, service, repo, and controller all help make a fully working web application api. The model helps the web to interact with the database’s name and columns. In the repo, there are the methods that all can serve to either create, insert, update, or delete the data. Once created, the service acts as a middle layer in order to connect the repo to the main controller. Finally in the controller, you can call these methods which run the correct operation. Also, in the controller, there are certain annotations that are needed in order to run the code and view the data from different platforms. Now, once compiled and ran, the data in the database can be manipulated through any platform.

Test Cases;

1. Inserting new data to DB

curl -X POST -H "Content-Type: application/json" http://localhost:8080/saveperson -d 
"{\"id\":1,\"firstName\":\"john123\",\"lastName\":\"bon\",\"dob\":\"2004-09-19\",\"gender\":\"m\"}"

Output:
{"id":121,"firstName":"john123","lastName":"bon","dob":"2004-09-18","gender":"m"}

 curl -X POST -H "Content-Type: application/json" http://localhost:8080/saveperson -d 
"{\"id\":2,\"firstName\":\"john12\",\"lastName\":\"bon\",\"dob\":\"2004-09-19\",\"gender\":\"m\"}"

Output:
{"id":122,"firstName":"john12","lastName":"bon","dob":"2004-09-18","gender":"m"}


2. Select from DB for specific ID

curl http://localhost:8080/getperson/122

Output:
{"id":122,"firstName":"john12","lastName":"bon","dob":"2004-09-18","gender":"m"}


3. Delete from DB for specific ID

curl -X DELETE  http://localhost:8080/deleteperson/122

Output:[] or blank



4. Selecting all from the DB

curl http://localhost:8080/persons

Output:
[{"id":120,"firstName":"John2","lastName":"Doe","dob":"2002-11-18","gender":"m"},{"id":121,"firstName":"john123","lastName":"bon","dob":"2004-09-18","gender":"m"}]

