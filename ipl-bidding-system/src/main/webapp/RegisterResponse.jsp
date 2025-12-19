<!doctype html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Response</title>
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
        <div class="card" style="width: 40rem;">
            <img src="static/images/RegisterCard.avif" class="card-img-top" alt="registerCard" style="width: 40rem;height:12rem;">
            <div class="card-body">
                <h3 class="card-title fs-3 text-center fw-semibold text-success text-uppercase">${successMsg}</b></h3>
                <h3 class="card-title fs-3 text-center fw-semibold text-danger text-uppercase">${errorMsg}</b></h3>
                <br>
                <c:if test="${dto!=null}">
                    <h6 class="card-title text-center fs-2 fw-bold text-uppercase">Player Details</h6>
                    <p class="card-text">
                    <p class="fs-4"><strong>Player Name:</strong> ${dto.playerName}</p>
                    <p class="fs-4"><strong>Age:</strong> ${dto.age}</p>
                    <p class="fs-4"><strong>State:</strong> ${dto.state}</p>
                    <p class="fs-4"><strong>Player Type:</strong> ${dto.playerType}<br></p>
                    <c:if test="${dto.playerType == 'Batter'}">
                    <p class="fs-4"><strong>Batting Average:</strong> ${dto.battingAvg}</p>
                    </c:if>
                    <c:if test="${dto.playerType == 'Bowler'}">
                    <p class="fs-4"><strong>Bowling Average:</strong> ${dto.bowlingAvg}</p>
                    </c:if>
                    <c:if test="${dto.playerType == 'All Rounder'}">
                        <p class="fs-4"><strong>Batting Average:</strong> ${dto.battingAvg}</p>
                        <p class="fs-4"><strong>Bowling Average:</strong> ${dto.bowlingAvg}</p>
                    </c:if>
                    <c:if test="${dto.playerType == 'Wicket Keeper'}">
                        <p class="fs-4"><strong>Batting Average:</strong> ${dto.battingAvg}</p>
                    <p class="fs-4"><strong>No of Stumpings:</strong> ${dto.noOfStumps}</p>
                    </c:if>
                    <a href="index" class="btn btn-dark fs-5 d-grid gap-2 col-4 mx-auto">Go to Home</a>
                    </p>
                </c:if>
            </div>
        </div>
</div>
</body>
</html>
