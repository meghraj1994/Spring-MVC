<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>

<!DOCTYPE html >
   <html lang="en">
       <meta charset="utf-8"/>

       <head>
           <title>student formpage</title>
       </head>
       <body>
            <form:form action="procesform" modelAttribute= "student">
                      First Name <form:input path="firstName"/>  <br><br>
                      Last Name  <form:input path="lastName"/> <br><br>
                      
                      Country :
                      <form:select path="country">
                      <form:option value="India" lable="India"/>
                      <form:option value="Nepal" label="Nepal"/>
                      <form:option value="America" label="America"/>
                      <form:option value="Germany"  label="Germany"/>
                      </form:select>  <br><br>
                      Favorite Language :
                      Java :<form:radiobutton path="favouriteLanguage" value="Java"/> 
                      C# <form:radiobutton path="favouriteLanguage" value="C#"/>
                      PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
                      Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/> <br><br>
                      <input type = "submit" value="submit" />
                      
 
            </form:form>
         
       </body>

</html>