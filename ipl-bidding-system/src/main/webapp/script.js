function showDivDetails() {
    const playerType = document.getElementById("playerType").value;
    const error = document.getElementById("playerTypeErrorMsg");

    error.textContent = "";

    document.getElementById("batterDetails").style.display = "none";
    document.getElementById("bowlerDetails").style.display = "none";
    document.getElementById("keeperDetails").style.display = "none";
    document.getElementById("registerBtnDetails").style.display="none";

    if (playerType === "") {
        error.textContent = "Select the player type";
        return false;
    }

    if (playerType === "Batter") {
        batterDetails.style.display = "block";
        document.getElementById("registerBtnDetails").style.display="block";
    }
    else if (playerType === "Bowler") {
        bowlerDetails.style.display = "block";
        document.getElementById("registerBtnDetails").style.display="block";
    }
    else if (playerType === "All Rounder") {
        batterDetails.style.display = "block";
        bowlerDetails.style.display = "block";
        document.getElementById("registerBtnDetails").style.display="block";
    }
    else if (playerType === "Wicket Keeper") {
        batterDetails.style.display = "block";
        keeperDetails.style.display = "block";
        document.getElementById("registerBtnDetails").style.display="block";
    }

    return true;
}


function validatePlayerName() {
    const name = document.getElementById("name");
    const error = document.getElementById("nameErrorMsg");

    error.textContent = "";

    if (name.value.trim() === "") {
        error.textContent = "Player name is required";
        return false;
    }
    else if (name.value.trim().length < 3) {
        error.textContent = "Player Name must be minimum of 3 characters";
        return false;
    }

    return true;
}

function validateAge() {
    const age = document.getElementById("age");
    const error = document.getElementById("ageErrorMsg");

    error.textContent = "";

    if (age.value.trim() === "") {
        error.textContent = "Player age is required";
        return false;
    }
    else if (age.value < 15) {
        error.textContent = "Player age must be 15 years or above";
        return false;
    }
    else if (age.value > 60) {
        error.textContent = "Player age must be below 60 years";
        return false;
    }

    return true;
}


function validateState() {
    const state = document.getElementById("state");
    const error = document.getElementById("stateErrorMsg");

    error.textContent = "";

    if (state.value.trim() === "") {
        error.textContent = "State name is required";
        return false;
    }
    else if (state.value.trim().length < 3) {
        error.textContent = "State name must be minimum of 3 characters";
        return false;
    }
    else if (!/^[a-zA-Z\s]+$/.test(state.value)) {
        error.textContent = "State name must contain only letters";
        return false;
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
        validatePlayerName() &&
        validateAge() &&
        validateState() &&
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

    document.getElementById("registerBtn").disabled = !isValid;
}