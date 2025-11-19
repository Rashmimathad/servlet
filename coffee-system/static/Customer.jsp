<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Customer</title>
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
        <h5 class="text-danger text-center"><b>CUSTOMER FORM</b></h5>
    </div>
    <div class="card-body bg-danger bg-gradient p-2 text-dark bg-opacity-25 ">
        <form class="row g-3 col-6" action="customer" method="post">
            <div class="mb-3">
                <label for="inputName" class="form-label"><b>Name :</b></label>
                <input type="text" class="form-control" id="inputName" name="inputName" placeholder="enter name">
            </div>
            <div class="mb-3">
                <label for="inputMobileNo" class="form-label"><b>Mobile Number :</b></label>
                <input type="number" class="form-control" id="inputMobileNo" name="inputMobileNo" placeholder="enter mobile number">
            </div>
            <div class="mb-3">
                <label for="inputCoffeeFlavour" class="form-label"><b> Coffee Flavour :</b> </label>
                <select id="inputCoffeeFlavour" class="form-select" name="inputCoffeeFlavour" required>
                    <option selected>--select type--</option>
                    <option value="Vanilla"> Vanilla</option>
                    <option value="Caramel"> Caramel</option>
                    <option value="Hazelnut"> Hazelnut </option>
                    <option value="Mocha"> Mocha</option>
                    <option value="Chocolate"> Chocolate </option>
                    <option value="Irish Cream"> Irish Cream </option>
                    <option value="Butterscotch"> Butterscotch </option>
                    <option value="Cinnamon"> Cinnamon </option>
                    <option value="Almond">Almond</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="inputQuantity" class="form-label"><b>Quantity : </b></label>
                <input type="number" class="form-control" id="inputQuantity" name="inputQuantity" placeholder="enter quantity">
            </div>
            <div class="mb-3">
                <label for="inputPaymentMode" class="form-label"><b>Payment Mode : </b></label>
                <select id="inputPaymentMode" class="form-select" name="inputPaymentMode" required>
                    <option selected>--select type--</option>
                    <option value="COD"> Cash On Delivery</option>
                    <option value="UPI"> UPI ID</option>
                    <option value="Credit Card/Debit Card"> Credit Card/Debit Card </option>
                </select>
            </div>

            <div class="col-12">
                <button type="submit" class="btn btn-primary bg-danger bg-gradient p-2 text-dark bg-opacity-75 border-danger"><b>SUBMIT</b></button>
            </div>
        </form>
    </div>
    <div class="card-footer bg-danger bg-gradient p-2 text-danger bg-opacity-50 text-center">
        <b> Customer@Coffee.in</b>
    </div>
</div>
</body>
</html>