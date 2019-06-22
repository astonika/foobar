<%@page import="java.util.Enumeration"%>
<%@page import="java.util.List"%>
<%@page import="com.company.project.model.*"%>
<%@page import="com.company.project.util.*"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	Page<Record> pageData = (Page<Record>) request.getAttribute("page");
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8 /">
<!-- <meta http-equiv="refresh" content="600; url=http://localhost:8080/foobar" /> -->
<style>
* {
	background-color: black;
	color: white;
	font-size: small;
}
</style>

<script>
	
</script>
<title>AONE</title>
</head>
<body>
	<table>
		<!-- 		<thead> -->
		<!-- 			<tr> -->
		<!-- 				<td>监测时间&nbsp;</td> -->
		<!-- 				<td>SO2</td> -->
		<!-- 				<td>NOx</td> -->
		<!-- 				<td>烟尘</td> -->
		<!-- 				<td>O2</td> -->
		<!-- 				<td>烟气温度</td> -->
		<!-- 				<td>流速</td> -->
		<!-- 				<td>废气排放量</td> -->
		<!-- 			</tr> -->
		<!-- 		</thead> -->
		<tbody>
			<%
				if (pageData != null) {
					if (pageData.getRows() != null) {
						for (Record record : pageData.getRows()) {
			%>
			<!-- 				"DateTime":"2018-03-17 

01:02","rownum":1,"val_201":"0","cvt_201":"0","stand_201":"300","state_201":"0","ex_201":"0","val2_201":"0","val_203":"235",

"cvt_203":"231","stand_203":"300","state_203":"0","ex_203":"0","val2_203":"235","val_207":"-25.000","cvt_207":"-

24.194","stand_207":"30","state_207":"0","ex_207":"0","val2_207":"-

25.000","val_209":"14.9","cvt_209":"","stand_209":null,"state_209":"0","ex_209":"0","val2_209":"14.9","val_210":"18646","cvt

_210":"","stand_210":null,"state_210":"0","ex_210":"0","val2_210":"18646","val_211":"","cvt_211":"","stand_211":"","state_21

1":"","ex_211":"","val2_211":"","val_525":"45.2","cvt_525":"","stand_525":null,"state_525":"0","ex_525":"0","val2_525":"45.2

" -->
							<td><%= record.getSubName() %></td>
			<tr>
				<td><%=record.getDateTime()%></td>
			</tr>
			<tr>
				<td>二氧化硫</td>
				<td><%=record.getCvt_201()%></td>
			</tr>
			<tr>
				<td>氮氧化物</td>
				<td><%=record.getCvt_203()%></td>
			</tr>
			<tr>
				<td>烟尘</td>
				<td><%=record.getCvt_207()%></td>
			</tr>
			<tr>
				<td>氧气</td>
				<td><%=record.getVal_209()%></td>
			</tr>
			<tr>
				<td>总排放量</td>
				<td><%=record.getVal_210()%></td>
			</tr>
			<%
				}
					}
				}
			%>
		</tbody>
	</table>
</body>
</html>