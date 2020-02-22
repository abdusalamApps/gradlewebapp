<%@ page import="java.util.List" %>
<%@ page import="models.AllInfoRow" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Info</title>
    <link rel='stylesheet' type='text/css' href='main.css'>
</head>
<body>
<div class="container">
    <h1>All Content in the Database</h1>
    <table class="mdc-data-table">
        <tr>

            <%
                String[] heads = (String[]) request.getAttribute("heads");
                for (String head : heads) {
            %>
            <th>
                <%= head %>
            </th>
            <%
                }

            %>
        </tr>

        <%
            List<AllInfoRow> rows = (List<AllInfoRow>) request.getAttribute("rows");
            for (AllInfoRow row : rows) {
        %>
        <tr>
            <td><%= row.name %>
            </td>
            <td><%= row.answer00 %>
            </td>
            <td><%= row.answer01 %>
            </td>
            <td><%= row.answer11 %>
            </td>
            <td><%= row.answer12 %>
            </td>
            <td><%= row.answer13 %>
            </td>
            <td><%= row.answer14 %>
            </td>
        </tr>
        <%
            }

        %>
    </table>
</div>
</body>
</html>