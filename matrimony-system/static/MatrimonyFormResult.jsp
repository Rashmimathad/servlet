
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Matrimony Form Result</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="d-flex justify-content-center align-items-center" style="height: 100vh;">
    <div class="card align-self-center p-3 shadow" style="width: 25rem;">
        <img src="images/successImage.webp" class="card-img-top" alt="success">

        <div class="card-body">
            <h5 class="card-title"  style="color:red;">${errorMessage}</h5>
            <h5 class="card-title"  style="color:green;">${successMessage}</h5>
            <p class="card-text">
                <strong>Email : ${email}</strong><br>
                <strong>Profile created for : ${createProfileFor}</strong><br>
                <strong>Gender : ${gender}</strong><br><br>

                        <div id="groomSection"  style="${gender == 'Male' ? '' : 'display:none'}">
                        <strong>Groom Details</strong>
                         <hr>
                        <strong>Date of Birth: ${dob}</strong><br>
                        <strong>Mother Tongue: ${motherTongue}</strong><br>
                        <strong>Religion: ${religion}</strong><br>
                        <strong>Marital Status: ${maritalStatus}</strong><br>
                        <strong>Height: ${height}</strong><br>
                        </div>

                        <div id="brideSection"  style="${gender == 'Female' ? '' : 'display:none'}">
                        <strong>Bride Details</strong>
                            <hr>
                        <strong>Date of Birth: ${dob}</strong><br>
                        <strong>Mother Tongue: ${motherTongue}</strong><br>
                        <strong>Religion: ${religion}</strong><br>
                        <strong>Marital Status: ${maritalStatus}</strong><br>
                        <strong>Height: ${height}</strong><br>
                        </div>

            </p>

            <a href="matrimonyForm" class="btn btn-primary">Submit Another Form</a>
        </div>
    </div>
</div>

</body>
</html>
