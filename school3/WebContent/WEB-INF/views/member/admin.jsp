<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<jsp:include page="../global/header.jsp"/>
<img src="${context}/resources/image/main/hanbit.jpg" alt="" width="100%" height="400px"/>
<div class="my_gradeTop">
			<h2 class="text-center">관리자 페이지</h2>
		</div>


<br />
<div style="margin-left: 43.5%;">
   <h4><a href="${context}/grade/grade_add.do"> 성적관리 추가</a><h4>
   <h4><a href="${context}/grade/grade_list.do">성적관리 리스트</a><h4>
</div>
<jsp:include page="../global/footer.jsp" />
