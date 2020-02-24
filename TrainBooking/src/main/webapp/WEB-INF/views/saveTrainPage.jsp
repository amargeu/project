<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body bgcolor="cyan">
<h3>Add train</h3>

<form action="saveTrain" method="post">

<table>
<tbody>

<tr>
<td> Train Name </td>
<td><input type="text" name="trainName"></td>
<td><h3 style="color:red;">${trainName}</h3></td>
</tr>

<tr>
<td> Train No. </td>
<td><input type="text" name="trainNo"></td>
<td><h3 style="color:red;">${trainNo}</h3></td>
</tr>

<tr>
<td> Train Type</td>
<td><input type="text" name="trainType"></td>
<td><h3 style="color:red;">${trainType}</h3></td>
</tr>

<tr>
<td> Train Fair</td>
<td><input type="text" name="trainFare"></td>
<td><h3 style="color:red;">${trainFare}</h3></td>
</tr>

<tr>
<td> Starting Point</td>
<td><input type="text" name="startingPoint"></td>
<td><h3 style="color:red;">${startingPoint}</h3></td>
</tr>

<tr>
<td> Train Destination</td>
<td><input type="text" name="destinationPoint"></td>
<td><h3 style="color:red;">${destinationPoint}</h3></td>
</tr>

<tr>
<td><input type="submit" value="add Train"></td>
</tr>

</tbody>
</table>

</form>

<h3 style="color:red;">${msg}</h3>


</body>
</html>