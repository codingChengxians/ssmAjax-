<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<title>用户列表</title>
<link href="${pageContext.request.contextPath }/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/vendor/jquery/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/vendor/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>

	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1></h1>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<a class="btn btn-primary" href="${pageContext.request.contextPath }/toAddUser">新增</a>
			</div>
		</div>
		<!-- 表格  -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>id</th>
						<th>用户名</th>
						<th>密码</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${list.users }" var="user">
						<tr>
							<td>${user.id}</td>
							<td>${user.username }</td>
							<td>${user.password }</td>
							<!-- <td><a  class="edit">编辑</a> <a
                                 class="delete">删除</a></td> -->
							<td><a type="button"
								href="${pageContext.request.contextPath }/user/getUser?id=${user.id}"
								class="btn btn-info btn-sm"> <span
									class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									编辑
							</a> <a type="button" href="${pageContext.request.contextPath }/user/delUser?id=${user.id}"
								class="btn btn-danger btn-sm"> <span
									class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除
							</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>