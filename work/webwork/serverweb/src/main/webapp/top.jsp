<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>serverweb main</title>
  <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="">자바나라</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="/serverweb/index.jsp">Home</a></li>
      <!--   <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">서블릿basic <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul>
        </li> -->
        <li><a href="#">서블릿 basic</a></li>
        <li><a href="#">JSP basic</a></li>
        <li><a href="#">부서관리</a></li>
        <li><a href="/serverweb/member/mvc/list">인사관리</a></li>
        <li><a href="#">고급기능</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <%-- <%if(loginUser==null){ %> --%>
        <li><a href="/serverweb/member_mvc/register.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="/serverweb/member/mvc/login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <%-- <%}else{ %> --%>
        <li><a href="/serverweb/member/mvc/login.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      	<%-- <%}%> --%>
      </ul>
    </div>
  </div>
</nav>
  


</body>
</html>