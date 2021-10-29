<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
           
   <h2 class="title">Employee Registration Form</h2>
               
   <form method="POST"> 
       
   <label> First Name</label>
   			<input type="text" name="first_name">
                                            
   <label class="label--desc">Last Name</label>
            <input class="input--style-5" type="text" name="last_name">
   
   <label class="last">Middle Name</label>
   			<input class="input--style-5" type="text" name="middle_name">              
                             
<br> 
                             
<label >Gender</label>
			<input type="radio" checked="checked" name="exist">
            <label>Male </label>  
            
            <input type="radio" name="exist">
            <label >Female </label> 
 
 <label for="start">Date</label>

<input type="date" id="start" name="trip-start"
       
       min="1950-01-01" max="2021-12-31">
 
                                
<label>Date of Birth</label>       
             <input type="text" placeholder="MM/DD/YYYY"  name="date">
                                            
<label>Active/Inactive</label>                      
            <select name="subject">   
            <option disabled="disabled" selected="selected">Choose option</option>
			<option>Active</option>
            <option>Inactive</option>                          
            </select>
            
<br>        
            
<button type="submit">Save</button>
<button type="submit">Reset</button>
                                             
</form>
       

</body>
</html>