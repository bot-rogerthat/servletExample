<%@ page import="java.util.Date"%>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h1>
Hello, ${sessionScope.firstName} ${sessionScope.lastName} <%=new Date()%>.
</h1>
</body>
</html>