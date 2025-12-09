<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User</title>
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
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="flipkartForm">Flipkart SignUp Form</a></li>
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="searchByContact">Search</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card text-bg-light mb-3 p-3" style="max-width: 540px;">
        <h5 class="card-title text-center"  style="color:red;">${errorMessage}</h5>
        <h5 class="card-title text-center"  style="color:green;">${successMessage}</h5>
        <div class="card-body">
            <h5 class="card-title text-center"><u>User Details</u></h5>
            <p class="card-text">
                <strong>Name : </strong>${dto.getFullName()}<br>
                <strong>Contact Number :</strong> ${dto.getContactNumber()}<br>
                <strong>Gender : </strong>${dto.getGender()}<br>
                <strong>Age :</strong> ${dto.getAge()}<br>
                <strong>Address : </strong>${dto.getAddress()}<br>
            </p>
            <a href="index" class="btn btn-primary w-100 mb-3 fw-semibold fs-6">Back to home</a>
        </div>
    </div>
</div>
</body>
</html>