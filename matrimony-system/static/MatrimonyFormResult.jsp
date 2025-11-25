<!doctype html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>
        Matrimony Form Result
    </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="d-flex justify-content-center align-items-center" style="height: 100vh;">
<div class="card align-self-center p-3 shadow" style="width: 25rem;">
    <img src="images/successImage.webp" class="card-img-top" alt="success">
    <div class="card-body">
        <h5 class="card-title text-success">Matrimony Profile Created SuccessfullyY!!!</h5>
<pre class="card-text">
<strong>Email : ${email}</strong>
<strong>Profile created for : ${createProfileFor}</strong>
<strong>Gender : ${gender}</strong>
<c:if test="${inputGender == 'Male'}">
<strong>Groom Details</strong>
<hr>
<strong>Date of Birth: ${groomDob}</strong>
<strong>Mother Tongue: ${groomMotherTongue}</strong>
<strong>Religion: ${groomReligion}</strong>
<strong>Marital Status: ${groomMaritalStatus}</strong>
<strong>Height: ${groomHeight}</strong>
</c:if>
<c:if test="${inputGender == 'Female'}">
<strong>Bride Details</strong>
<hr>
<strong>Date of Birth: ${brideDob}</strong>
<strong>Mother Tongue: ${brideMotherTongue}</strong>
<strong>Religion: ${brideReligion}</strong>
<strong>Marital Status: ${brideMaritalStatus}</strong>
<strong>Height: ${brideHeight}</strong>
    </c:if>
</pre>
        <a href="matrimonyForm" class="btn btn-primary">Submit Another Form</a>

    </div>
</div>
</div>
</body>
</html>