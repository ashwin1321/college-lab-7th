<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Result Page</title>
    </head>

    <body>
        <h2>Student Information</h2>
        <p>Student Name: <%= request.getParameter("studentName") %>
        </p>
        <p>Student Roll: <%= request.getParameter("studentRoll") %>
        </p>
        <p>Student Address: <%= request.getParameter("studentAddress") %>
        </p>
    </body>

    </html>