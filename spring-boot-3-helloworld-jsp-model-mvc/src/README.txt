In this project we have created and used new JSP page for our hello world service.
In the project we have removed "@ResponseBody" from HelloWorldController so that controller can use view resolver

We have also used @RequestParam in HelloWorldController to show-case how to use pass parameter form URL.

We have used MODEL in this project to implement full SPRING MVC, 
this model is created in HelloWorldController and is passed to View hello.jsp, where it is used. 


Following is the webservice to invoke
-------------------------------------
http://localhost:8080/hello-service?name=gaurav


Also this application has one test class, please refer that too !!


Reference Resource
------------------
MVC (Used Model)
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step05.md
