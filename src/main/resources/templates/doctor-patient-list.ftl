<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <#list patients_list as patient>
        <tr>
            <td><a href="/doctor/${doctor.passport}/all_patients/${patient.passport}">${patient.surname + " " + patient.name + " " + patient.patronymic}</td>
        </tr>
    </#list>

</body>
</html>