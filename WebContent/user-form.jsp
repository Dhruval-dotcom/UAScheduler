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
#buttonsave{
	background-color:cyan;
	color:black;
	padding:5px 10px;
	border:none;
	border-radius:4px;
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
  <c:if test="${user != null}">
   <form action="update" method="post">
        </c:if>
        <c:if test="${user == null}">
   <form action="insert" method="post">
        </c:if>
        <table border="" cellpadding="5">
            <caption>
             <h2>
              <c:if test="${user != null}">
               Edit Activity
              </c:if>
              <c:if test="${user == null}">
               Add New Activity
              </c:if>
             </h2>
            </caption>
          <c:if test="${user != null}">
           <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
          </c:if>            
            <tr>
                <th>Time: </th>
                <td>
                 <input type="text" name="time" size="45"
                   value="<c:out value='${user.time}' />"
                  />
                </td>
            </tr>
            <tr>
                <th> Activity: </th>
                <td>
                 <input type="text" name="act" size="45"
                   value="<c:out value='${user.act}' />"
                 />
                </td>
            </tr>
            <tr>
             <td colspan="2" align="center">
              <input id="buttonsave" type="submit" value="Save" />
             </td>
            </tr>
        </table>
        </form>
        </form>
    </div> 
</body>
</html>