<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<script type="text/javascript">
    function addUser() {
        location.href = "user/toAddOrUpdateUser";
    }
</script>
</head>

<body>
    <form action="staff/login" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input name="id" /><br /></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password" /><br /></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录" /></td>
                <td><input type="button" value="注册" onclick="addUser();" /></td>
            </tr>
        </table>

    </form>

</body>

</html>