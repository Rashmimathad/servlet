<!doctype html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Player Search</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        .navbar-navy {
    background-color: #0b1c2d;
}
    </style>
</head>
<body class="bg-body-secondary">
<nav class="navbar navbar-expand-lg navbar-navy border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <img src="static/images/logo.png" alt="logo"  style="height: 45px; width:70px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav nav-pills ms-auto">
                <h3 class="card-title fs-3 p-2 text-right fw-semibold text-white  text-uppercase"><b>${companyName}</b></h3>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="registerPlayer">Register Player</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="bidding">Bidding</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <form action="playerSearch" method="get">
        <div class="card" style="width: 60rem;">
            <img src="static/images/RegisterCard.avif" class="card-img-top" alt="registerCard" style="width: 60rem;height:12rem;">
            <div class="card-body">

                <h3 class="card-title fs-3 text-center fw-semibold text-dark text-uppercase"><b>Players Search</b></h3>
                <br>
                <div class="row">
                <div class="col-md-12">
                    <label for="playerType" class="form-label fs-5 fw-bold">Player Type</label>
                    <select id="playerType" class="form-select" name="playerType" onchange="showDivDetails();enableSubmit();">
                        <option value="">Choose Player Type</option>
                        <option value="Batter">Batter</option>
                        <option value="Bowler">Bowler</option>
                        <option value="All Rounder">All Rounder</option>
                        <option value="Wicket Keeper">Wicket Keeper</option>
                    </select>
                    <span id="playerTypeErrorMsg" class="fs-6 text-danger fw-bold"></span>
                </div>
                <br>
                    <br>
                    <div id="batterDetails" style="display:none;">
                        <div class="mb-3">
                            <label for="battingAvg" class="form-label fs-5 fw-bold">Batting Average</label>
                            <input type="number" class="form-control" id="battingAvg" name="battingAvg" placeholder="Enter batting average" onblur="validateBattingAvg();enableSubmit();">
                            <span id="battingAvgErrorMsg" class="fs-6 text-danger fw-bold"></span>
                        </div>
                    </div>
                    <div id="bowlerDetails" style="display:none;">
                        <div class="mb-3">
                            <label for="bowlerAvg" class="form-label fs-5 fw-bold">Bowling Average</label>
                            <input type="number" class="form-control" id="bowlerAvg" name="bowlerAvg" placeholder="Enter bowling average" onblur="validateBowlingAvg();enableSubmit();">
                            <span id="bowlerAvgErrorMsg" class="fs-6 text-danger fw-bold"></span>
                        </div>
                    </div>
                    <div id="keeperDetails" style="display:none;">
                        <div class="mb-3">
                            <label for="noOfStumps" class="form-label fs-5 fw-bold">No of Stumps</label>
                            <input type="number" class="form-control" id="noOfStumps" name="noOfStumps" placeholder="Enter no of stumps" onblur="validateNoOfStumps();enableSubmit();">
                            <span id="noOfStumpsErrorMsg" class="fs-6 text-danger fw-bold"></span>
                        </div>
                    </div>
                    <br>
                    <div class="mb-5" style="display:none;0" id="searchBtnDetails"><br>
                        <button type="submit" class="btn btn-primary rounded mx-auto d-block fs-4 fw-semibold" disabled id="searchBtn">Search</button>
                    </div>
                </div>
                <br>
                <c:if test="${not empty errorMsg}">
                    <p class="text-danger text-center border border-danger border-2 fs-3 fw-semibold col-md-10 ms-5 ps-5">${errorMsg}</p>
                </c:if>
                <c:if test="${not empty searchList}">
                    <table class="table table-bordered">
                        <thead class="table-info text-center">
                        <tr>
                            <th scope="col">Player Id</th>
                            <th scope="col">Player Name</th>
                            <th scope="col">Age</th>
                            <th scope="col">State</th>
                            <th scope="col">Player Type</th>
                            <c:if test="${selectedPlayerType == 'Batter'}"><th>Batting Avg</th></c:if>
                            <c:if test="${selectedPlayerType == 'Bowler'}"><th>Bowling Avg</th></c:if>
                            <c:if test="${selectedPlayerType == 'All Rounder'}"><th>Batting Avg</th><th>Bowling Avg</th></c:if>
                            <c:if test="${selectedPlayerType == 'Wicket Keeper'}"><th>Batting Avg</th><th>No of Stumps</th></c:if>
                            <th scope="col">Bid</th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="player" items="${searchList}">
                            <tr>
                                <th scope="row" class="text-center">${player.id}</th>
                                <td>${player.playerName}</td>
                                <td>${player.age}</td>
                                <td>${player.state}</td>
                                <td>${player.playerType}</td>
                                <c:if test="${selectedPlayerType == 'Batter'}"><td>${player.battingAvg}</td></c:if>
                                <c:if test="${selectedPlayerType == 'Bowler'}"><td>${player.bowlingAvg}</td></c:if>
                                <c:if test="${selectedPlayerType == 'All Rounder'}"><td>${player.battingAvg}</td><td>${player.bowlingAvg}</td></c:if>
                                <c:if test="${selectedPlayerType == 'Wicket Keeper'}"><td>${player.battingAvg}</td><td>${player.noOfStumps}</td></c:if>
                                <td class="text-center"> <a href="playerBid?playerId=${player.id}" class="btn btn-primary fs-6" id="editBtn">Bid</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>
        </div>
    </form>
