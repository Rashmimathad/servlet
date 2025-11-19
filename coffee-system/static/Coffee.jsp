<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Coffee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<div class='card'>
    <nav class="navbar navbar-expand-lg bg-danger p-2 text-dark bg-opacity-75">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp">Home</a>
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
     <h5 class="text-danger text-center"><b>COFFEE FORM</b></h5>
    </div>
    <div class="card-body bg-danger bg-gradient p-2 text-dark bg-opacity-25 ">
        <form class="row g-4 col-6" action="coffee" method="post">
            <div class="mb-3">
                <label for="coffeeType" class="form-label"><b>Coffee Type :</b></label>
                <select id="coffeeType" class="form-select" name="coffeeType">-->
                    <option selected>--select coffee type--</option>
                    <option value="Arabica"> Arabica</option>
                    <option value="Robusta"> Robusta</option>
                    <option value="Liberica"> Liberica </option>
                    <option value="Excelsa"> Excelsa</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="inputPrice" class="form-label"><b>Price <small>(per Kg) </small> :</b></label>
                <input type="text" class="form-control" id="inputPrice" name="inputPrice" placeholder="enter price per Kg">
            </div>
            <div class="mb-3">
                <label for="inputQuantity" class="form-label"><b>Quantity <small>(in Kg) </small> : </b></label>
                <input type="number" class="form-control" id="inputQuantity" name="inputQuantity" placeholder="enter quantity">
            </div>
            <div class="mb-3">
                <label for="inputFarmerName" class="form-label"><b>Farmer Name : </b></label>
                <input type="text" class="form-control" id="inputFarmerName" name="inputFarmerName" placeholder="enter farmer name">
            </div>
            <div class="mb-3">
                <label for="inputLocation" class="form-label"><b>Location :</b> </label>
                <select id="inputLocation" class="form-select" name="inputLocation" required>
                    <option selected>--select location--</option>
                    <option value="Chikmagalur"> Chikmagalur</option>
                    <option value="Coorg"> Coorg</option>
                    <option value="Sakleshpur"> Sakleshpur </option>
                    <option value="Wayanad"> Wayanad</option>
                    <option value="Araku Valley"> Araku Valley </option>
                </select>
            </div>

            <div class="col-12">
                <button type="submit" class="btn btn-primary bg-danger bg-gradient p-2 text-dark bg-opacity-75 border-danger"><b>SUBMIT</b></button>
            </div>
        </form>
    </div>
    <div class="card-footer bg-danger bg-gradient p-2 text-danger bg-opacity-50 text-center">
      <b> @Coffee.in</b>
    </div>
    </div>
</body>
</html>