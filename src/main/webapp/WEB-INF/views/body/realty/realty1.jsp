<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script	src="https://cdn.jsdelivr.net/npm/chart.js@3.7.1/dist/chart.min.js"></script>
<link rel="stylesheet" href="/static/css/tiles.css">
<link rel="stylesheet" href="/static/css/realty/on_off.css" />
<title>realty_body</title>
</head>

<body>
	<script>
		$(document).ready(function(){
			let buyingStat = ${buyingStat };
			let rentStat = ${rentStat };
			let jeonseStat = ${jeonseStat };
			
			chart(buyingStat, rentStat, jeonseStat);
		});
	</script>

	<h1>연도별 실거래가 통계 </h1>

	<label for="buying">
		<input type="radio" name="seType" id="buying" value="buying-container" checked />
		매매 평균 
	</label>
	<label for="rent">
		<input type="radio" name="seType" id="rent" value="rent-container" />
		월세 평균 
	</label>
	<label for="jeonse">
		<input type="radio" name="seType" id="jeonse" value="jeonse-container" />
		전세 보증금 평균  
	</label>
	
	<div id="all-chart-div">
		<!--  -->
		<div id="buying-container" class="on">
			<canvas id="chart-buying"></canvas>
		</div>
		
		<!--  -->
		<div id="rent-container" class="off">
			<label for="rtfe">
				<input type="radio" name="avg" id="rtfe" value="rtfe-chart" checked />
				월세 통계 
			</label>
			<label for="grfe">
				<input type="radio" name="avg" id="grfe" value="grfe-chart" />
				보증금 통계 
			</label>
			
			<div id="rtfe-chart" class="on">
				<canvas id="chart-rent-rtfe"></canvas>
			</div>
			<div id="grfe-chart" class="off">
				<canvas id="chart-rent-grfe"></canvas>	
			</div>
		</div>
		
		<!--  -->
		<div id="jeonse-container" class="off">
				<canvas id="chart-jeonse"></canvas>	
		</div>
	</div>
	<script src="/static/js/realty/realty_body1.js"></script>
	<script src="/static/js/realty/realty_navbar.js"></script>
</body>
</html>
