<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>All Users</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2>List of Users</h2>  
    <table>
        <tr>
            <td>First NAME</td>
            <td>Last Name</td>
            <td>Age</td>
            <td>emailID</td>
            <td>cell Number</td>
        </tr>
        <c:forEach items="${users}" var="Users">
            <tr>
            <td>${user.fname}</td>
            <td>${user.lname}</td>
            <td>${user.age}</td>
            <td>${user.emailid}</td>
            <td>${user.cellno}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New User</a>
</body>
</html>