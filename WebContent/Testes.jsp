<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<title>Pagina de Testes</title>
<script>
	function funcaozinha() {
		var valorSelect = document.getElementById("idSelect").value;
		window.location.replace("Testes.jsp?valorSelect=" + valorSelect);
		alert(window.location.href);
	}
</script>
</head>
<body>
	<form>
		<select id="idSelect" onChange="funcaozinha();">
			<c:choose>
				<c:when test="${param.valorSelect == null }">
					<option value="" selected>Selecione</option>
				</c:when>
				<c:otherwise>
					<option value="">Selecione</option>
				</c:otherwise>
			</c:choose>
			<c:forEach var="cliente" items="${bancoCliente.getBanco() }"
				varStatus="i">
				<c:choose>
					<c:when test="${param.valorSelect == i.index }">
						<option value="${i.index}" selected>${cliente.getNome() }</option>
					</c:when>
					<c:otherwise>
					<option value="${i.index}">${cliente.getNome() }</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select> <input type="text" id="idInput" value="" style="display:">
	</form>
</body>
</html>