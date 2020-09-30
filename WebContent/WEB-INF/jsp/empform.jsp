<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmpFORm</title>
</head>
<body>
<h1>Add New Employee</h1>  
       <form:form method="GET" action="/Employees/save" commandName="command">    
        <table >    
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
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>