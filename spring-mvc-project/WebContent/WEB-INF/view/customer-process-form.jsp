<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
   <html lang="en">
       <meta charset="utf-8"/>

       <head>
           <title>Customer process  form</title>
             
       </head>
       <body>
         <h2>Please confirm you details before saving</h2>
        <strong>The confirmed customer is ${customer.firstName}  ${customer.lastName}</strong> <br><br>
         <strong>Available Pass is : ${customer.freePass}</strong> <br><br>
        <strong> Postal Code is : ${customer.postalCode} </strong><br><br>
        <a href="showForm">Form Page</a>
        
       </body>

</html>