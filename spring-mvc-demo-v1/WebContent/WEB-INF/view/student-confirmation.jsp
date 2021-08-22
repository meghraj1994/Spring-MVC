<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
 This Student is confirmed : ${student.firstName} ${student.lastName}  <br><br>
 You have selected Country : ${student.country} and your Favorite Programming Language is ${student.favouriteLanguage} <br><br>
 Your Operating System is : 
 <ul>
 <c:forEach var="temp" items="${student.operatingSystems}">
 <li>${temp}</li>
 </c:forEach>
 </ul>

<br><br>
  <a href="showForm">Goto Form</a>

</body>
</html>