<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Survey Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="index"><b>Home</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item "><a class="nav-link active" href="surveyDetails"><b>Survey Form</b></a></li>
                    </ul>
                </div>
            </div>
        </nav>
    <div class="d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow-lg p-4" style="width: 55rem; max-height: 90vh; overflow-y: auto;">

            <h1 class="text-center text-primary mb-4"><b>Survey Form</b></h1>
            <form class="row g-4" action="surveyDetails" method="post">
                <h3><b>Personal Information</b><hr></h3>
                <div class="col-md-6">
                    <label for="inputName" class="form-label">Name</label>
                    <input type="text" class="form-control" id="inputName" name="inputName" placeholder="enter your name">
                </div>
                <div class="col-md-3">
                    <label for="inputAge" class="form-label">Age</label>
                    <input type="number" class="form-control" id="inputAge" name="inputAge" placeholder="enter age" required>
                </div>
                <div class="col-md-3">
                    <label for="inputDob" class="form-label">Date Of Birth</label>
                    <input type="date" class="form-control" id="inputDob" name="inputDob">
                </div>
                <div class="col-md-2">
                    <label for="inputHeight" class="form-label">Height <small>(in cm)</small></label>
                    <input type="text" class="form-control" id="inputHeight" name="inputHeight" placeholder="enter height" required>
                </div>
                <div class="col-md-2">
                    <label for="inputWeight" class="form-label">Weight <small>(in Kg)</small></label>
                    <input type="text" class="form-control" id="inputWeight" name="inputWeight" placeholder="enter weight" required>
                </div>
                <div class="col-4">
                    <label for="inputEducation" class="form-label">Education <small>(highest qualification)</small></label>
                    <input type="text" class="form-control" id="inputEducation" name="inputEducation" placeholder="enter educational Qualification">
                </div>
                <div class="col-4">
                    <label for="inputOccupation" class="form-label">Occupation</label>
                    <input type="text" class="form-control" id="inputOccupation" name="inputOccupation" placeholder="enter occupation">
                </div>
                <div class="col-md-4">
                    <label for="inputNativePlace" class="form-label">Native Place</label>
                    <input type="text" class="form-control" id="inputNativePlace" name="inputNativePlace" placeholder="enter native place">
                </div>
                <div class="col-md-3">
                    <label for="inputMotherTongue" class="form-label">Mother Tongue</label>
                    <input type="text" class="form-control" id="inputMotherTongue" name="inputMotherTongue" placeholder="enter mother tongue">
                </div>
                <div class="col-md-5">
                    <label for="inputCaste" class="form-label">Caste</label>
                    <input type="text" class="form-control" id="inputCaste" name="inputCaste" placeholder="enter caste">
                </div>
                <div class="col-md-3">
                    <label for="inputReligion" class="form-label">Religion</label>
                    <input type="text" class="form-control" id="inputReligion" name="inputReligion" placeholder="enter religion">
                </div>
                <div class="col-md-3">
                    <label for="inputComplexion" class="form-label">Complexion</label>
                    <input type="text" class="form-control" id="inputComplexion" name="inputComplexion" placeholder="enter complexion">
                </div>
                <div class="col-md-4">
                    <label for="inputBloodGroup" class="form-label">Blood Group</label>
                    <select id="inputBloodGroup" name="inputBloodGroup" class="form-select">
                        <option selected>--Select Blood Group--</option>
                        <option value="A+ve">A+ve</option>
                        <option value="A-ve">A-ve</option>
                        <option value="B+ve">B+ve</option>
                        <option value="B-ve">B-ve</option>
                        <option value="AB+ve">AB+ve</option>
                        <option value="AB-ve">AB-ve</option>
                        <option value="O+ve">O+ve</option>
                        <option value="O-ve">O-ve</option>
                    </select>
                </div>
                <div class="col-md-2">
                    <label for="inputIsDisabled" class="form-label">Disabled</label>
                    <select id="inputIsDisabled" name="inputIsDisabled" class="form-select">
                        <option selected>--select--</option>
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                    </select>
                </div>
                <div class="col-md-9">
                    <label for="inputKnownDiseases" class="form-label">Known Diseases</label>
                    <input type="text" class="form-control" id="inputKnownDiseases" name="inputKnownDiseases" placeholder="enter known dieases">
                </div>

                <br><br>
                <h3><b>Family & Social Details</b><hr></h3>
                <div class="col-md-4">
                    <label for="inputFatherName" class="form-label">Father Name</label>
                    <input type="text" class="form-control" id="inputFatherName" name="inputFatherName" placeholder="enter your father name">
                </div>
                <div class="col-md-4">
                    <label for="inputMotherName" class="form-label">Mother Name</label>
                    <input type="text" class="form-control" id="inputMotherName" name="inputMotherName" placeholder="enter your mother name">
                </div>
                <div class="col-md-4">
                    <label for="inputMarried" class="form-label">Married</label>
                    <select id="inputMarried" name="inputMarried" class="form-select">
                        <option selected>--select--</option>
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label for="inputWifeOrHusbandName" class="form-label">Wife/Husband Name</label>
                    <input type="text" class="form-control" id="inputWifeOrHusbandName" name="inputWifeOrHusbandName" placeholder="enter wife/husband name">
                </div>
                <div class="col-md-3">
                    <label for="inputNoOfChildren" class="form-label">No of Children</label>
                    <input type="number" class="form-control" id="inputNoOfChildren" name="inputNoOfChildren" placeholder="enter no of children" required>
                </div>
                <div class="col-md-4">
                    <label for="inputNoOfFamilyMembers" class="form-label">No of Family Members</label>
                    <input type="number" class="form-control" id="inputNoOfFamilyMembers" name="inputNoOfFamilyMembers" placeholder="no of family members" required>
                </div>
                <div class="col-4">
                    <label for="inputFriendName" class="form-label">Friend Name</label>
                    <input type="text" class="form-control" id="inputFriendName" name="inputFriendName" placeholder="enter friend name">
                </div>
                <div class="col-4">
                    <label for="inputPetName" class="form-label">Pet Name</label>
                    <input type="text" class="form-control" id="inputPetName" name="inputPetName" placeholder="enter pet name">
                </div>
                <br>
                <h3><b>Identity & Contact Details</b><hr></h3>

                <div class="col-md-4">
                    <label for="inputMobileNumber" class="form-label">Mobile Number</label>
                    <input type="number" class="form-control" id="inputMobileNumber" name="inputMobileNumber" placeholder="enter mobile no" required>
                </div>
                <div class="col-md-4">
                    <label for="inputAadhaarNo" class="form-label">Aadhaar Number</label>
                    <input type="number" class="form-control" id="inputAadhaarNo" name="inputAadhaarNo" placeholder="enter your Aadhaar no" required>
                </div>
                <div class="col-md-4">
                    <label for="inputPanCardNo" class="form-label">PAN Card Number</label>
                    <input type="text" class="form-control" id="inputPanCardNo" name="inputPanCardNo" placeholder="enter your pan card no">
                </div>
                <div class="col-md-4">
                    <label for="inputVoterIdNo" class="form-label">Voter ID Number</label>
                    <input type="text" class="form-control" id="inputVoterIdNo" name="inputVoterIdNo" placeholder="enter voter Id no">
                </div>
                <div class="col-md-3">
                    <label for="inputPassportNo" class="form-label">Passport Number</label>
                    <input type="text" class="form-control" id="inputPassportNo" name="inputPassportNo" placeholder="enter passport no">
                </div>
                <div class="col-md-4">
                    <label for="inputRationCardNo" class="form-label">Ration Card Number</label>
                    <input type="text" class="form-control" id="inputRationCardNo" name="inputRationCardNo" placeholder="enter ration card no">
                </div>
                <br>
                <h3><b>Assets & Property</b><hr></h3>
                <div class="col-md-4">
                    <label for="inputBikeNumber" class="form-label">Bike Number</label>
                    <input type="text" class="form-control" id="inputBikeNumber" name="inputBikeNumber" placeholder="enter bike number">
                </div>
                <div class="col-md-4">
                    <label for="inputCarNumber" class="form-label">Car Number</label>
                    <input type="text" class="form-control" id="inputCarNumber" name="inputCarNumber" placeholder="enter car number">
                </div>
                <div class="col-md-4">
                    <label for="inputNoOfCycles" class="form-label">Number Of Cycles</label>
                    <input type="number" class="form-control" id="inputNoOfCycles" name="inputNoOfCycles" placeholder="enter no of cycles" required>
                </div>
                <div class="col-md-2">
                    <label for="inputShoeSize" class="form-label">Shoe Size</label>
                    <input type="number" class="form-control" id="inputShoeSize" name="inputShoeSize" placeholder="enter shoe size" required>
                </div>
                <div class="col-md-3">
                    <label for="inputNoOfShoePairs" class="form-label">Number Of Shoe Pairs</label>
                    <input type="number" class="form-control" id="inputNoOfShoePairs" name="inputNoOfShoePairs" placeholder="enter number of shoes" required>
                </div>
                <div class="col-md-4">
                    <label for="inputLaptopModel" class="form-label">Laptop Model</label>
                    <input type="text" class="form-control" id="inputLaptopModel" name="inputLaptopModel" placeholder="enter laptop model">
                </div>
                <div class="col-md-3">
                    <label for="inputTvModel" class="form-label">TV Model</label>
                    <input type="text" class="form-control" id="inputTvModel" name="inputTvModel" placeholder="enter TV model">
                </div>
                <div class="col-md-3">
                    <label for="inputGold" class="form-label">Gold <small>( in gms)</small></label>
                    <input type="number" class="form-control" id="inputGold" name="inputGold" placeholder="enter gold in gms" required>
                </div>
                <div class="col-md-3">
                    <label for="inputSilver" class="form-label">Silver <small>( in gms)</small></label>
                    <input type="number" class="form-control" id="inputSilver" name="inputSilver" placeholder="enter silver in gms" required>
                </div>
                <div class="col-md-3">
                    <label for="inputLand" class="form-label">Land <small>( in Acres )</small></label>
                    <input type="text" class="form-control" id="inputLand" name="inputLand" placeholder="enter land in acres">
                </div>
                <div class="col-md-3">
                    <label for="inputTotalSites" class="form-label">Total Sites</label>
                    <input type="number" class="form-control" id="inputTotalSites" name="inputTotalSites" placeholder="enter total sites" required>
                </div>
                <div class="col-md-4">
                    <label for="inputRtcNo" class="form-label">RTC No</label>
                    <input type="text" class="form-control" id="inputRtcNo" name="inputRtcNo" placeholder="enter rtc no">
                </div>
                <div class="col-md-4">
                    <label for="inputBuildingOwnerName" class="form-label">Building Owner Name</label>
                    <input type="text" class="form-control" id="inputBuildingOwnerName" name="inputBuildingOwnerName" placeholder="enter building owner name">
                </div>
                <div class="col-md-3">
                    <label for="inputNoOfCows" class="form-label">Number of Cows</label>
                    <input type="number" class="form-control" id="inputNoOfCows" name="inputNoOfCows" placeholder="enter no of cows" required>
                </div>
                <br>
                <h3><b>Finance & Insurance</b><hr></h3>
                <div class="col-md-3">
                    <label for="inputIncome" class="form-label">Income</label>
                    <input type="number" class="form-control" id="inputIncome" name="inputIncome" placeholder="enter income" required>
                </div>
                <div class="col-md-3">
                    <label for="inputAccountType" class="form-label">Bank Account</label>
                    <input type="text" class="form-control" id="inputAccountType" name="inputAccountType" placeholder="enter account type">
                </div>
                <div class="col-md-3">
                    <label for="inputNoOfShares" class="form-label">Share Holding</label>
                    <input type="number" class="form-control" id="inputNoOfShares" name="inputNoOfShares" placeholder="enter no of shares" required>
                </div>
                <div class="col-md-3">
                    <label for="inputInsuranceCompany" class="form-label">Insurance Company</label>
                    <input type="text" class="form-control" id="inputInsuranceCompany" name="inputInsuranceCompany" placeholder="enter insurance company">
                </div>
                <div class="col-md-3">
                    <label for="inputInsuranceNumber" class="form-label">Insurance Number</label>
                    <input type="text" class="form-control" id="inputInsuranceNumber" name="inputInsuranceNumber" placeholder="enter insurance number">
                </div>
                <div class="col-md-3">
                    <label for="inputLoanNumber" class="form-label">Loan Number</label>
                    <input type="text" class="form-control" id="inputLoanNumber" name="inputLoanNumber" placeholder="enter loan number">
                </div>
                <div class="col-md-3">
                    <label for="inputLoanBalance" class="form-label">Loan Balance</label>
                    <input type="number" class="form-control" id="inputLoanBalance" name="inputLoanBalance" placeholder="enter loan balance" required>
                </div>
                <div class="col-md-3">
                    <label for="inputLoanType" class="form-label">Loan Type</label>
                    <input type="text" class="form-control" id="inputLoanType" name="inputLoanType" placeholder="enter loan type">
                </div>
                <br>
                <h3><b>Utilities & Miscellaneous</b><hr></h3>
                <div class="col-md-3">
                    <label for="inputElectricityBillNo" class="form-label">Electricity Bill Number</label>
                    <input type="text" class="form-control" id="inputElectricityBillNo" name="inputElectricityBillNo" placeholder="enter electricity bill no">
                </div>
                <div class="col-md-3">
                    <label for="inputWaterBillNo" class="form-label">Water Bill Number</label>
                    <input type="text" class="form-control" id="inputWaterBillNo" name="inputWaterBillNo" placeholder="enter water bill no">
                </div>
                <div class="col-md-3">
                    <label for="inputTaxesPaid" class="form-label">Taxes Paid</label>
                    <input type="number" class="form-control" id="inputTaxesPaid" name="inputTaxesPaid" placeholder="enter taxes paid" required>
                </div>
                <div class="col-md-3">
                    <label for="inputCrop" class="form-label">Crop</label>
                    <input type="text" class="form-control" id="inputCrop" name="inputCrop" placeholder="enter crop">
                </div>
                <div class="text-center mt-3">
                    <button class="btn btn-primary btn-lg px-5">Submit Survey</button>
                    <button class="btn btn-primary btn-lg px-5" type="reset">Clear</button>
                </div>
            </form>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

    </body>
    </html>
