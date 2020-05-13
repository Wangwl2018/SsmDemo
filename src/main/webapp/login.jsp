<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<html>
  <body>
   <!--
    <form method="post" action="${pageContext.request.contextPath }/paramadv/param3.do">
   -->
     <form method="post" action="${pageContext.request.contextPath }/user/login.do">
    
       UserName<input type="text" name="name"/><br/>
       UserPassword<input type="text" name="password"/><br/>
       <input type="submit" value="login"/>
    </form>
  </body>
</html>