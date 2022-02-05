<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Customer</title>
</head>
<body>
<p>Add Customer</p>
<div>
    <form action="${pageContext.request.contextPath}/customer/add" method="post">
        <label for="storeID">StoreId</label>
        <input type="text" id="storeID" name="store"><br><br>
        <label for="firstName">First Name</label>
        <input type="text" id="firstName" name="firstName"><br><br>
        <label for="lastName">Last Name</label>
        <input type="text" id="lastName" name="lastName"><br><br>
        <label for="email">Email</label>
        <input type="text" id="email" name="email"><br><br>
        <label for="addressId">Address id:</label>
        <input type="text" id="addressId" name="addressId"><br><br>
        <label for="activebool">Activebool:</label>
        <input type="text" id="activebool" name="activebool"><br><br>
        <label for="active">Active:</label>
        <input type="text" id="active" name="active"><br><br>
        <button type="submit">Add</button>
    </form>
</div>
</body>
</html>
