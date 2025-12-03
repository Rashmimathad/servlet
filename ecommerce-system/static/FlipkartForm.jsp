<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>SignUp</title>
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
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card mb-3" style="max-width: 840px;">
        <div class="row g-0">
            <div class="col-md-4  bg-primary">
                <img src="images/icon.png" class="img-fluid mt-5" alt="signup">
            </div>
            <div class="col-md-8">
                <div class="card-body bg-body-tertiary">
                    <h2 class="card-title text-center">Sign Up</h2><br>
                    <form action="flipkartForm" method="post" onsubmit="return formValidation()">
                        <div class="mb-3">
                            <label for="name" class="form-label fw-bolder fs-5">Full Name</label>
                            <input type="text" class="form-control" id="name" onchange="nameValidation()" name="inputFullName" placeholder="enter your full name">
                            <span class="error" id="nameError"></span><br>
                        </div>
                        <div class="mb-3">
                            <label for="contact" class="form-label fw-bolder fs-5">Contact Number</label>
                            <input type="text" class="form-control" id="contact" name="inputContactNumber" placeholder="enter contact number">
                            <span class="error" id="contactError"></span><br>
                        </div>
                        <div class="mb-3">
                            <p class="form-label fw-bolder fs-5">Gender</p>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" value="Male" id="male">
                                <label class="form-check-label" for="male">
                                    Male
                                </label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" value="Female" id="female">
                                <label class="form-check-label" for="female">
                                    Female
                                </label>
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="age" class="form-label fw-bolder fs-5">Age</label>
                            <input type="number" class="form-control" id="age" name="inputAge" placeholder="enter your age">
                        </div>
                        <div class="mb-3">
                            <label for="address" class="form-label fw-bolder fs-5">Address</label>
                            <textarea class="form-control" id="address"  name="inputAddress" rows="3" placeholder="enter your address"></textarea>
                        </div>
                        <br>
                        <div class="text-center mt-3">
                            <button class="btn btn-primary btn-lg px-5 fw-bolder" type="submit" disabled>Sign Up</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>