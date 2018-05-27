In this project we have created two JSP page for our hello world service.
1, hello.jsp
2, welcome.jsp

In HelloWorldController two methods are placed to handle the GET and POST
1, showLoginPage -- GET (Note that we don't have any @RequestParam since get dont have any 
parameter to be passed. If we still keep that then error is thrown)
2, handleLogin -- POST


We have used MODEL in handleLogin to implement full SPRING MVC, 
this model is created in HelloWorldController and is passed to View welcome.jsp, where it is used. 


Following is the webservice to invoke
-------------------------------------
When we first hit below service then hello.jsp is opened up
http://localhost:8080/hello-service

At hello.jsp when we enter UserName and hit SUBMIT button then again 
"http://localhost:8080/hello-service" is envoked but FORM at hello.jsp will 
convert it into POST request and then at  HelloWorldController, 
method handleLogin will handle it and display the 
WELCOME message along with username passed earlier. 



Also this application has one test class, please refer that too !!


Reference Resource
------------------
FORMS (Using Model)
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step07.md
