<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Coffee Land Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class='bg-light d-flex justify-content-center align-items-center vh-100'>

<div class='card mb-5 shadow text-center bg-danger bg-gradient p-2 text-dark bg-opacity-25' style='max-width: 640px;'>
    <div class='row g-0'>
        <div class='col-md-4 d-flex align-items-center justify-content-center'>
            <img src='images/logo.webp' class='img-fluid rounded-start' alt='Order Completed' style='height: 350px width: 300px;'>
        </div>
        <div class='col-md-8'>
            <div class='card-body'>
                <h4 class='card-title text-success'><b>CoffeeLand Form Submitted Successfully!!!</b></h4><br>
                <h5 class='card-text text-start ps-3'>
                    <strong>Size <small>(in acre)</small> : </strong> ${sizeInAcre}<br>
                    <strong>Total Plants : </strong> ${totalPants}<br>
                    <strong>Total Yield <small>(in Kg)</small> : </strong> ${totalYield}<br>
                    <strong>Expenditure : </strong> ${expenditure}<br>
                    <strong>Profit Made : </strong> ${profitMade}<br>
                    <strong>Fertilizer Quantity Used <small>(in Kg)</small> : </strong> ${fertilizerQuantityUsed}<br>
                </h5>
                <a href='CoffeeLand.jsp' class='btn btn-danger mt-5'>Submit Another Form</a>
            </div>
        </div>
    </div>
</div>

<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js'></script>
</body>
</html>