<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Daily Information</title>
	<link rel="stylesheet" type="text/css" href="css/view.css" media="all" />
	<script type="text/javascript" src="js/view.js"></script>
	<script type="text/javascript" src="js/calendar.js"></script>
</head>
<body id="main_body">

	<img id="top" src="img/top.png" alt="" />
	<div id="form_container">

		<h1>
			<a>Daily Information</a>
		</h1>
		
		<jsp:include page="menu_inc.jsp" />
		
		<form id="form_743549" class="appnitro" method="post" action="daily-info-save">
		
			<div class="form_description">
				<h2>Daily Information</h2>
				<p></p>
			</div>
			
			<ul>
				<li id="li_1">
					<label class="description" for="element_1">Date</label> 
					<span>
				 		<input id="element_1_3" name="dateCrisis" class="element text" size="10" maxlength="10" value="" type="text" />
						<label for="element_1_3">MM/DD/YYYY</label>
					</span>
					<span id="calendar_1"> 
						<img id="cal_img_1" class="datepicker" src="img/calendar.gif" alt="Pick a date." />
					</span> 
					<script type="text/javascript">
						Calendar.setup({
							inputField : "element_1_3",
							baseField : "element_1",
							displayArea : "calendar_1",
							button : "cal_img_1",
							ifFormat : "%B %e, %Y",
							onSelect : selectDate
						});
					</script>
				</li>
				
				<li id="li_2">
					<label class="description" for="element_2">Breakfast</label>
					<div>
						<textarea id="element_2" name="breakfast" class="element textarea small"></textarea>
					</div>
				</li>
				
				<li id="li_3">
					<label class="description" for="element_3">Lunch</label>
					<div>
						<textarea id="element_3" name="lunch" class="element textarea small"></textarea>
					</div>
				</li>
				
				<li id="li_4">
					<label class="description" for="element_4">Dinner</label>
					<div>
						<textarea id="element_4" name="dinner" class="element textarea small"></textarea>
					</div>
				</li>
				
				<li id="li_5">
					<label class="description" for="element_5">Other Foods </label>
					<div>
						<textarea id="element_5" name="others" class="element textarea small"></textarea>
					</div>
				</li>
				
				<li id="li_6">
					<label class="description" for="element_6">Activities</label>
					<div>
						<textarea id="element_6" name="dailyActivities" class="element textarea small"></textarea>
					</div>
				</li>

				<li class="buttons">
					<input type="hidden" name="form_id" value="743549" /> 
					<input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" />
				</li>
			</ul>
		</form>
		<div id="footer">
			<i>&copy;2013 All Rights Reserved.</i>
		</div>
	</div>
	<img id="bottom" src="img/bottom.png" alt="" />
</body>
</html>