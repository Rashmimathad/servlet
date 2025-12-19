<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Bid Response</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        .navbar-navy {
    background-color: #0b1c2d;
}
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-navy border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <img src="static/images/logo.png" alt="logo"  style="height: 45px; width:70px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav nav-pills ms-auto">
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="registerPlayer">Register Player</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="bidding">Bidding</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 35rem; height: 12rem;">
        <div class="card-body text-center">
            <h3 class="card-title text-center text-success p-5 fs-2 fw-bold">${successMsg}</h3>
            <h3 class="card-title text-center text-danger p-5 fs-2 fw-bold">${errorMsg}</h3>
        </div>
    </div>
</div>
</body>
</html>
