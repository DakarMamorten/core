<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Address</title>
</head>
<body>
<p>List of address</p>
<form action="${pageContext.request.contextPath}/address/delete" method="post">
    <table border="1">
        <thead>
        <th></th>
        <th>AddressId</th>
        <th>Address</th>
        <th>Address2</th>
        <th>District</th>
        <th>CityId</th>
        <th>PostalCode</th>
        <th>Phone</th>
        <th>LocalDateTime</th>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.address}" var="item">
            <tr>
                <td><input type="radio" id="radioButton" name="addressId" value="${item.addressId}"/></td>
                <td>${item.addressId}</td>
                <td>${item.address}</td>
                <td>${item.address2}</td>
                <td>${item.district}</td>
                <td>${item.cityId}</td>
                <td>${item.postelCode}</td>
                <td>${item.phone}</td>
                <td>${item.lastUpdate}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <button type="submit">Delete</button>
    <div class="paginator" >
        <a class="prev disabled" href="/dvd-rental/address">&laquo;</a>
        <c:forEach begin="1" end="${requestScope.pages}" step="1" varStatus="loop">
            <a class="current" href="${pageContext.request.contextPath}/address/page?pageNumber=${loop.index}">${loop.index}</a>
        </c:forEach>
        <a class="next" href="/dvd-rental/address">&raquo;</a>
    </div>
</form>
</body>
</html>
