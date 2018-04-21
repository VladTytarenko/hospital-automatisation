<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin</title>
</head>
<body>

    <a href="/admin/add_patient">Registrate new patient</a>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
            <#list patients_list as patient>
                    <tr>
                        <td>${patient.id}</td>
                        <td><a href="/admin/all_patients/${patient.id}">${patient.surname + " " + patient.name + " " + patient.patronymic}</td>
                    </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>