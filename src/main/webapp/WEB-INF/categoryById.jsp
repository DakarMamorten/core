<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find by ID</title>
</head>
<body>
<p>Find by category ID</p>
    <table>
        <thead>
        </thead>
        <tbody>
            <tr>
                <td>${category.categoryID}</td>
                <td>${category.name}</td>
                <td>${category.lastUpdate}</td>
            </tr>
        </tbody>
    </table>
<div>

    <form action="${pageContext.request.contextPath}/category/find" method="post">
        <label for="categoryID">Category Id:</label>
        <input type="text" id="categoryID" name="categoryId"><br><br>
        <button type="submit">Find</button>
    </form>

</div>
</body>
</html>
