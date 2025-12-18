function validateName() {
    let name = document.getElementById("name").value.trim();
    let error = document.getElementById("nameError");

    if (name.length < 3) {
        error.innerHTML = "Name must be at least 3 characters";
        return false;
    } else {
        error.innerHTML = "";
        return true;
    }
}

function validateContact() {
    let contact = document.getElementById("contact").value.trim();
    let error = document.getElementById("contactError");
    let pattern = /^[0-9]{10}$/;

    if (!pattern.test(contact)) {
        error.innerHTML = "Enter valid 10-digit phone number";
        return false;
    } else {
        error.innerHTML = "";
        return true;
    }
}

function validateGender() {
    let male = document.getElementById("male").checked;
    let female = document.getElementById("female").checked;
    let error = document.getElementById("genderError");

    if (!male && !female) {
        error.innerHTML = "Please select gender";
        return false;
    } else {
        error.innerHTML = "";
        return true;
    }
}

function validateAge() {
    let age = document.getElementById("age").value;
    let error = document.getElementById("ageError");

    if (age < 18 || age > 99) {
        error.innerHTML = "Age must be between 18 and 99";
        return false;
    } else {
        error.innerHTML = "";
        return true;
    }
}

function validateAddress() {
    let address = document.getElementById("address").value.trim();
    let error = document.getElementById("addressError");

    if (address.length < 10) {
        error.innerHTML = "Address must be at least 10 characters";
        return false;
    } else {
        error.innerHTML = "";
        return true;
    }
}

function validatePassword() {
    let password = document.getElementById("password").value;
    let error = document.getElementById("passwordError");

    if (password.trim() === "") {
        error.textContent = "Password is required";
        return false;
    }

    if (password.length < 6) {
        error.textContent = "Password must be at least 6 characters";
        return false;
    }

    let pattern = /^(?=.*[A-Za-z])(?=.*\d).+$/;
    if (!pattern.test(password)) {
        error.textContent = "Password must contain letters and numbers";
        return false;
    }

    error.textContent = "";
    return true;
}

function validateConfirmPassword() {
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;
    let error = document.getElementById("confirmPasswordError");

    if (confirmPassword.trim() === "") {
        error.textContent = "Confirm password is required";
        return false;
    }

    if (password !== confirmPassword) {
        error.textContent = "Passwords do not match";
        return false;
    }
    error.textContent = "";
    return true;
}

function enableSubmit() {
    let isValid =
        validateName() &&
        validateContact() &&
        validateGender() &&
        validateAge() &&
        validateAddress()&&
        validatePassword() &&
        validateConfirmPassword();

    document.getElementById("submitBtn").disabled = !isValid;
}

function formValidation() {
    return enableSubmit();
}
