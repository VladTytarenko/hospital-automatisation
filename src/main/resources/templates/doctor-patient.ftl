<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    Registration number:<br>
    ${patient.id}<br>
    Surname:<br>
    ${patient.surname}<br>
    Name:<br>
    ${patient.name}<br>
    Patronymic:<br>
    ${patient.patronymic}<br>
    Passport:<br>
    ${patient.passport}<br>
    Address:<br>
    ${patient.address}<br>
    Email:<br>
    ${patient.email}<br>
    Birthdate:<br>
    ${patient.birthdate}<br>


    <a href="/docotor/all-patients/${patient.id}/recommendations">Recomendations</a>
    <a href="/docotor/all-patients/${patient.id}/add_recommendation">Add recomendation</a>
    <a href="/doctor/all_patients/${patient.id}/add_recipe">Add recipe</a>

</body>
</html>