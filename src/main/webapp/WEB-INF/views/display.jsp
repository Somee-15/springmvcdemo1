<%@ page isELIngnored="false" %>
 <html>
 <body>
 <h2>Hello World!</h2>
 <p>My name is aman bathla</p>

 Welcome to Stackroute <%= request.getAttribute("name")
  %>

<c:forEach var="name" items="${name}">
Name:  ${request.key} <br/>
Value: ${request.value} <br/>
</c:forEach>

 </body>
 </html>
