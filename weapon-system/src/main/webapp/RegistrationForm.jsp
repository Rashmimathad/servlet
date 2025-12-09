<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark navbar-expand-lg bg-dark border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 fw-semibold text-white" href="index">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active text-white fs-3 fw-semibold" href="register">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-white fs-3 fw-semibold" href="search">Search</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-50 border border-dark border-2 rounded" style="width: 45rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Weapon Register Form</b></h3>
            <br>
            <form action="register" method="post">
                <div class="mb-3">
                    <label for="weaponName" class="form-label fs-5 fw-bold">Weapon Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="weaponName" name="weaponName" onblur="validateWeaponName();enableSubmit();" placeholder="Enter weapon name">
                    <span id="nameError" class="text-danger fw-bold"></span>
                </div>
                <div class="col-md-12">
                    <label for="weaponType" class="form-label fs-5 fw-bold">Weapon Type <span class="text-danger">*</span></label>
                    <select id="weaponType" name="weaponType" class="form-select" onblur="validateWeaponType();enableSubmit();">
                        <option value="">Choose...</option>
                        <option value="Shotgun">Shotgun</option>
                        <option value="Rifle">Rifle</option>
                        <option value="Handgun">Handgun</option>
                        <option value="Pistol">Pistol</option>
                        <option value="Revolver">Revolver</option>
                        <option value="Sniper Rifle">Sniper Rifle</option>
                        <option value="Assault Rifle">Assault Rifle</option>
                    </select>
                    <span id="weaponTypeError" class="text-danger fw-bold"></span>
                </div>
                <br>
                <div class="mb-3">
                    <label for="serialNumber" class="form-label fs-5 fw-bold">Serial Number <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="serialNumber" name="serialNumber" onblur="validateSerialNumber();enableSubmit();" placeholder="Enter serial number">
                    <span id="serialNumberError" class="text-danger fw-bold"></span>
                </div>
                <div class="mb-3">
                    <label for="specification" class="form-label fs-5 fw-bold">Specification <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="specification" name="specification" onblur="validateSpecification();enableSubmit();" placeholder="Enter specification of weapon">
                    <span id="specificationError" class="text-danger fw-bold"></span>
                </div>

                <div class="mb-3">
                    <label for="price" class="form-label fs-5 fw-bold">Price <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="price" name="price" onblur="validatePrice();enableSubmit();" placeholder="Enter price">
                    <span id="priceError" class="text-danger fw-bold"></span>
                </div>
                <br>
                <button type="submit" class="btn btn-dark rounded mx-auto d-block fs-4 fw-semibold"  disabled id="registerBtn">Register</button>
            </form>
        </div>
    </div>
</div>
<script src="script.js"></script>
</body>
</html>