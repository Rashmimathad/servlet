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
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 65rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Weapon Search</b></h3>
            <br>
            <form action="searchByType" method="get">
                <div class="col-md-9 ms-5 ps-5">
                    <label for="weaponType" class="form-label fs-5 fw-bold">Weapon Type <span class="text-danger">*</span></label>
                    <select id="weaponType" name="weaponType" class="form-select">
                        <option value="">Choose...</option>
                        <option value="Shotgun">Shotgun</option>
                        <option value="Rifle">Rifle</option>
                        <option value="Handgun">Handgun</option>
                        <option value="Carbine">Carbine</option>
                        <option value="Pistol">Pistol</option>
                        <option value="Revolver">Revolver</option>
                        <option value="SMG">SMG</option>
                        <option value="Sniper Rifle">Sniper Rifle</option>
                        <option value="Assault Rifle">Assault Rifle</option>
                    </select>
                </div>
                <br>
                <div class="text-center">
                    <input class="btn btn-dark btn-lg px-5 fw-bolder" type="submit" name="submitType" value="Search" id="searchBtn">
                    <input class="btn btn-dark btn-lg px-5 m-2 fw-bolder" type="submit" name="submitType" value="Clear" id="clearBtn">
                </div>
                <br>
                <c:if test="${not empty errorMessage}">
                    <p class="text-danger text-center border border-danger border-2 fs-3 fw-semibold col-md-10 ms-5 ps-5">${errorMessage}</p>
                </c:if>
                <c:if test="${not empty searchList}">
                    <table class="table table-bordered border-dark">
                        <thead class="table-dark text-center">
                            <tr>
                                <th scope="col">Weapon Id</th>
                                <th scope="col">Weapon Name</th>
                                <th scope="col">Weapon Type</th>
                                <th scope="col">Serial Number</th>
                                <th scope="col">Specifications</th>
                                <th scope="col">Price</th>
                                <th scope="col">Edit</th>
                                <th scope="col">Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                                <c:forEach var="weapon" items="${searchList}">
                                    <tr>
                                    <th scope="row" class="text-center">${weapon.weaponId}</th>
                                    <td>${weapon.weaponName}</td>
                                    <td>${weapon.weaponType}</td>
                                    <td>${weapon.serialNumber}</td>
                                    <td>${weapon.specification}</td>
                                    <td>${weapon.price}</td>
                                    <td class="text-center"> <a href="editProfile?weaponName=${weapon.weaponName}" class="btn btn-dark fs-5">Edit</a></td>
                                    <td class="text-center"> <a href="delete?weaponId=${weapon.weaponId}" class="btn btn-dark fs-5">Delete</a></td>
                                    </tr>
                                </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </form>
        </div>
    </div>
</div>
</body>
</html>