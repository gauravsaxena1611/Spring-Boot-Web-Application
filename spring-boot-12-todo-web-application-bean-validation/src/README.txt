This application is an extension to (spring-boot-todo-web-application-spring-jsp-form-tag-library) application
In current application "spring-boot-todo-web-application-bean-validation" we will validate the BEAN,

Client side validation is not good so the validation must be at server side.
We can directly
1, Map BEAN to FORM at JSP page.
2, These BEANs can be validated at server end using java.

In this application we have used HEBERNATE VALIDATOR.
Dont't get confused with HIBERNATE VALIDATOR with HIBERNATE DB one, Both are very different

Till now we have used JSTL Liberaries at JSP page.
NOW, We will also use SPRING FRAMEWORK JSP FORM TAG LIBRARY for binding JSP forms with view.

We also used below dependency
<!-- Form Validation using Annotations -->  
	<dependency>
		<groupId>javax.validation</groupId>
		<artifactId>validation-api</artifactId>
		<version>1.1.0.Final</version>
	</dependency>


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
https://github.com/gauravsaxena1611/SpringBootWebApplicationStepByStep/blob/master/Step19.md


