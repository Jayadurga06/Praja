<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employees</title>
</head>
<body>
<h1>Edit Employee</h1>  
       <form:form method="GET" action="/Employees/editsave">    
        <table >    
        <tr>  
        <td>ID :</td>    
         <td><form:input  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="ename"  /></td>  
         </tr>    
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="edes" /></td>  
         </tr>   
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="sal" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>