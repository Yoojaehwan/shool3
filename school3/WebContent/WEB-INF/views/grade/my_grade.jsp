<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../global/header.jsp"/>
<div class="mg_auto" style="width:1000px">
	<div class="my_gradeTop">
			<h2 class="text-center">나의 성적표</h2>
		</div>
		
   <table>
      <tr>
         <td>과목</td>
         <td>점수</td>
      </tr>
      <tr>
         <td>java</td>
         <td><input type="text" name="java" value ="${score.java}" /></td>
      </tr>
      <tr>
         <td>jsp</td>
         <td><input type="text" name="jsp"  value ="${score.jsp}"/></td>
      </tr>
      <tr>
         <td>spring</td>
         <td><input type="text" name="spring"  value ="${score.spring}"/></td>
      </tr>
      <tr>
         <td>sql</td>
         <td><input type="text" name="sql"  value ="${score.sql}"/></td>
      </tr>
   </table>
</div>

   <form action="${context}/global/main.do">
      <input type="submit" value="로그아웃" />
   </form>
<jsp:include page="../global/footer.jsp"/>