<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${patient.surname}</title>
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


       <a href="/admin/all_patients">To Patients List</a>
       <a href="/admin/all_patients/${patient.id}/update">Update information</a>
       <a href="/admin/all_patients/${patient.id}/delete">Delete patient</a>
</body>
</html>