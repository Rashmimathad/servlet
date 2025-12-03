function validateName() {
        let name = document.getElementById("inputFullName").value.trim();
        let error = document.getElementById("nameError");

        if (name.length < 3) {
            error.innerHTML = "Name must be at least 3 characters";
            checkAllValid();
            return false;
        }
        else {
            error.innerHTML = "";
            checkAllValid();
            return true;
        }
    }

    function validateContact() {
        let contact = document.getElementById("inputContactNumber").value.trim();
          let error = document.getElementById("nameError");
        let pattern = /^[0-9]{10}$/;

        if (!pattern.test(contact)) {
            error.innerHTML = "Enter valid 10-digit phone number";
            checkAllValid();
            return false;
        } else {
            error.innerHTML = "";

            checkAllValid();
            return true;
        }
    }

    function validateGender() {
        let gender = document.getElementById("gender").value;
        let error = document.getElementById("genderError");

        if (gender === "") {
            error.innerHTML = "Please select gender";
            checkAllValid();
            return false;
        } else {
            error.innerHTML = "";
            checkAllValid();
            return true;
        }
    }

    function validateAge() {
        let age = document.getElementById("inputAge").value;
        let error = document.getElementById("ageError");

        if (age < 18 || age > 99) {
            error.innerHTML = "Age must be between 18 and 99";
            checkAllValid();
            return false;
        } else {
            error.innerHTML = "";
            checkAllValid();
            return true;
        }
    }

    function validateAddress() {
        let address = document.getElementById("inputAddress").value.trim();
        let error = document.getElementById("addressError");

        if (address.length < 10) {
            error.innerHTML = "Address must be at least 10 characters";
            checkAllValid();
            return false;
        } else {
            error.innerHTML = "";
            checkAllValid();
            return true;
        }
    }

    function checkAllValid() {
        let isValid =
            validateName() &&
            validateContact() &&
            validateGender() &&
            validateAge() &&
            validateAddress();

        document.getElementById("submitBtn").disabled = !isValid;
    }