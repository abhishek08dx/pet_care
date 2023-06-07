<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-image:url("https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
backgroun-size:cover;
background-poition:center;
height:100vh;
width:100%;
font-family: Arial, Helvetica, sans-serif;
opacity:1;
}
h3{
	color:red;
	font-size:2.5em;
	margin-top:10vh;
	style:arieal;
	}
.idx{
	bacground-color:red;
	font-size:1em;
    margin-top:-25vh;
    margin-left:190vh;
    }
    nav{
    font-size:1.5em;
  background-color:white;
  width:75px;
  }
    	
			

form{
margin:left;}
h1{
color:yellow;
}
h2{
color:red;}
.int{
background-color=green;
color:white;}</style>
<meta charset="UTF-8">
<title>succesfully logined</title>
</head>
<body><h1>welcome to our offical booking page</h1>
<h2>Enter the avaliable token number you want to book</h2>
<div><form action="booked" method="post">
UserName=<input type="text" placeholder="username" name="tnam" id="tn">
Token number=<input type="text" placeholder="Token number"name="token" id="to">
<input type="submit" placeholde="submit" name=sub></form><br><br>
		<form action="opp2"  method="post"><button type="submit">To see the token slot</button>
</div>
<div class="idx">
<nav>
<a href ="NewFile1.jsp"> Logout</a>
</nav>
</div>
</body>
</html>