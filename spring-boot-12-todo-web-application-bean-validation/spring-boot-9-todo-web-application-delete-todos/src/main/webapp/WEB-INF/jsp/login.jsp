<html>

<head>
<title>Yahoo!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script></head>

<body>

<div class="container">

	
	
	<form method="POST">
		<div class="form-group">
		  <label for="usr"> UserName : </label>
		  <input type="text" class="form-control" name="user">
		</div>
		<div class="form-group">
		  <label for="pwd">Password:</label>
		  <input type="password" class="form-control" name="pass">
		</div>
       	<button type="submit" class="btn btn-info">Submit</button>
	</form>
	
	<span class="label label-warning">${errorMessage}</span>
</div>	

</body>




</html>
