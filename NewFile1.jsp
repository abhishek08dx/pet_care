<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><absolute-ordering></absolute-ordering>

<title>Abhi Pets Care-Best vetinary hospital in vriddhachalam</title>
<link rel="stylesheet" href="newfile.jsp">
<link rel="stylesheet" href="css/style.css">
<style>
@charset "UTF-8";
:root{
	--yellow:C07F00;
	
}
body{
background-image:url("https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
backgroun-size:cover;
background-poition:center;
height:100vh;
width:100%;
font-family: Arial, Helvetica, sans-serif;
opacity:1;
}

header a{
display:flex;
flex:3;
	text-decoration:none;
	color:FF0060;
	
	
}

header {
display:flex;
flex:2;
	color:white;
margin-top:10px;
font-size:1.2em;

}
#logo{
padding:10px;
font-size:3.5em;
color:white;
margin-left:25px;
font-style:times new roman;
font-family:serif;
}
nav{
display:flex;
	flex:1;
	color:white;
	padding;10px;
margin-top:25px;
}
nav a:hover{
	color:var(green);
}
nav a{
display:flex;
flex:1;
padding;10px;
margin-top:15px;
color:white;
}
.maintext{
display:flex;
flex-direction:column;
heigth:50vh;
justify-content:center;
padding:2em;
margin-top:4.5em;

	
}
.tagline1{
color:red;
font-size:4.5em;
font-weight:bolder;
width:100vh;
}
.tagline2{
color:yellow;
font-size:2.5em;}
.callus{
font-size:2em;
padding:10px;}
button{
background-color:green;
font-size:1em;
padding:10px;}
</style>
<!-- add icon libary -->
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.input container {
	display: -ms-flexbox;
	display: flex;
	width: 100%;
	margin-bottom: 10px;
}
/*body {
background-image:url("https://images.pexels.com/photos/214574/pexels-photo-214574.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
);
	font-family: Arial, Helvetica, sans-serif;
}*/
body{
{margin; 10px;padding; 10px,12px 10px;
	box-sizing: border-box;
	}
	}
	.inputbtn {
	background-color: dodgerblue;
	color: white;
	padding: 15px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}
.btn:hover {
	opacity: 1;
}
.btn {
	background-color: dodgerblue;
	color: white;
	padding: 15px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}
.inputbtn:hover {
	opacity: 1;
}
.icon {
	padding: 10px;
	background: dodgerblue;
	color: white;
	min-width: 50px;
	text-align:center;

}
.int {
	width: 80%;
	padding: 10px;
	margin-top:15px;
	outline: none;
}
.int:focus {
	border: 3px solid dodgerblue;
}
h5{
margin-top:25vh;
font-size:10vh;
color:red;

background-color:black;
width:100%;
}
.loc{
margin-top:-5vh;
padding:10vh;
font-size:5vh;
color:yellow;
background-color:transparent;
oppacity:1em;}
.adm{
padding:10vh;
font-size:5vh;
color:yellow;}
#logo{
font-style:times new roman;
font-weigth:bold;}
</style>

</head>

<div class="landing">

<header>


<a href="index.html  class="logo" id="logo"> Abhi-Pets Care</a>

<nav>
<a href ="#loc1"> location</a>

<a href ="#ad1">Admin</a>
<a href ="">About us</a></nav>
</header>
<body>

<div class ="maintext">
<div class ="tagline1">
We Always give Our Best
</div>
<div class ="tagline2">
We Treat Every Animals As Humans
</div>
<div class ="callus">
call us @ 8870052885</div>
<div>
<a href="opp1.jsp">
		<button type="submit">Check-Oppoinment</button></a>
</div>
</div>
</div>
<form action="validate" method="post" onsubmit="return myfuction()"
			style="max-width: 500px;margin-left:850px;margin-top:-400px;margin-rigth:-100px;">
			<div class="input container">
				<i class="fa fa-user icon"></i>  <input class="int" type="text" placeholder="UserName" name="a"
					id="ab" required>
				</div>
			<div class="input container">
				<i class="fa fa-key icon"></i> 
	        <input class="int" type="password" placeholder="password" name="b" id="ba" required>
			</div><br><br>
			<div >
			 <button type="submit" class="inputbtn"> submit</button></div><br><br>
			 
</form>
		
<div style="max-width: 500px; margin-left: 850px;">
		<a href="newuser.jsp"><button type="submit" class="btn" >Register</button></a>
		</div><br><br>
	<div style="max-width: 500px; margin-left:850px">
		<a href="foguser.jsp">
		<button type="submit" class="btn">forgot-username/password</button></a>
		</div><br><br>
		<div style="max-width: 500px; margin-left:850px">
	 <a href="admin.jsp"><button type="submit" class="btn">Admin login</button>
			</a>
			</div>
			<section class="loc" id="loc1"><center>
			<footer><h5>Location</h5></center>
			No:42,Salem Main Road,<br>
			Vriddhachalam,<br>
			Cuddalore.
			Ph:8870052885,
			Email id:abhishek08dx@gmail.com;</footer></section>
			<section class="adm" id="ad1"><center>
			<h5>Admin</h5></center>
			Abhishek m k,<br>
			No:42,Salem Main Road,<br>
			Vriddhachalam,<br>
			Cuddalore.
			Ph:8870052885,
			Email id:abhishek08dx@gmail.com;<br>
			</section>
</body>
</html>