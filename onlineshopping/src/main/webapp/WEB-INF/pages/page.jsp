<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>





<!DOCTYPE html>
<html lang="en">

<c:set var="contextRoot" value="${pageContext.request.contextPath}" ></c:set>
<spring:url var="homeCss" value="/resources/css"></spring:url>
<spring:url var="bootCss" value="/resources/vendor/bootstrap/css"></spring:url>
<spring:url var="bootJs" value="/resources/vendor/bootstrap/js"></spring:url>
<spring:url var="js" value="/resources/vendor/jquery"></spring:url>


<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${bootCss}/bootstrap.min.css" rel="stylesheet">

<!-- another readable therem core CSS -->
<link href="${bootCss}/bootstrap.reabable.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<script>
   window.menu = '${title}';
</script>


</head>

<body>

<div class="wrapper">

	<!-- navigation bar Content -->
<%@ include file="./commonApp/navbar.jsp" %>

	<div class="content">
	<!-- /.container -->
	<c:if test="${userClickHome == true}">
       <%@ include file="./commonApp/content.jsp" %>
    </c:if>
    
    <c:if test="${userClickAbout == true}">
      <h1>this dispalyed</h1>
       <%@ include file="about.jsp" %>
    </c:if>
    
    <c:if test="${userClickContact == true}">
    <h1>this dispalyed</h1>
       <%@ include file="contact.jsp" %>
    </c:if>
    </div>

<%@ include file="./commonApp/footer.jsp" %>
	

</div>

	<!-- Bootstrap core JavaScript -->
	<script src="${bootJs}/jquery.min.js"></script>
	<script src="${bootJs}/bootstrap.bundle.min.js"></script>
		<script src="${bootJs}/myapp.js"></script>

</body>

</html>
