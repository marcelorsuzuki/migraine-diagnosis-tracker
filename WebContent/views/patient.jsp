<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Patient Registration</title>
	<link rel="stylesheet" type="text/css" href="css/view.css" media="all" />
	<script type="text/javascript" src="js/view.js"></script>
	<script type="text/javascript" src="js/calendar.js"></script>
</head>
<body id="main_body" >
	
	<img id="top" src="img/top.png" alt="" />
	<div id="form_container">
	
		<h1><a>Patient Registration</a></h1>
		
		<jsp:include page="menu_inc.jsp" />
		
		<form id="form_743687" class="appnitro"  method="post" action="patient-save">
		
			<div class="form_description">
				<h2>Patient Registration</h2>
				<p></p>
			</div>
									
			<ul >
				<li id="li_1" >
					<label class="description" for="element_1">Name </label>
					<div>
						<input id="element_1" name="name" class="element text medium" type="text" maxlength="255" value=""/> 
					</div> 
				</li>		
				
				<li id="li_2" >
				
					<label class="description" for="element_2">Birthdate </label>
					
					<span>
				 		<input id="element_2_3" name="birthday" class="element text" size="10" maxlength="10" value="" type="text" />
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
				
				<li id="li_14" >
					<label class="description" for="element_14">Gender </label>
					<span>
						<input id="element_14_1" name="gender" class="element radio" type="radio" value="m" />
						<label class="choice" for="element_14_1">Male</label>
						<input id="element_14_2" name="gender" class="element radio" type="radio" value="f" />
						<label class="choice" for="element_14_2">Female</label>
					</span> 
				</li>		
				
				<li id="li_15" >
					<label class="description" for="element_15">Marital Status </label>
					<div>
						<select class="element select small" id="element_15" name="maritalStatus"> 
							<option value="" selected="selected"></option>
							<option value="1" >Single</option>
							<option value="2" >Married</option>
							<option value="3" >Divorced</option>
							<option value="4" >Widowed</option>
							<option value="5" >Separated</option>
						</select>
					</div> 
				</li>		
				
				<li id="li_3" >
					<label class="description" for="element_3">Occupation </label>
					<div>
						<input id="element_3" name="job" class="element text medium" type="text" maxlength="255" value=""/> 
					</div> 
				</li>		
				
				<li id="li_4" >
					<label class="description" for="element_4">Address 1 </label>
					<div>
						<input id="element_4" name="address1" class="element text large" type="text" maxlength="255" value=""/> 
					</div> 
				</li>		
				
				<li id="li_5" >
					<label class="description" for="element_5">Address 2 </label>
					<div>
						<input id="element_5" name="address2" class="element text large" type="text" maxlength="255" value=""/> 
					</div> 
				</li>		
				
				<li id="li_6" >
					<label class="description" for="element_6">Address 3 </label>
					<div>
						<input id="element_6" name="address3" class="element text large" type="text" maxlength="255" value=""/> 
					</div> 
				</li>		
				
				<li id="li_7" >
					<label class="description" for="element_7">Zip Code </label>
					<div>
						<input id="element_7" name="zipCode" class="element text medium" type="text" maxlength="255" value=""/> 
					</div> 
				</li>		
				
				<!-- 
				<li id="li_16" >
					<label class="description" for="element_16">State </label>
					<div>
						<select class="element select medium" id="element_16" name="element_16"> 
							<option value="" selected="selected"></option>
							<option value="1" >Acre</option>
							<option value="2" >Alagoas</option>
							<option value="3" >Amap&aacute;</option>
							<option value="4" >Bahia</option>
							<option value="5" >Cear&aacute;</option>
							<option value="6" >Distrito Federal</option>
							<option value="7" >Esp&iacute;rito Santo</option>
							<option value="8" >Goi&aacute;</option>
							<option value="9" >Maranh&atilde;o</option>
							<option value="10" >Mato Grosso</option>
							<option value="11" >Mato Grosso do Sul</option>
							<option value="12" >Minas Gerais</option>
							<option value="13" >Par&aacute;</option>
							<option value="14" >Para&iacute;ba</option>
							<option value="15" >Paran&aacute;</option>
							<option value="16" >Pernambuco</option>
							<option value="17" >Piau&iacute;</option>
							<option value="18" >Rio de Janeiro</option>
							<option value="19" >Rio Grande do Norte</option>
							<option value="20" >Rio Grande do Sul</option>
							<option value="21" >Rond&ocirc;nia</option>
							<option value="22" >Roraima</option>
							<option value="23" >Santa Catarina</option>
							<option value="24" >S&atilde;o Paulo</option>
							<option value="25" >Sergipe</option>
							<option value="26" >Tocantins</option>
				
						</select>
					</div> 
				</li>	
				 	
				
				<li id="li_8" >
					<label class="description" for="element_8">City </label>
					<div>
						<input id="element_8" name="element_8" class="element text medium" type="text" maxlength="255" value=""/> 
					</div> 
				</li>
				-->		
				
				<li id="li_9" >
					<label class="description" for="element_9">Phone </label>
					<div>
						<input id="element_9_1" name="phone" class="element text" size="15"  value="" type="text" />
					</div>
					<!-- 
					<span>
						<input id="element_9_1" name="phone" class="element text" size="2" maxlength="2" value="" type="text" /> 
						-
						<label for="element_9_1">(##)</label>
					</span>
					<span>
						<input id="element_9_2" name="element_9_2" class="element text" size="5" maxlength="5" value="" type="text" /> 
						-
						<label for="element_9_2">#####</label>
					</span>
					<span>
				 		<input id="element_9_3" name="element_9_3" class="element text" size="4" maxlength="4" value="" type="text" />
						<label for="element_9_3">####</label>
					</span>
					 -->
				</li>		
				
				<li id="li_10" >
					<label class="description" for="element_10">ID 1 </label>
					<div>
						<input id="element_10" name="id" class="element text medium" type="text" maxlength="255" value="" /> 
					</div> 
				</li>		
					
				<li id="li_11" >
					<label class="description" for="element_11">ID 2 </label>
					<div>
						<input id="element_11" name="cpf" class="element text medium" type="text" maxlength="255" value="" /> 
					</div> 
				</li>		
				
				<li id="li_12" >
					<label class="description" for="element_12">E-mail </label>
					<div>
						<input id="element_12" name="email" class="element text medium" type="text" maxlength="255" value="" /> 
					</div> 
				</li>		
				
				<li id="li_13" >
					<label class="description" for="element_13">Notes </label>
					<div>
						<textarea id="element_13" name="notes" class="element textarea small"></textarea> 
					</div> 
				</li>

				<li id="li_13" >
					<label class="description" for="element_14">Login </label>
					<div>
						<input id="element_14" name="login" class="element text medium" type="text" maxlength="255" value="" /> 
					</div> 
				</li>

				<li id="li_13" >
					<label class="description" for="element_15">Password </label>
					<div>
						<input id="element_15" name="password" class="element text medium" type="password" maxlength="255" value="" /> 
					</div> 
				</li>
			
				<li class="buttons">
			    	<input type="hidden" name="form_id" value="743687" />
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