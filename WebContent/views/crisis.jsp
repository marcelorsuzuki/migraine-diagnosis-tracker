<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Crisis Registration</title>
	<link rel="stylesheet" type="text/css" href="css/view.css" media="all" />
	<script type="text/javascript" src="js/view.js"></script>
	<script type="text/javascript" src="js/calendar.js"></script>
</head>
<body id="main_body" >
	
	<img id="top" src="img/top.png" alt="" />
	<div id="form_container">
	
		<h1><a>Crisis Registration</a></h1>
		
		<form id="form_743394" class="appnitro"  method="post" action="">
			<div class="form_description">
				<h2>Crisis Registration</h2>
				<p></p>
			</div>						
		
			<ul>
				
				<li id="li_1" >
					<label class="description" for="element_1">Date </label>
					<!-- <span>
						<input id="element_1_1" name="element_1_1" class="element text" size="2" maxlength="2" value="" type="text" /> 
						/
						<label for="element_1_1">MM</label>
					</span>
					<span>
						<input id="element_1_2" name="element_1_2" class="element text" size="2" maxlength="2" value="" type="text" /> 
						/
						<label for="element_1_2">DD</label>
					</span>
					<span>
				 		<input id="element_1_3" name="element_1_3" class="element text" size="4" maxlength="4" value="" type="text" />
						<label for="element_1_3">YYYY</label>
					</span>
				     -->
					<span>
				 		<input id="element_1_3" name="element_1_3" class="element text" size="10" maxlength="10" value="" type="text" />
						<label for="element_1_3">MM/DD/YYYY</label>
					</span>
					<span id="calendar_1">
						<img id="cal_img_1" class="datepicker" src="img/calendar.gif" alt="Pick a date." />	
					</span>
					<script type="text/javascript">
						Calendar.setup({
							inputField	 : "element_1_3",
							baseField    : "element_1",
							displayArea  : "calendar_1",
							button		 : "cal_img_1",
							ifFormat	 : "%B %e, %Y",
							onSelect	 : selectDate
						});
					</script>
				</li>		
				
				<li id="li_2" >
					<label class="description" for="element_2">Intensity </label>
					<span>
						<input id="element_2_1" name="element_2" class="element radio" type="radio" value="1" />
						<label class="choice" for="element_2_1">Low</label>
						
						<input id="element_2_2" name="element_2" class="element radio" type="radio" value="2" />
						<label class="choice" for="element_2_2">Medium</label>
						
						<input id="element_2_3" name="element_2" class="element radio" type="radio" value="3" />
						<label class="choice" for="element_2_3">Strong</label>
					</span> 
				</li>		
				
				<li id="li_3" >
					<label class="description" for="element_3">Nausea </label>
					<span>
						<input id="element_3_1" name="element_3" class="element radio" type="radio" value="1" />
						<label class="choice" for="element_3_1">Yes</label>
						<input id="element_3_2" name="element_3" class="element radio" type="radio" value="2" />
						<label class="choice" for="element_3_2">No</label>
					</span> 
				</li>		
				
				<li id="li_4" >
					<label class="description" for="element_4">Time </label>
					<div>
						<select class="element select small" id="element_4" name="element_4"> 
							<option value="" selected="selected"></option>
							<option value="1" >Morning</option>
							<option value="2" >Afternoon</option>
							<option value="3" >Evening</option>
						</select>
					</div> 
				</li>
					
				<li class="buttons">
					<input type="hidden" name="form_id" value="743394" />
					    
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