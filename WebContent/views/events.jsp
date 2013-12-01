<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Schedule Events</title>
	<link rel="stylesheet" type="text/css" href="css/view.css" media="all" />
	<script type="text/javascript" src="js/view.js"></script>
	<script type="text/javascript" src="js/calendar.js"></script>
</head>

<body id="main_body" >
	
	<img id="top" src="img/top.png" alt="" />
	<div id="form_container">
	
		<h1><a>Schedule Events</a></h1>
		<form id="form_743549" class="appnitro"  method="post" action="">
		
			<div class="form_description">
				<h2>Schedule Events</h2>
				<p></p>
			</div>
									
			<ul>
				<li id="li_1" >
					<label class="description" for="element_1">Name </label>
					<div>
						<input id="element_1" name="element_1" class="element text medium" type="text" maxlength="255" value=""/> 
					</div> 
				</li>		
					
				<li id="li_2" >
					<label class="description" for="element_2">Date </label>
				    <span>
				 		<input id="element_2_3" name="element_2_3" class="element text" size="10" maxlength="10" value="" type="text" />
						<label for="element_2_3">MM/DD/YYYY</label>
					</span>
									
					<span id="calendar_2">
						<img id="cal_img_2" class="datepicker" src="img/calendar.gif" alt="Pick a date." />	
					</span>
					<script type="text/javascript">
						Calendar.setup({
							inputField	 : "element_2_3",
							baseField    : "element_2",
							displayArea  : "calendar_2",
							button		 : "cal_img_2",
							ifFormat	 : "%B %e, %Y",
							onSelect	 : selectDate
						});
					</script>
					 
				</li>		
				
				<li id="li_3" >
					<label class="description" for="element_3"> </label>
					<span>	
						<input id="element_3_1" name="element_3_1" class="element checkbox" type="checkbox" value="1" />
						<label class="choice" for="element_3_1">Repeat</label>

					</span> 
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