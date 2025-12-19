<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Player Bid</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        .navbar-navy {
    background-color: #0b1c2d;
}
    </style>
</head>
<body class="bg-body-secondary">
<nav class="navbar navbar-expand-lg navbar-navy border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <img src="static/images/logo.png" alt="logo"  style="height: 45px; width:70px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav nav-pills ms-auto">
                <h3 class="card-title fs-3 p-2 text-right fw-semibold text-white  text-uppercase"><b>${companyName}</b></h3>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="registerPlayer">Register Player</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="bidding">Bidding</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <form action="playerBid?companyName=${companyName}" method="post">
        <div class="card" style="width: 40rem;">
            <img src="static/images/RegisterCard.avif" class="card-img-top" alt="registerCard" style="width: 40rem;height:12rem;">
            <div class="card-body">
                <h3 class="card-title fs-3 text-center fw-semibold text-dark text-uppercase"><b>Company Login</b></h3>
                <br>

                <div class="col-md-10 ps-5">
                    <label for="name" class="form-label fs-5 fw-bold">Player Name</label>
                    <input type="email" class="form-control" id="name" name="name" readonly="readonly" value="${playerName}">
                </div>
                <br>
                <div class="col-md-10 ps-5">
                    <label for="price" class="form-label fs-5 fw-bold">Price <small>(in millions)</small></label>
                    <input type="number" class="form-control" id="price" name="price" placeholder="Enter price">
                </div>
                <br>
                <button type="submit" class="btn btn-primary rounded mx-auto d-block fs-4 fw-semibold"  id="loginBtn">Login</button>

                <h3 class="card-title fs-3 text-center fw-semibold text-danger text-uppercase">${errorMsg}</h3>

            </div>
        </div>
    </form>
</div>

</body>
</html>
