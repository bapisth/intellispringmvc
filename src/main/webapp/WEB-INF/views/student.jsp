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
    <script type="text/javascript" src="/webjars/jquery/3.2.1/dist/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/3.3.7/dist/js/bootstrap.min.js"></script>
    <link type="text/css" rel="stylesheet" href="/webjars/bootstrap/3.3.7/dist/css/bootstrap.min.css"/>
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
            <form:form cssClass="form-group" modelAttribute="student" action="processForm">
                <div class="form-group">
                    <label for="firstName">First Name:</label>
                    <form:input type="text" class="form-control" id="firstName" path="firstName"/><form:errors path="firstName"></form:errors>
                </div>
                <div class="form-group">
                    <label for="lastName">Last Name:</label>
                    <form:input type="text" class="form-control" id="lastName" path="lastName"/><form:errors path="lastName"></form:errors>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <form:input type="password" class="form-control" id="password" path="password"/><form:errors path="password"></form:errors>
                </div>
                <div class="form-group">
                    <label for="phone">Password:</label>
                    <form:input type="text" class="form-control" id="phone" path="phone"/><form:errors path="phone"></form:errors>
                </div>

                <button type="submit" class="btn btn-default">Submit</button>
            </form:form>
        </div>
    </div>
</body>
</html>
