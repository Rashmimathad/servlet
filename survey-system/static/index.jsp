<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forms</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand " href="index.jsp"><b>Home</b></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active " href="SurveyForm.jsp"><b>Survey Form</b></a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container text-center mt-5">
    <h1 class="mb-4">Available Forms</h1>
    <p class="lead">Choose a form below to continue:</p>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-5">
                <a href="SurveyForm.jsp" class="btn btn-outline-primary w-100 mb-3">Survey Form</a>

            </div>
        </div>
    </div>
</div>

</body>
</html>
