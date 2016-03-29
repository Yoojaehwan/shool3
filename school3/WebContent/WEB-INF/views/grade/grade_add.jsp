<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<h3>${member.name}성적입력</h3>
<form>
	<table id="grade_add" style="width: 100%; margin-top: 30px">
		<tr style="background-color: yellow">
			<th style="text-align: center">Java</th>
			<th style="text-align: center">JSP</th>
			<th style="text-align: center">SQL</th>
			<th style="text-align: center">Spring</th>
		</tr>
		<tr>
			<td><input type="text" id="java" name="java" style="text-align: center" /></td>
			<td><input type="text" id="jsp" name="jsp" /></td>
			<td><input type="text" id="sql" name="sql" /></td>
			<td><input type="text" id="spring" name="spring" /></td>
		</tr>
		<tr>
			<td colspan="4">
				<button type="submit" id="grade_input">입력</button>
				<button type="reset" id="grade_cancle">취소</button>
			</td>
		</tr>
	</table>
</form>
<script>
	$(function() {
		$('#grade_input').click(
				function() {
					$('form').attr('action', '${context}/grade/add.do').attr(
							'method').submit();
				});
		$('#grade_cancle').click(
				function() {
					$('form').attr('action', '${context}/grade/reset.do').attr(
							'method').reset();
				})
	});
</script>