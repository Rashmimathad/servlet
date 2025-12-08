<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Search</title>
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
                <li class="nav-item"><a class="nav-link active fs-4 fw-bold" href="searchByContact">Search</a></li>
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
                    <h2 class="card-title text-center">Search</h2><br>
                    <form action="searchByContact" method="get">

                        <div class="mb-3">
                            <label for="contact" class="form-label fw-bolder fs-5">Contact Number <span style="color:red;">*</span></label>
                            <input type="text" class="form-control" id="contact" name="inputContactNumber" onchange="validateContact();enableSubmit()" placeholder="enter contact number">
                            <span class="error text-danger" id="contactError"></span><br>
                        </div>
                        <div class="text-center mt-3">
                            <input class="btn btn-primary btn-lg px-5 fw-bolder" type="submit" name="submitType" value="Search" id="searchBtn">
                            <input class="btn btn-primary btn-lg px-5 fw-bolder" type="submit" name="submitType" value="Clear" id="clearBtn">
                        </div>
                        <br>
                        <c:if test="${not empty errorMessage}">
                            <p class="text-danger text-center border border-danger fs-4 fw-semibold">${errorMessage}</p>
                        </c:if>
                        <c:if test="${dto!=null}">
                            <div class="card text-bg-light border-2 border-success mb-3 p-2">
                                <h5 class="card-title text-center fw-bolder"><u>User Details</u></h5>
                                <div class="card-body">
                                    <p class="card-text">
                                        <strong>Name : </strong>${dto.getFullName()}<br>
                                        <strong>Contact Number :</strong> ${dto.getContactNumber()}<br>
                                        <strong>Gender : </strong>${dto.getGender()}<br>
                                        <strong>Age :</strong> ${dto.getAge()}<br>
                                        <strong>Address : </strong>${dto.getAddress()}<br>
                                    </p>
                                    <a href="index" class="btn btn-primary w-50 mb-3 fw-semibold fs-6">Go to home</a>
                                    <a href="editProfile?contactNo=${dto.getContactNumber()}" class="btn btn-primary w-50 mb-3 fw-semibold fs-6">Edit</a>
                                </div>
                        </c:if>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>