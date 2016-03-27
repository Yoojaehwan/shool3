<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <jsp:include page="../global/header.jsp"/> --%>
<div id="grade_add">
      <div class="grade_addTop">
         <h2 class="text-center">성적추가화면</h2>
      </div>
      <div class="grade_addCenter row">
         <form action="${context}/grade/grade_add.do"  name="admin_Form" class="form-horizontal">
            <fieldset class="joinField">
               <div class="form-group">
                   <label for="input_id" class="col-sm-4 control-label">아이디</label>
                   <div class="col-sm-4">
                     <input type="text" class="form-control" id="id" name="id" placeholder="아이디를 입력하세요"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="input_java" class="col-sm-4 control-label">JAVA</label>
                   <div class="col-sm-4">
                     <input type="text" class="form-control" id="java" name="java" placeholder="자바점수를 입력하세요"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="input_pw_check" class="col-sm-4 control-label">SQL</label>
                  <div class="col-sm-4">
                     <input type="text" class="form-control" name="jsp" id="jsp" placeholder="sql점수를 입력하세요"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="input_name" class="col-sm-4 control-label">JSP</label>
                   <div class="col-sm-4">
                     <input type="text" class="form-control" id="sql" name="sql" placeholder="jsp점수를 입력하세요"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="input_name" class="col-sm-4 control-label">SPRING</label>
                   <div class="col-sm-4">
                     <input type="text" class="form-control" id="spring" name="spring" placeholder="spring점수를 입력하세요"/>
                  </div>
               </div>
               <div class="input_button text-center">
                  <input type="submit" id="joinButton" class="btn btn-primary" value ="입력"/>
                  <input type="reset" id="cancleButton" class="btn btn-primary" value ="취소"/>
               </div>
            </fieldset>
         </form>
      </div>
   </div>
</body>
</html>