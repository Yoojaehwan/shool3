<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>
<form action="member/" >
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" name ="id" size="30" autofocus required="required"/></td>
	</tr>
	<tr>
		<td>java</td>
		<td><input type="text" name="java" size="30" maxlength ="15" required="required"/></td>
	</tr>
	<tr>
		<td>jsp</td>
		<td><input type="text" name="jsp" size="30" maxlength ="15" required="required"/></td>
	</tr>
	<tr>
		<td>sql</td>
		<td><input type="text" name = "sql" size="30" required="required"/></td>
	</tr>
	<tr>
		<td>spring</td>
		<td><input type="text" name = "spring" size="30" required="required"/></td>
	</tr>
</table>
	<div>
	<input type="submit" value="추가" />
	</div>
</form>

	<jsp:include page="../global/footer.jsp" />
</div>