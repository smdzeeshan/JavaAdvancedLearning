<!DOCTYPE html>
<html lang="en">
<br>
<head>
  <title>Addition Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <form action="add" method="post">
    <div class="form-group">
      <label for="1st">Enter 1st number</label>
      <input type="number" class="form-control" id="1st" placeholder="Enter 1st number" name="1st">
    </div>
    <div class="form-group">
      <label for="2nd">Enter 2nd number</label>
      <input type="number" class="form-control" id="2nd" placeholder="Enter 2nd number" name="2nd">
    </div>
    
   <button type="submit" class="btn btn-primary btn-block mb-4">Add</button> <br><br><br>
  </form>
</div>

</body>
</html>
