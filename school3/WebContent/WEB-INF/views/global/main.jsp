<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" />
<img src="${context}/image/main/hanbit.jpg" alt="" width="100%" height="400px"/>
<br />
<div style="margin-left: 43.5%;">
   <h4><a href="${context}/member/login_form.do"> 로그인 화면 이동</a><h4>
   <h4><a href="${context}/member/join_form.do">회원가입</a><h4>
   <h4><a href="${context}/admin/admin.do">관리자 이동</a></h4>
</div>
<jsp:include page="footer.jsp" />