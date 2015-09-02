<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>DF_USR_USER</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
<h2>사용자 목록</h2>
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="10%"/>
        <col width="15"/>
        <col width="*%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">user_no</th>
            <th scope="col">user_id</th>
            <th scope="col">user_name</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td>${row.USER_NO }</td>
                        <td>${row.USER_ID }</td>
                        <td>${row.USER_NAME }</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="3">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
         
    </tbody>
</table>
</body>
</html>
