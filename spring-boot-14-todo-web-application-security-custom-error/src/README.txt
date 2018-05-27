This application is an extension to (spring-boot-12-todo-web-application-jsp-fragments) application
In current application "spring-boot-13-todo-web-application-security" 

We will Use Spring Security

We can configure spring security by configuring one been


----------------
add dependency
----------------

		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>


------------------
Code Modifications
------------------
We have removed our own login functionality as we will handel it by SPRING SECURITY.

1, Remove All the Login Related Functionality
2, Make Welcome the default page - with some hardcoding to start with.
3, Refactor getLoggedInUserName
4, Update Home Page Link in navigation
5, Delete our login page --> spring security provides it's own login page
6, Removed session attribute @SessionAttributes("UserName")
because we are using name provided at spring security context




URLs Flow
--------------------
1, http://localhost:8080/ --> Enter gaurav & saxena
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
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step22.md
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step23.md

