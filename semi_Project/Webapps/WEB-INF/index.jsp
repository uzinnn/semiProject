<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<div class="weather">
		<div class=" Curricon"></div>
		<div class="CurrTemp"></div>
		<div class="City"></div>
	</div>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
	$(document).ready(function(){
		$.ajax({
			url	:"https://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=f2c423239c721d8f890b71f3a203b8ce&units=metric",
			dataType :"json",
			type:"GET",
			success:function(data){
				var $Icon = (data.weather[0].icon);
				var $Temp = Math.floor(data.main.temp)+'°';
				var $city = data.name;
				
				$('.Curricon').append('http://openweathermap.org/ing/wn/' + $Icon + '@2x.png');
				$('.CurrTemp').prepend($Temp);
				$('.City').append($city);
				
			}
		
		})
		
	});
	





</script>


</body>
</html>