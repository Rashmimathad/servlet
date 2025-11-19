<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Coffee Land</title>
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
    <div class="card-header bg-danger bg-gradient p-2 text-dark bg-opacity-50">
        <h5 class="text-danger text-center"><b>COFFEE LAND FORM</b></h5>
    </div>
    <div class="card-body bg-danger bg-gradient p-2 text-dark bg-opacity-25 ">
        <form class="row g-4 col-6" action="coffeeLand" method="post">
            <div class="mb-3">
                <label for="inputSizeByAcre" class="form-label"><b>Size <small> (by Acre)</small>:</b></label>
                <input type="number" class="form-control" id="inputSizeByAcre" name="inputSizeByAcre" placeholder="enter size ">
            </div>
            <div class="mb-3">
                <label for="inputTotalPlants" class="form-label"><b>Total Plants : </b></label>
                <input type="number" class="form-control" id="inputTotalPlants" name="inputTotalPlants" placeholder="enter total plants ">
            </div>
            <div class="mb-3">
                <label for="inputTotalYield" class="form-label"><b>Total Yeild  <small> (in Kg)</small> : </b></label>
                <input type="number" class="form-control" id="inputTotalYield" name="inputTotalYield" placeholder="enter total yield">
            </div>
            <div class="mb-3">
                <label for="inputExpenditure" class="form-label"><b> Expenditure : </b></label>
                <input type="number" class="form-control" id="inputExpenditure" name="inputExpenditure" placeholder="enter expenditure">
            </div>
            <div class="mb-3">
                <label for="inputProfitMade" class="form-label"><b> Profit Made : </b></label>
                <input type="number" class="form-control" id="inputProfitMade" name="inputProfitMade" placeholder="enter profit made">
            </div>
            <div class="mb-3">
                <label for="inputFertilizerQuantityUsed" class="form-label"><b>Fertilizer Quantity Used  <small> (in Kg)</small> : </b></label>
                <input type="number" class="form-control" id="inputFertilizerQuantityUsed" name="inputFertilizerQuantityUsed" placeholder="enter fertilizer quantity">
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-primary bg-danger bg-gradient p-2 text-dark bg-opacity-75 border-danger"><b>SUBMIT</b></button>
            </div>
        </form>
    </div>
    <div class="card-footer bg-danger bg-gradient p-2 text-danger bg-opacity-50 text-center">
        <b> CoffeeLand@Coffee.in</b>
    </div>
</div>
</body>
</html>
