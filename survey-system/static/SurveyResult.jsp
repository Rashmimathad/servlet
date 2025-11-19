<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Survey Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h3 class="text-center" style="color:red;" >${errorMessage}</h3>
<h3 class="text-center" style="color:green;" >${successMessage}</h3>

<div class="card-group">
    <div class="card">
        <img src="images/personIcon.png" class="card-img-top align-self-center" alt="personalDetails" style="height:150px;width : 150px">
        <div class="card-body">
            <h3 class="card-title text-center"><b>Personal Details</b></h3>
            <br>
            <h5 class="card-text">
                <strong>Name : </strong> ${name}<br>
                <strong>Age : </strong> ${age}<br>
                <strong>Date Of Birth : </strong> ${dateOfBirth}<br>
                <strong>Height : </strong> ${height}<br>
                <strong>Weight : </strong> ${weight}<br>
                <strong>Education : </strong> ${education}<br>
                <strong>Occupation : </strong> ${occupation}<br>
                <strong>Native Place : </strong> ${nativePlace}<br>
                <strong>Mother Tongue : </strong> ${motherTongue}<br>
                <strong>Caste : </strong> ${caste}<br>
                <strong>Religion : </strong> ${religion}<br>
                <strong>Complexion : </strong> ${complexion}<br>
                <strong>Blood Group : </strong> ${bloodGroup}<br>
                <strong>Disabled : </strong> ${isDisabled}<br>
                <strong>Known Diseases : </strong> ${knownDiseases}<br>
            </h5>
        </div>
    </div>
    <div class="card">
        <img src="images/familyIcon.png" class="card-img-top align-self-center" alt="familyDetails" style="height:150px;width : 150px">
        <div class="card-body">
            <h3 class="card-title text-center"><b>Family & Social Details</b></h3>
            <br>
            <h5 class="card-text">
                <strong>Father Name : </strong> ${fatherName}<br>
                <strong>Mother Name : </strong> ${motherName}<br>
                <strong>Married : </strong> ${isMarried}<br>
                <strong>Wife/Husband Name : </strong> ${wifeOrHusbandName}<br>
                <strong>No of Children : </strong> ${noOfChildren}<br>
                <strong>No of Family Members : </strong> ${noOfFamilyMembers}<br>
                <strong>Friend Name : </strong> ${friendName}<br>
                <strong>Pet Name : </strong> ${petName}<br>
            </h5>
        </div>
    </div>
    <div class="card">
        <img src="images/identityDetails.png" class="card-img-top align-self-center" alt="identityDetails"  style="height:150px;width : 150px">
        <div class="card-body">
            <h3 class="card-title text-center"><b>Identity & Contact Details</b></h3>
            <br>
            <h5 class="card-text">
                <strong>Mobile Number : </strong> ${mobileNumber}<br>
                <strong>Aadhaar Number : </strong> ${aadhaarNumber}<br>
                <strong>PanCard Number : </strong> ${panCardNumber}<br>
                <strong>VoterId Number : </strong> ${voterIdNumber}<br>
                <strong>Passport Number : </strong> ${passportNumber}<br>
                <strong>RationCard Number : </strong> ${rationCardNumber}<br>
            </h5>
        </div>
    </div>
    <br>
    <div class="card">
        <img src="images/assetsIcon.png" class="card-img-top align-self-center" alt="assetsDetails"  style="height:150px;width : 150px">
        <div class="card-body">
            <h3 class="card-title text-center"><b>Assets & Property</b></h3>
            <br>
            <h5 class="card-text">
                <strong>Bike Number : </strong> ${bikeNumber}<br>
                <strong>Car Number : </strong> ${carNumber}<br>
                <strong>Number of Cycles : </strong> ${noOfCycles}<br>
                <strong>Shoe Size : </strong> ${shoeSize}<br>
                <strong>Number Of Shoes : </strong> ${noOfShoes}<br>
                <strong>Laptop Model : </strong> ${laptopModel}<br>
                <strong>TV Model : </strong> ${tvModel}<br>
                <strong>Gold <small>(in gms)</small> : </strong> ${goldInGms}<br>
                <strong>Silver <small>(in gms)</small> : </strong> ${silverInGms}<br>
                <strong>Land <small>( in Acres)</small> : </strong> ${landInAcres}<br>
                <strong>Total Sites : </strong> ${totalSites}<br>
                <strong>RTC Number : </strong> ${rtcNumber}<br>
                <strong>Building Owner Name : </strong> ${buildingOwnerName}<br>
                <strong>Number Of Cows : </strong> ${noOfCows}<br>
            </h5>
        </div>
    </div>
    <div class="card">
        <img src="images/financeIcon.webp" class="card-img-top align-self-center" alt="financeDetails" style="height:170px;width:230px">
        <div class="card-body">
            <h3 class="card-title text-center"><b>Finance & Insurance</b></h3>
            <br>
            <h5 class="card-text">
                <strong>Income : </strong> ${income}<br>
                <strong>Bank Account Type : </strong> ${bankAccountType}<br>
                <strong>Share Holding  : </strong> ${shareHolding}<br>
                <strong>Insurance Company : </strong> ${insuranceCompany}<br>
                <strong>Insurance Number : </strong> ${insuranceNumber}<br>
                <strong>Loan Number : </strong> ${loanNumber}<br>
                <strong>Loan Balance : </strong> ${loanBalance}<br>
                <strong>Loan Type : </strong> ${loanType}<br>
            </h5>
        </div>
    </div>
    <div class="card">
        <img src="images/utilitiesImage.png" class="card-img-top align-self-center" alt="utilityDetails" style="height:150px;width : 150px">
        <div class="card-body">
            <h3 class="card-title text-center"><b>Utilities & Miscellaneous</b></h3>
            <br>
            <h5 class="card-text">
                <strong>ElectricityBill Number : </strong> ${electricityBillNumber}<br>
                <strong>WaterBill Number : </strong> ${waterBillNumber}<br>
                <strong>Taxes Paid : </strong> ${taxesPaid}<br>
                <strong>Crop : </strong> ${crop}<br>
            </h5>
        </div>
    </div>
</div>     <div class="text-center mt-3">
    <a class="btn btn-primary btn-lg px-5" href="SurveyForm.jsp">Submit Another Form</a>
</div>
</body>
</html>