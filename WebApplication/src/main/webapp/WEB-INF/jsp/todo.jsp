<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
    <title>First Web Application</title>
    <link href="webjars/bootstrap/5.1.1/css/bootstrap.min.css"
          rel="stylesheet">

</head>

<body>
<div class="container">



    
    <%--@elvariable id="todo" type=""--%>
    <form:form method="post" commandName="todo">
        <form:hidden path="id"/>
        <fieldset class="form-group">
            <form:label path="course">Course</form:label>
            <form:input path="course" type="text"
                        class="form-control" required="required"/>
            <form:errors path="course" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="form-group">
            <form:label path="targetDate">Target Date</form:label>
            <form:input path="targetDate" type="text" class="form-control"
                        required="required" />
            <form:errors path="targetDate" cssClass="text-warning" />
        </fieldset>

        <button type="submit" class="btn btn-success">Add</button>
    </form:form>
</div>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.1/js/bootstrap.min.js"></script>
<script
        src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
<script>
    $('#targetDate').datepicker({
        format : 'dd/mm/yyyy'
    });
</script>

</body>

</html>
