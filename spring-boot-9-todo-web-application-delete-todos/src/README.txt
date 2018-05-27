This application is an extension to (spring-boot-todo-web-application-bootstrap) application
In current application "spring-boot-todo-web-application-delete-todos" we added new functionality to delete created TODOs 

spring-boot-todo-web-application-bootstrap
-------------------------------------------------------------------------------------------------------------
Refer full Redme for this in previous project



URLs Flow
--------------------
1, http://localhost:8080/login  --> Enter gaurav & saxena
2, Below message will be displayed
Welcome gaurav, You have successfully entered!!! 
Click here to manage your todo's.
3, Click on "Click here"   -->  URL will be changed to http://localhost:8080/list-todos
TOODs for gaurav will be displayed here
4, you will find a hiperlink to add todo "Add a Todo", 
click on the same  -->  Url will be changed to http://localhost:8080/add-todo
5, Fill the entry of Description and hit submit.
6, We will be again REDIRECTED TO http://localhost:8080/list-todos
TOODs for gaurav will be displayed here
7, Click one delete from any row in table.
The same row will be deleted and We will be again REDIRECTED TO http://localhost:8080/list-todos




Reference Resources
---------------------
Todo web application with session
----------------------------------
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step15.md


