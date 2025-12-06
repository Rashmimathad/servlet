<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary sticky-sm-top" style="height: 60px;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 fw-bold text-white" href="index">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active fs-4 fw-bold" href="flipkartForm">Flipkart SignUp Form</a></li>
                <li class="nav-item"><a class="nav-link active fs-4 fw-bold" href="searchByContact">Search</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="position-fixed top-0 start-0 w-100 h-100">
    <img src="images/backgroundImage.jpeg"
         class="bg-image img-fluid opacity-25 w-100 h-100" style="object-fit: cover;" alt="background">
    <div class="position-absolute top-0 start-0 w-100 h-100"></div>
</div>

<div class="position-relative container text-center mt-5 mx-auto p-2">

    <h1 class="mb-4 text-primary">Available Forms</h1>
    <p class="lead text-primary fw-bold">Choose a form below to continue:</p>

    <div class="row justify-content-center mt-4">
        <div class="col-md-5">
            <a href="flipkartForm" class="btn btn-primary w-100 mb-3 fw-semibold fs-4">Flipkart SignUp Form</a>
        </div>
    </div>
</div>
</body>
</html>