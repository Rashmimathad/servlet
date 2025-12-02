<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <title>Matrimony Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-danger sticky-top" style="height: 60px;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 fw-bold text-white" href="index">Home</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="matrimonyForm">Matrimony Form</a></li>
            </ul>
        </div>
    </div>
</nav>


<div class="position-fixed top-0 start-0 w-100 h-100">
    <img src="images/backgroundImage.jpeg"
         class="bg-image img-fluid opacity-25 w-100 h-100" style="object-fit: cover;" alt="background">
</div>

<br>

<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card p-2 bg-danger bg-opacity-10 border border-danger border-2 rounded" style="width: 45rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-danger text-uppercase"><b>Matrimony Form</b></h3>
            <br>

            <form class="row g-4" action="matrimonyForm" method="post" onsubmit="return validateForm()">


                <div class="form-floating mb-3 p-2">
                    <input type="email" class="form-control border border-danger bg-danger bg-opacity-25"
                           id="floatingInputEmail" name="inputEmail"
                           onchange="emailValidation()">
                    <label class="fs-5 fw-bold text-danger" for="floatingInputEmail">Email address</label>
                </div>


                <div class="form-floating mb-3 p-2">
                    <select class="form-select border border-danger bg-danger bg-opacity-25"
                            id="floatingSelectProfileFor" name="inputCreateProfileFor"
                            onchange="profileCreateForValidation()">
                        <option value="">--select--</option>

                        <option value="Myself">Myself</option>
                        <option value="Son">Son</option>
                        <option value="Daughter">Daughter</option>
                        <option value="Sister">Sister</option>
                        <option value="Brother">Brother</option>
                        <option value="Relative">Relative</option>
                        <option value="Friend">Friend</option>
                    </select>
                    <label class="fs-5 fw-bold text-danger" for="floatingSelectProfileFor">Create Profile For</label>
                </div>

                <div class="form-floating border border-danger mb-3 p-1 bg-danger bg-opacity-25 rounded">
                    <fieldset class="row">
                        <legend class="col-form-label col-sm-2 pt-0 fs-5 fw-bold text-danger">Gender</legend>

                        <div class="col-sm-10">

                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="inputGender"
                                       id="male" value="Male" onclick="showDivDetails()">
                                <label class="form-check-label fs-5 fw-bold text-danger" for="male">Male</label>
                            </div>

                            <div class="form-check">
                                <input class="form-check-input" type="radio" name="inputGender"
                                       id="female" value="Female" onclick="showDivDetails()">
                                <label class="form-check-label fs-5 fw-bold text-danger" for="female">Female</label>
                            </div>
                        </div>
                    </fieldset>
                </div>

                <div id="details">
                    <h3 class="fw-bold fs-4 text-danger"  id="detailsHeading">Details</h3>
                    <hr class="border border-danger border-2">

                    <div class="form-floating mb-3 p-2">
                        <input type="date" class="form-control border border-danger bg-danger bg-opacity-25"
                               id="floatingInputDobGroom" name="inputDob"
                               onchange="dateOfBirthValidation()">
                        <label class="fs-5 fw-bold text-danger" for="floatingInputDobGroom">Date of Birth</label>
                    </div>

                    <div class="form-floating mb-3 p-2">
                        <select class="form-select border border-danger bg-danger bg-opacity-25"
                                id="floatingSelectMotherTongueGroom" name="inputMotherTongue"
                                onchange="motherTongueValidation()">
                            <option value="">--select--</option>
                            <option value="Kannada">Kannada</option>
                            <option value="Telugu">Telugu</option>
                            <option value="Tamil">Tamil</option>
                            <option value="Malayalam">Malayalam</option>
                            <option value="Hindi">Hindi</option>
                        </select>
                        <label class="fs-5 fw-bold text-danger" for="floatingSelectMotherTongueGroom">Mother Tongue</label>
                    </div>

                    <div class="form-floating mb-3 p-2">
                        <select class="form-select border border-danger bg-danger bg-opacity-25"
                                id="floatingSelectReligionGroom" name="inputReligion"
                                onchange="religionValidation()">
                            <option value="">--select--</option>
                            <option value="Hindu">Hindu</option>
                            <option value="Christian">Christian</option>
                            <option value="Muslim">Muslim</option>
                        </select>
                        <label class="fs-5 fw-bold text-danger" for="floatingSelectReligionGroom">Religion</label>
                    </div>

                    <div class="form-floating mb-3 p-2">
                        <select class="form-select border border-danger bg-danger bg-opacity-25"
                                id="floatingMaritalStatusGroom" name="inputMaritalStatus"
                                onchange="maritalStatusValidation()">
                            <option value="">--select--</option>
                            <option value="Unmarried">Unmarried</option>
                            <option value="Divorced">Divorced</option>
                            <option value="Widowed">Widowed</option>
                            <option value="Awaiting Divorce">Awaiting Divorce</option>
                        </select>
                        <label class="fs-5 fw-bold text-danger" for="floatingMaritalStatusGroom">Marital Status</label>
                    </div>

                    <div class="form-floating mb-3 p-2">
                        <input type="number" class="form-control border border-danger bg-danger bg-opacity-25"
                               id="floatingInputHeightGroom" name="inputHeight"
                               oninput="heightValidation()">
                        <label class="fs-5 fw-bold text-danger" for="floatingInputHeightGroom">
                            Height <small>(in ft)</small></label>
                        <small id="heightErrMsg" class="fs-6"></small>
                    </div>
                    <div class="text-center mt-3">
                        <button class="btn btn-danger btn-lg px-5" type="submit">Submit Form</button>
                        <button class="btn btn-danger btn-lg px-5" type="reset">Clear</button>
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
<script src="script.js"></script>
</body>
</html>
