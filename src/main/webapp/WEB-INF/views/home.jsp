<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 11-06-2017
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>welcome home</title>
    <script type="text/javascript" src="webjars/jquery/3.2.1/dist/jquery.min.js"></script>
    <script type="text/javascript" src="webjars/bootstrap/3.3.7/dist/js/bootstrap.min.js"></script>
    <link type="text/css" rel="stylesheet" href="webjars/bootstrap/3.3.7/dist/css/bootstrap.min.css"/>
</head>
<body>
    <h1>Welcome Home</h1>
    <div class="container"><br/>
        <div class="alert alert-success">
            <strong>Success!</strong> It is working as we expected.
        </div>
    </div>
    <div class="row">
        <div class="col-sm-offset-4 col-sm-4">
            <a href="student/showForm">Student Form</a>
        </div>
    </div>
</body>
</html>
