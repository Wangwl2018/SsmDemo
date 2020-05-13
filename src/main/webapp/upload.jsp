<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<html>
  <body>
     <form method ="post" action="${pageContext.request.contextPath}/upload/upload.do" enctype ="multipart/form-data" >
     	<input type = "file" name = "uploadFile"><br>
     	<input type="submit" value= "upload"/>
     </form>
  </body>
</html>