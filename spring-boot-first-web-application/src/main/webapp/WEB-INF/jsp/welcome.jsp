<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">

	<div class="jumbotron">
	  <h1>Welcome ${UserName}</h1>      
	  <p>You have successfully logged-in !!!</p>
	</div>

	<p><a href="/list-todos"><span class="label label-primary">Click here</span>  </a> </p>
    <p>Inorder to manage your todo's.</p> 
         
</div>

<%@ include file="common/footer.jspf" %>