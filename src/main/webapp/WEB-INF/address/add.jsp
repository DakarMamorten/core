<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Address</title>
</head>
<body>
<p>Add address</p>
<div>
    <form action="${pageContext.request.contextPath}/address/add" method="post">
        <label for="address">Address:</label>
        <input type="text" id="address" name="address"><br><br>
        <label for="address2">Address2:</label>
        <input type="text" id="address2" name="address2"><br><br>
        <label for="district">District:</label>
        <input type="text" id="district" name="district"><br><br>
        <label for="cityId">CityId:</label>
        <input type="text" id="cityId" name="cityId"><br><br>
        <label for="postalCode">PostalCode:</label>
        <input type="text" id="postalCode" name="postalCode"><br><br>
        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone"><br><br>
        <button type="submit">Add</button>
    </form>
</div>
</body>
</html>
