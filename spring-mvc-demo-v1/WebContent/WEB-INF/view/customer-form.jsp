<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
   <html lang="en">
       <meta charset="utf-8"/>

       <head>
           <title>Customer Registration form</title>
             <style>
           .error {color :red}
             </style>
       </head>
       <body>
       <i>Fill out the form. Asterisk (*) means required</i>
       <h2>Customer Registration Form</h2>
       <form:form action="procesform" modelAttribute="customer">
         First Name : <form:input path="firstName"/> <br><br>
         
         <!-- display error when last name is empty or less than 1 char -->
       Last Name (*) : <form:input path="lastName"/>
       <form:errors path="lastName" cssClass= "error"/> <br><br>
       
       <!-- Display error when freePass is less or greater than 10 -->
       Free Pass (*) :<form:input path="freePass"/>
       <form:errors path="freePass" cssClass="error"/> <br><br>
       
       <!-- Display error for postal code if formate is not correct regex -->
       Postal Code (*) : <form:input path="postalCode"/>
       <form:errors path="postalCode" cssClass="error"/> <br><br>
       
        <input type="submit" value="submit"/>
       </form:form> <br><br>
       
      
            
         
       </body>

</html>