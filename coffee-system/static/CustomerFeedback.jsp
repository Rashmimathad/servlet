<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer Feedback</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<div class='card'>
    <nav class="navbar navbar-expand-lg bg-danger p-2 text-dark bg-opacity-75">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp">Coffee</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="Coffee.jsp">Coffee Form</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CoffeeLand.jsp">Coffee Land</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Cafeteria.jsp">Cafeteria</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Customer.jsp">Customer</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CustomerFeedback.jsp">Customer Feedback</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="card-header bg-danger bg-gradient p-2 text-dark bg-opacity-50 ">
        <h5 class="text-danger text-center"><b>CUSTOMER FEEDBACK FORM</b></h5>
    </div>
    <div class="card-body bg-danger bg-gradient p-2 text-dark bg-opacity-25 ">
        <form class="row g-3 col-6" action="customerFeedback" method="post">
            <div class="mb-3">
                <label for="inputName" class="form-label"><b>Name :</b></label>
                <input type="text" class="form-control" id="inputName" name="inputName" placeholder="enter name">
            </div>
            <div class="mb-3">
                <label for="inputEmail" class="form-label"><b>Email :</b></label>
                <input type="email" class="form-control" id="inputEmail" name="inputEmail" placeholder="enter email">
            </div>
            <div class="mb-3">
                <label for="inputComments" class="form-label"><b>Comments : </b></label>
                <textarea name="inputComments" id="inputComments" cols="60" rows="3"></textarea>
            </div>
            <div class="mb-3">
                <label for="inputRating" class="form-label"><b>Rating <small>(out of 5)</small> :</b></label>
                <input type="text" class="form-control" id="inputRating" name="inputRating" placeholder="enter rating">
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-primary bg-danger bg-gradient p-2 text-dark bg-opacity-75 border-danger"><b>SUBMIT</b></button>
            </div>
        </form>
    </div>
    <div class="card-footer bg-danger bg-gradient p-2 text-danger bg-opacity-50 text-center">
        <b> CustomerFeedback@Coffee.in</b>
    </div>
</div>
</body>
</html>
