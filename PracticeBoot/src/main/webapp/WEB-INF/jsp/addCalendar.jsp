<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
	 
    $(".date").datepicker({dateFormat:'yy-mm-dd'});
    
  }
  );
  </script>
<title>Insert title here</title>
</head>
<body>
	<form action="addCalendar" method="post">
	 일정 제목 : <input type="text" name="subject">
	 
	 시작일 : <input type="text" name="startDate" class="date">
	 
	 종료일 : <input type="text" name="endDate" class="date">
	 
	 </br>	<input type="submit">
	</form>
</body>
</html>