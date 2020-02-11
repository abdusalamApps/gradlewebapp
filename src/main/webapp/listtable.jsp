<%--
  Created by IntelliJ IDEA.
  User: abdusalamyabrak
  Date: 2020-02-11
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel='stylesheet' type='text/css' href='main.css'>
    <title>Title</title>
</head>
<body>
<h1>All Content in the Database</h1>
<div class="container">
    <table>
        <tr>

            <%
                String[] heads = (String[]) request.getAttribute("heads");
                for (String head : heads) {
            %>
            <th><%= head %>
            </th>
            <%
                }

            %>
        </tr>
    </table>
</div>
</body>
</html>
