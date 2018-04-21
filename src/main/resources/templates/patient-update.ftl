<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin</title>
</head>
<body>
    <form name="patient" action="/admin/all_patients/${patient.id}/update" method="post">
        <p>Registration number:</p>
        <input title="Registration-number" type="number" name="id" value="${patient.id}" disabled/>
        <p>Surname:</p>
        <input title="Surname" type="text" name="surname" value="${patient.surname}"/>
        <p>Name:</p>
        <input title="Name" type="text" name="name" value="${patient.name}"/>
        <p>Patronymic:</p>
        <input title="Patronymic" type="text" name="patronymic" value="${patient.patronymic}"/>
        <p>Passport:</p>
        <input title="Passport" type="text" name="passport" value="${patient.passport}"/>
        <p>Address:</p>
        <input title="Address" type="text" name="address" value="${patient.address}"/>
        <p>Email:</p>
        <input title="Email" type="email" name="email" value="${patient.email}"/>
        <p>Birthdate:</p>
        <input title="Birthdate" type="date" name="birthdate" value="${patient.birthdate}"/>
        <p>Invalidity:</p>
        <input title="Invalidity" type="text" name="invalidity" value="${patient.invalidity}"/>
        <p>Insurance Company:</p>
        <input title="Insurance-company" type="text" name="insuranceCompany" value="${patient.insuranceCompany}"/>
        <p>Insurance Policy Type:</p>
        <input title="Insurance-policy-type" type="text" name="insuranceType" value="${patient.insuranceType}"/>
        <p>Insurance Policy Number:</p>
        <input title="Insurance-policy-number" type="nuber" name="insuranceNumber" value="${patient.insuranceNumber}"/>
        <p>Registration date:</p>
        <input title="Registration-date" type="date" name="registrationDate" value="${patient.registrationDate}"/><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>