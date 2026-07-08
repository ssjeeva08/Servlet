# Login Authentication using RequestDispatcher and Cookies

## Objective
To develop a Java Servlet application that authenticates users using RequestDispatcher and Cookies.

## Tools Used
- Java
- HTML
- Servlet (Jakarta EE)
- Apache Tomcat 10
- Eclipse IDE

## Files
- login.html
- LoginServlet.java
- AdminServlet.java
- UserServlet.java

## Working
1. User enters Email and Password.
2. LoginServlet receives the request.
3. If the email is **administrator@kce.ac.in**, it forwards the request to **AdminServlet**.
4. Otherwise, it creates a Cookie and forwards the request to **UserServlet**.

## Output
- **Admin:** Welcome to Admin Page
- **User:** Welcome to Customer Page
