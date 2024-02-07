<!-- 화면에 문구가 재대로 뿌려지도록 도움을 주는 문구기 때문에
     아래 구문을 append로 작성할 시 모든 문구가 text 형태로 화면에 뿌려진다.
-->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1 align="center">Respose</h1>
    <!-- ul>(li>a)*3 = ul>li>a를 3개 만듬 -->
    <ul>
        <li><a href="response">응답 확인하기</a></li>
        <li><a href="header">응답 헤더 확인하기</a></li>
        <li><a href="status">응답 상태 코드 확인하기</a></li>
    </ul>

</body>
</html>