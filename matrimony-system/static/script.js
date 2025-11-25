function toggleDetails() {
    const maleRadio = document.getElementById("male").checked;
    const femaleRadio = document.getElementById("female").checked;
    if (!maleRadio && !femaleRadio) {
        alert("Please select Gender.");
        return false;
    }

    const groom = document.getElementById("groomDetails");
    const bride = document.getElementById("brideDetails");

    groom.classList.add("d-none");
    bride.classList.add("d-none");

       if (maleRadio) {
           groom.classList.remove("d-none");
       }
       if (femaleRadio) {
           bride.classList.remove("d-none");
       }
        return true;
}

function emailValidation(){
    const email = document.getElementById("floatingInputEmail").value;
    const pattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;
    if(!pattern.test(email)){
     alert("Please enter a valid email address");
     return false;
    }
    return true;
}

function profileCreateForValidation() {
    const selectField = document.getElementById("floatingSelectProfileFor").value;
    if (selectField === "") {
        alert("Please select who you are creating this profile for.");
        return false;
    }
    return true;
}

function dateOfBirthValidation() {
    const maleRadio = document.getElementById("male").checked;
    const femaleRadio = document.getElementById("female").checked;
if(maleRadio){
    let dob = document.getElementById("floatingInputDobGroom").value;
    if (dob === "") {
        alert("Please select valid Date of Birth of Groom");
        return false;
    }

    const dobDate = new Date(dob);
    const today = new Date();

    if (dobDate > today) {
        alert("Date of Birth cannot be in the future.");
        return false;
    }

    let age = today.getFullYear() - dobDate.getFullYear();
    let month = today.getMonth() - dobDate.getMonth();
    let day = today.getDate() - dobDate.getDate();

    if (age < 18 || (age === 18 && month < 0) || (age === 18 && month === 0 && day < 0)) {
        alert("Age must be 18 or above.");
        return false;
    }

    return true;
    }
    else{
     let dob = document.getElementById("floatingInputDobBride").value;
        if (dob === "") {
            alert("Please select valid Date of Birth of Bride");
            return false;
        }

        const dobDate = new Date(dob);
        const today = new Date();

        if (dobDate > today) {
            alert("Date of Birth cannot be in the future.");
            return false;
        }

        let age = today.getFullYear() - dobDate.getFullYear();
        let month = today.getMonth() - dobDate.getMonth();
        let day = today.getDate() - dobDate.getDate();

        if (age < 18 || (age === 18 && month < 0) || (age === 18 && month === 0 && day < 0)) {
            alert("Age must be 18 or above.");
            return false;
        }

        return true;
    }
}


function motherTongueValidation(){
    const maleRadio = document.getElementById("male").checked;
    const femaleRadio = document.getElementById("female").checked;

    if(maleRadio){
    const motherTongue = document.getElementById("floatingSelectMotherTongueGroom").value;
            if (motherTongue === ""){
                alert("Please select Mother Tongue of Groom");
                return false;
            }
           return true;
           }
           else{
             const motherTongue = document.getElementById("floatingSelectMotherTongueBride").value;
                       if (motherTongue === ""){
                           alert("Please select Mother Tongue of Bride");
                           return false;
                       }
                      return true;
           }

}

function religionValidation(){

    const maleRadio = document.getElementById("male").checked;
    const femaleRadio = document.getElementById("female").checked;

    if(maleRadio){
    const religion = document.getElementById("floatingSelectReligionGroom").value;
            if (religion === ""){
                alert("Please select Religion of Groom");
                return false;
            }
           return true;
           }
           else{
             const religion = document.getElementById("floatingSelectReligionBride").value;
                       if (religion === ""){
                           alert("Please select Religion of Bride");
                           return false;
                       }
                      return true;
    }
}

function maritalStatusValidation(){

    const maleRadio = document.getElementById("male").checked;
    const femaleRadio = document.getElementById("female").checked;

    if(maleRadio){
    const maritalStatus = document.getElementById("floatingMaritalStatusGroom").value;
            if (maritalStatus === ""){
                alert("Please select marital status of Groom");
                return false;
            }
           return true;
    }
    else{
         const maritalStatus = document.getElementById("floatingMaritalStatusBride").value;
          if (maritalStatus === ""){
             alert("Please select marital status of Bride");
              return false;
          }
     return true;
    }

 }

function heightValidation() {
const maleRadio = document.getElementById("male").checked;
if(maleRadio){
        const heightInput = document.getElementById("floatingInputHeightGroom").value;
        const height = parseFloat(heightInput);

        if (isNaN(height) || height < 1 || height > 7) {
            alert("Please enter a valid height between 1 and 7 ft.");
            return false;
        }
        return true;
    }
    else{
    const heightInput = document.getElementById("floatingInputHeightBride").value;
            const height = parseFloat(heightInput);

            if (isNaN(height) || height < 1 || height > 7) {
                alert("Please enter a valid height between 1 and 7 ft.");
                return false;
            }
            return true;
    }
}

function validateForm() {
    if (!emailValidation()) return false;
    if (!profileCreateForValidation()) return false;
    if (!dateOfBirthValidation()) return false;
    if (!motherTongueValidation()) return false;
    if (!religionValidation()) return false;
    if (!maritalStatusValidation()) return false;
    if (!heightValidation()) return false;
    return true; // all validations passed
}

