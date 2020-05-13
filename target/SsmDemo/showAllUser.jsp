<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<table cellpadding='0' cellspacing='0' align="center" border='1' width="80%">
			<c:forEach var="user" items="${requestScope.users }">
				<tr>
					<td>${user.id }</td>
					<td>${user.name }</td>
					<td>${user.password }</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>