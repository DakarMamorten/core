<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find by ID</title>
</head>
<body>
<p>Find by address ID</p>
<table>
    <thead>
    </thead>
    <tbody>
    <tr>
        <td>${address.addressId}</td>
        <td>${address.address}</td>
        <td>${address.address2}</td>
        <td>${address.district}</td>
        <td>${address.cityId}</td>
        <td>${address.postelCode}</td>
        <td>${address.phone}</td>
        <td>${address.lastUpdate}</td>
    </tr>
    </tbody>
</table>
<div>

    <form action="${pageContext.request.contextPath}/address/find" method="post">
        <label for="addressId">Address Id:</label>
        <input type="text" id="addressId" name="addressId"><br><br>
        <button type="submit">Find</button>
    </form>

</div>
</body>
</html>
