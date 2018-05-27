This application is an extension to (spring-boot-helloworld-login-validation) application

spring-boot-helloworld-login-validation
-----------------------------------------------------------------------------------------------
In this project we have created two JSP page for our hello world service.
1, hello.jsp
2, welcome.jsp

In HelloWorldController two methods are placed to handle the GET and POST
1, showLoginPage -- GET (Note that we don't have any @RequestParam since get dont have any 
parameter to be passed. If we still keep that then error is thrown)
2, handleLogin -- POST (UserName and Password is validated here, 
if UserName is Gaurav and Password is Saxena then it will successfully processed ahead.)


We have used MODEL in handleLogin to implement full SPRING MVC, 
this model is created in HelloWorldController and is passed to View welcome.jsp, where it is used. 


Following is the webservice to invoke
-------------------------------------
When we first hit below service then hello.jsp is opened up
http://localhost:8080/login

At hello.jsp when are prompted to enter UserName and Password and then hit SUBMIT button 
then in case of UserName is not Gaurav and Password is not Saxena then we are throwed back to  
"http://localhost:8080/login" and a error message is displayed.

If correct is UserName and Password  are enter then the FORM at hello.jsp will get processed which will
convert request into POST request and then at  HelloWorldController, 
method handleLogin will handle it and display the 
WELCOME message along with username passed earlier. 



Also this application has one test class, please refer that too !!


Reference Resource
------------------
Login Validation (Using Model)
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step08.md


spring-boot-todo-web-application
-------------------------------------------------------------------------------------------------------------
After successful login the application will as to click here to list all todos (Formattion is not done on final page)


Reference Resources
---------------------
Todo web application
--------------------
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step10.md
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step12.md


