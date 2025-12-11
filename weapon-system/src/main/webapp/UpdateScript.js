function validateWeaponName() {
    let name = document.getElementById("weaponName");
    let error = document.getElementById("nameError");

    if (name.value.trim() === "") {
        error.textContent = "Weapon name is required";
        return false;
    }else if(name.value.length<4){
     error.textContent = "Weapon name must be more than 4 characters";
    } else {
        error.textContent = "";
        return true;
    }
}

function validateWeaponType() {
    let type = document.getElementById("weaponType");
    let error = document.getElementById("weaponTypeError");

    if (type.value === "") {
        error.textContent = "Please select weapon type";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}

function validateSerialNumber() {
    let serial = document.getElementById("serialNumber");
    let error = document.getElementById("serialNumberError");

    if (serial.value.trim() === "") {
        error.textContent = "Serial number is required";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}

function validateSpecification() {
    let spec = document.getElementById("specification");
    let error = document.getElementById("specificationError");

    if (spec.value.trim() === "") {
        error.textContent = "Specification is required";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}

function validatePrice() {
    let price = document.getElementById("price");
    let error = document.getElementById("priceError");

    if (price.value.trim() === "") {
        error.textContent = "Price is required";
        return false;
    }

    if (isNaN(price.value) || Number(price.value) <= 0) {
        error.textContent = "Enter valid price (only numbers)";
        return false;
    }

    error.textContent = "";
    return true;
}

function enableSubmit() {
    let isValid =
        validateWeaponName() &&
        validateWeaponType() &&
        validateSerialNumber() &&
        validateSpecification() &&
        validatePrice();

    document.getElementById("updateBtn").disabled = !isValid;
}

document.getElementById("serialNumber").onkeyup = function () {
    validateSerialNumber();
    enableSubmit();
};
document.getElementById("specification").onkeyup = function () {
    validateSpecification();
    enableSubmit();
};
document.getElementById("price").onkeyup = function () {
    validatePrice();
    enableSubmit();
};
