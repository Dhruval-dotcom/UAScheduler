<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>User Activity Scheduler</title>
</head>
<style>
body{
background-color: rgba(135, 206, 250, 0.726);
}
tr{
	background-color: rgba(250, 46, 108, 0.726);
    color: rgb(255, 250, 242);
    border:none;
    border-radius:8px;
    margin:9px;
}
td,th{
	border:none;
}

</style>
<body>
 <center>
  <h1>User Activity Scheduler</h1>
        <h2>
         <a href="new">Add User Activity</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">List of Activity</a>
         
        </h2>
 </center>
    <div align="center">
        <table border="" cellpadding="5">
            <caption><h2>List of Activities</h2></caption>
            <tr>
                <th>ID</th>
                <th>Time</th>
                <th>Activity</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.time}" /></td>
                    <td><c:out value="${user.act}" /></td>
                    <td>
                     <a href="edit?id=<c:out value='${user.id}' />">Edit</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?id=<c:out value='${user.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div> 
</body>
</html>