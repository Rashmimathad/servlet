<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Search</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        body {
    background-image: url('images/backgroundImage.jpg');
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center;
    backdrop-filter: blur(7px);
}
    </style>
</head>
<body>
<nav class="navbar navbar-dark navbar-expand-lg bg-dark border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 fw-semibold text-white" href="index">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav nav-pills ms-auto">
                <li class="nav-item"><a class="nav-link active text-dark  fw-semibold m-1  bg-body-tertiary" href="register">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-semibold m-1 bg-body-tertiary" href="search">Search</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-semibold m-1 bg-body-tertiary" href="searchByType">Search By Weapon Type</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 45rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Weapon Search</b></h3>
            <br>
            <form action="search" method="get">
                <div class="mb-3">
                    <label for="weaponName" class="form-label fs-5 fw-bold">Weapon Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="weaponName" name="weaponName" placeholder="Enter weapon name">
                </div>

                <div class="text-center mt-3">
                    <input class="btn btn-dark btn-lg px-5 fw-bolder" type="submit" name="submitType" value="Search" id="searchBtn">
                    <input class="btn btn-dark btn-lg px-5 m-2 fw-bolder" type="submit" name="submitType" value="Clear" id="clearBtn">
                </div>
                <br>
                <c:if test="${not empty errorMessage}">
                    <p class="text-danger text-center border border-danger fs-4 fw-semibold">${errorMessage}</p>
                </c:if>
                <c:if test="${dto!=null}">
                    <input class="btn btn-dark btn-lg px-5 m-2 fw-bolder" type="submit" name="submitType" value="Back" id="backBtn"/>
                        <div class="card p-3 ms-5 bg-body-secondary bg-opacity-50 border border-dark border-2 rounded" style="width: 35rem;">
                            <div class="card-body">
                                    <p class="text-success text-center  fs-3 fw-semibold">${successMessage}</p>
                                    <h6 class="card-title text-center fs-2 fw-bold">Weapon Details</h6>
                                    <p class="card-text">
                                    <p class="fs-5"><strong>Weapon ID:</strong> ${dto.weaponId}</p>
                                    <p class="fs-5"><strong>Weapon Name:</strong> ${dto.weaponName}</p>
                                    <p class="fs-5"><strong>Weapon Type:</strong> ${dto.weaponType}</p>
                                    <p class="fs-5"><strong>Serial Number:</strong> ${dto.serialNumber}</p>
                                    <p class="fs-5"><strong>Weapon Specification:</strong> ${dto.specification}<br></p>
                                    <p class="fs-5"><strong>Weapon Price:</strong> ${dto.price}</p>
                                <div class="text-center mt-3">
                                    <a href="index" class="btn btn-dark fs-5 gap-2 col-4 mx-auto">Go to Home</a>
                                    <a href="editProfile?weaponName=${dto.weaponName}" class="btn btn-dark fs-5 gap-2 col-4 mx-auto">Edit</a>
                                </div>
                                    </p>
                            </div>
                        </div>
                </c:if>
            </form>
        </div>
    </div>
</div>
</body>
</html>