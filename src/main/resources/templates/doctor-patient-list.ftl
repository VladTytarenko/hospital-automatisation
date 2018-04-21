<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <#list patients_list as patient>
        <tr>
            <td>${patient.id}</td>
            <td><a href="/doctor/all_patients/${patient.id}">${patient.surname + " " + patient.name + " " + patient.patronymic}</td>
        </tr>
    </#list>

</body>
</html>