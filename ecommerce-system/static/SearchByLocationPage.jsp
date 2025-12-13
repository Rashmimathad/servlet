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
<body class="bg-primary-subtle">
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
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="searchByLocation">Search By Location</a></li>

            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card mb-3 opacity-10" style="max-width: 1150px;">
        <div class="row g-0">
            <div class="col-md-4  bg-primary">
                <img src="images/icon.png" class="img-fluid mt-5 pe-5" alt="signup">
            </div>
            <div class="col-md-8">
                <div class="card-body bg-body-tertiary">
                    <h2 class="card-title text-center">Search</h2><br>
                    <form action="searchByLocation" method="get">

                        <div class="mb-3">
                            <label for="address" class="form-label fw-bolder fs-5">Address <span style="color:red;">*</span></label>
                            <textarea class="form-control" id="address"  name="inputAddress" rows="3" onchange="validateAddress();enableSubmit()" placeholder="enter your address"></textarea>
                            <span class="error text-danger" id="addressError"></span><br>
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
                            <table class="table table-bordered">
                                <thead class="table-primary text-center">
                                <tr>
                                    <th scope="col">Id</th>
                                    <th scope="col">Full Name</th>
                                    <th scope="col">Contact Number</th>
                                    <th scope="col">Gender</th>
                                    <th scope="col">Age</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Edit</th>
                                    <th scope="col">Delete</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="user" items="${dto}">
                                    <tr>
                                        <th scope="row" class="text-center">${user.id}</th>
                                        <td>${user.fullName}</td>
                                        <td>${user.contactNumber}</td>
                                        <td>${user.gender}</td>
                                        <td>${user.age}</td>
                                        <td>${user.address}</td>
                                        <td class="text-center"> <a href="editProfile?contactNo=${user.contactNumber}" class="btn btn-primary fs-6">Edit</a></td>
                                        <td class="text-center"> <a href="delete?userId=${user.id}" class="btn btn-primary fs-6"  onclick="openDeletePopup(event,'${user.id}')">Delete</a></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </c:if>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="deleteConfirmModal" tabindex="-1" aria-labelledby="deleteConfirmLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title" id="deleteConfirmLabel">Confirm Delete</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body fs-5 fw-semibold">
                Are you sure you want to delete this profile?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary p-2 col-md-2" data-bs-dismiss="modal">No</button>
                <a id="confirmDeleteBtn" class="btn btn-danger p-2 col-md-2">Yes</a>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
<script>
    const deleteModalElement = document.getElementById('deleteConfirmModal');
    const deleteModal = new bootstrap.Modal(deleteModalElement);

      function openDeletePopup(event, userId) {
          event.preventDefault();
          document.getElementById('confirmDeleteBtn').href = 'delete?userId=' + userId;

          deleteModal.show();
      }
</script>

</body>
</html>