<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Actors</title>
</head>
<body>
<p>List of actors:</p>
<table border="1">
    <thead>
    <th>Name</th>
    <th>Age</th>
    </thead>
    <tbody>

    <c:forEach items="${requestScope.actors}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.age}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>

<div>
    <form action="${pageContext.request.contextPath}/actors" method="post">
        <label for="nameId">Name:</label>
        <input type="text" id="nameId" name="actorName"><br><br>
        <label for="ageId">Age:</label>
        <input type="text" id="ageId" name="actorAge"><br><br>
        <input type="submit">
    </form>
</div>

<%--<p style="color: cornflowerblue;font-size: x-large"><%=str%></p>--%>
</body>
</html>
