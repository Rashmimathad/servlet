<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"  content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register Response</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg opacity-100 bg-dark border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 fw-semibold text-white" href="index">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active text-white fs-3 fw-semibold" href="register">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-white fs-3 fw-semibold" href="#">Search</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-50 border border-dark border-2 rounded" style="width: 35rem; height: 52rem;">
        <img src="images/successImage.jpg" class="card-img-top p-5" alt="success">
        <h5 class="card-title text-center fs-3"  style="color:red;">${errorMessage}</h5>
        <h5 class="card-title text-center fs-3"  style="color:green;">${successMessage}</h5>
        <div class="card-body">
            <c:if test ="${dto!=null}">
            <h6 class="card-title text-center fs-2 fw-bold">Weapon Details</h6>
            <p class="card-text">
            <p class="fs-4"><strong>Weapon Name:</strong> ${dto.weaponName}</p>
            <p class="fs-4"><strong>Weapon Type:</strong> ${dto.weaponType}</p>
            <p class="fs-4"><strong>Serial Number:</strong> ${dto.serialNumber}</p>
            <p class="fs-4"><strong>Weapon Specification:</strong> ${dto.specification}<br></p>
            <p class="fs-4"><strong>Weapon Price:</strong> ${dto.price}</p>
            <a href="index" class="btn btn-dark fs-5 d-grid gap-2 col-4 mx-auto">Go to Home</a>
            </p>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>