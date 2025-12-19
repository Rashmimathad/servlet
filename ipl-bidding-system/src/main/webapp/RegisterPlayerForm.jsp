<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register Player</title>
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
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="registerPlayer">Register Player</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="bidding">Bidding</a></li>
            </ul>
        </div>
    </div>
</nav>

    <div class="d-flex justify-content-center align-items-center" style="height:100vh;">
                <form action="registerPlayer" method="post">
                    <div class="card" style="width: 40rem;">
                        <img src="static/images/RegisterCard.avif" class="card-img-top" alt="registerCard" style="width: 40rem;height:12rem;">
                        <div class="card-body">
                            <h3 class="card-title fs-3 text-center fw-semibold text-dark text-uppercase"><b>Player Registration form</b></h3>
                            <br>
                            <div class="mb-3">
                                <label for="name" class="form-label fs-5 fw-bold">Player Name</label>
                                <input type="text" class="form-control" id="name" name="playerName" placeholder="Enter player name" onblur="validatePlayerName();enableSubmit();">
                                <span id="nameErrorMsg" class="fs-6 text-danger fw-bold"></span>
                            </div>
                            <div class="mb-3">
                                <label for="age" class="form-label fs-5 fw-bold">Age</label>
                                <input type="number" class="form-control" id="age" name="age" placeholder="Enter age" onblur="validateAge();enableSubmit();">
                                <span id="ageErrorMsg" class="fs-6 text-danger fw-bold"></span>
                            </div>
                            <div class="mb-3">
                                <label for="state" class="form-label fs-5 fw-bold">State</label>
                                <input type="text" class="form-control" id="state" name="state" placeholder="Enter state" onblur="validateState();enableSubmit();">
                                <span id="stateErrorMsg" class="fs-6 text-danger fw-bold"></span>
                            </div>
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
                            <div style="display:none;" id="registerBtnDetails">
                            <button type="submit" class="btn btn-primary rounded mx-auto d-block fs-4 fw-semibold"  disabled id="registerBtn">Register</button>
                            </div>
                        </div>
                    </div>
                </form>
    </div>
<script src="script.js"></script>
</body>
</html>