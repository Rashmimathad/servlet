<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Update Profile</title>
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
                <li class="text-white p-2 fs-3 fw-bold">${name}</li>
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="flipkartForm">Flipkart SignUp Form</a></li>
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="searchByContact">Search</a></li>
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="searchByLocation">Search</a></li>
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
                    <h2 class="card-title text-center">Update your Profile</h2><br>
                    <form action="editProfile" method="post">
                        <div class="mb-3">
                            <label for="name" class="form-label fw-bolder fs-5">Full Name <span style="color:red;">*</span></label>
                            <input type="text" class="form-control" id="name" onchange="validateName();enableSubmit()" value="${editDetails.getFullName()}" name="inputFullName" placeholder="enter your full name">
                            <span class="error text-danger" id="nameError"></span><br>
                        </div>
                        <div class="mb-3">
                            <label for="contact" class="form-label fw-bolder fs-5">Contact Number <span style="color:red;">*</span></label>
                            <input type="text" class="form-control" id="contact" name="inputContactNumber" readonly="readonly" value="${editDetails.contactNumber}" onchange="validateContact();enableSubmit()" placeholder="enter contact number">
                            <span class="error text-danger" id="contactError"></span><br>
                        </div>
                        <div class="mb-3">
                            <p class="form-label fw-bolder fs-5">Gender <span style="color:red;">*</span></p>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" onclick="validateGender();enableSubmit()"  onkeydown="validateGender();enableSubmit()" name="gender"  value="Male" id="male" ${editDetails.gender == 'Male' ? 'checked' : '' }/>
                                <label class="form-check-label" for="male">
                                    Male
                                </label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" onclick="validateGender();enableSubmit()" onkeydown="validateGender();enableSubmit()" value="Female" id="female" ${editDetails.gender == 'Female' ? 'checked' : ''} />
                                <label class="form-check-label" for="female">
                                    Female
                                </label>
                            </div>
                            <span class="error text-danger" id="genderError"></span><br>
                        </div>
                        <div class="mb-3">
                            <label for="age" class="form-label fw-bolder fs-5">Age <span style="color:red;">*</span></label>
                            <input type="number" class="form-control" id="age" name="inputAge" value="${editDetails.age}" onchange="validateAge();enableSubmit()" placeholder="enter your age">
                            <span class="error text-danger" id="ageError"></span><br>
                        </div>
                        <div class="mb-3">
                            <label for="address" class="form-label fw-bolder fs-5">Address <span style="color:red;">*</span></label>
                            <textarea class="form-control" id="address"  name="inputAddress" rows="3"  onchange="validateAddress();enableSubmit()" placeholder="enter your address">${editDetails.address}</textarea>
                            <span class="error text-danger" id="addressError"></span><br>
                        </div>
                        <br>
                        <div class="text-center mt-3">
                            <button class="btn btn-primary btn-lg px-5 fw-bolder" type="submit" id="updateBtn"  disabled>Update</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="Update.js"></script>
</body>
</html>