</div>
<script>
    function showDivDetails() {
    const playerType = document.getElementById("playerType").value;
    const error = document.getElementById("playerTypeErrorMsg");

    error.textContent = "";

    document.getElementById("batterDetails").style.display = "none";
    document.getElementById("bowlerDetails").style.display = "none";
    document.getElementById("keeperDetails").style.display = "none";
    document.getElementById("searchBtnDetails").style.display="none";

    if (playerType === "") {
        error.textContent = "Select the player type";
        return false;
    }

    if (playerType === "Batter") {
        batterDetails.style.display = "block";
        document.getElementById("searchBtnDetails").style.display="block";
    }
    else if (playerType === "Bowler") {
        bowlerDetails.style.display = "block";
        document.getElementById("searchBtnDetails").style.display="block";
    }
    else if (playerType === "All Rounder") {
        batterDetails.style.display = "block";
        bowlerDetails.style.display = "block";
        document.getElementById("searchBtnDetails").style.display="block";
    }
    else if (playerType === "Wicket Keeper") {
        batterDetails.style.display = "block";
        keeperDetails.style.display = "block";
        document.getElementById("searchBtnDetails").style.display="block";
    }

    return true;
}

    function validateBattingAvg() {
    const avg = document.getElementById("battingAvg");
    const error = document.getElementById("battingAvgErrorMsg");

    error.textContent = "";

    if (avg.value.trim() === "") {
        error.textContent = "Batting average is required";
        return false;
    }
    else if (avg.value <= 0) {
        error.textContent = "Batting average must be greater than 0";
        return false;
    }

    return true;
}

function validateBowlingAvg() {
    const avg = document.getElementById("bowlerAvg");
    const error = document.getElementById("bowlerAvgErrorMsg");

    error.textContent = "";

    if (avg.value.trim() === "") {
        error.textContent = "Bowling average is required";
        return false;
    }
    else if (avg.value <= 0) {
        error.textContent = "Bowling average must be greater than 0";
        return false;
    }
    else if (avg.value > 100) {
        error.textContent = "Bowling average must be below 100";
        return false;
    }

    return true;
}


function validateNoOfStumps() {
    const stumps = document.getElementById("noOfStumps");
    const error = document.getElementById("noOfStumpsErrorMsg");

    error.textContent = "";

    if (stumps.value.trim() === "") {
        error.textContent = "Number of stumps is required";
        return false;
    }
    else if (stumps.value <= 0) {
        error.textContent = "Number of stumps must be greater than 0";
        return false;
    }
    else if (!Number.isInteger(Number(stumps.value))) {
        error.textContent = "Number of stumps must be a whole number";
        return false;
    }
    else if (stumps.value > 1000) {
        error.textContent = "Number of stumps must be below 1000";
        return false;
    }

    return true;
}


function enableSubmit() {
    const type = document.getElementById("playerType").value;

    let isValid =
        showDivDetails();

    if (type === "Batter") {
        isValid = isValid && validateBattingAvg();
    }
    else if (type === "Bowler") {
        isValid = isValid && validateBowlingAvg();
    }
    else if (type === "All Rounder") {
        isValid = isValid && validateBattingAvg() && validateBowlingAvg();
    }
    else if (type === "Wicket Keeper") {
        isValid = isValid && validateBattingAvg() && validateNoOfStumps();
    }

    document.getElementById("searchBtn").disabled = !isValid;
}

</script>
</body>
</html>
