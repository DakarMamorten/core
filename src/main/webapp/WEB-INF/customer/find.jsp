<%--
  Created by IntelliJ IDEA.
  User: Sergey Manko
  Date: 1/4/2022
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>       1
<head>
    <title>Find customer by id</title>
</head>
<body>
<p>Find by customer id</p>
<table>
    <thead>
    <tr>
        <td><td>${customer.customerId}</td>
        <td>${customer.storeId}</td>
        <td>${customer.firstName}</td>
        <td>${customer.lastName}</td>
        <td>${customer.email}</td>
        <td>${customer.addressId}</td>
        <td>${customer.activebool}</td>
        <td>${customer.createDate}</td>
        <td>${customer.lastUpdate}</td>
        <td>${customer.active}</td></td>
    </tr>
    </thead>
</table>
<div>
    <form action="${pageContext.request.contextPath}/customer/find" method="post">
        <label for="customerId">Customer Id:</label>
        <input type="text" id="customerId" name="customerId"><br><br>
        <button type="submit">Find</button>
    </form>
</div>
</body>
</html>
