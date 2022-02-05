<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><html>
<head>
    <title>Customer</title>
</head>
<body>
<p>List of Customer</p>
<form action="${pageContext.request.contextPath}/customer/delete" method="post">
    <table border=1>
        <thead>
        <th></th>
        <th>CustomerId</th>
        <th>StoreId</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>
        <th>AddressId</th>
        <th>Activebool</th>
        <th>CreateDate</th>
        <th>LocalDateTime</th>
        <th>Active</th>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.customer}" var="item">
            <tr>
                <td><input type="radio" name="customerId" value="${item.customerId}"></td>
                <td>${item.customerId}</td>
                <td>${item.storeId}</td>
                <td>${item.firstName}</td>
                <td>${item.lastName}</td>
                <td>${item.email}</td>
                <td>${item.addressId}</td>
                <td>${item.activebool}</td>
                <td>${item.createDate}</td>
                <td>${item.lastUpdate}</td>
                <td>${item.active}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <button type="submit">Delete</button>


<div>
    <a class="prev disabled" href="/dvd-rental/customer/list">&laquo;</a>
    <c:forEach begin="1" end="${requestScope.pages}" step="1" varStatus="loop">
        <a class="current" href="${pageContext.request.contextPath}/cusomer /page?pageNumber=${loop.index}">${loop.index}</a>
    </c:forEach>
    <a class="next" href="/dvd-rental/customer">&raquo;</a>

</div>
</form>
</body>
</html>
