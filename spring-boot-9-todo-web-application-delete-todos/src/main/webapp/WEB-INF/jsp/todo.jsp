<html>

<head>
<title>First Web Application</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">

<div class="alert alert-info">
  Add todo page for ${UserName} !!!
</div>

<form method="POST">
        
        <div class="form-group">
		  <label> Description : </label>
		  <input type="text" class="form-control" name="description">
		</div>
		<button type="submit" class="btn btn-info">Submit</button>
</form>
</div>
</body>

</html>
