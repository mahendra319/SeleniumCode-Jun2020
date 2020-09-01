package qa.selenium.sessions;

public class CustomXpathBasics {

	public static void main(String[] args) {

		//https://app.hubspot.com/login/
		//https://classic.crmpro.com/
		
		//xPath: is a locator and is not an attribute like Id,Class,name....
		//xPath is a address of WebElement
		//types: absolute xPath and relative xPath
		
		//1.syntax: //htmltag[@attribute1='value']
			//ex:  //input[@id='username']
			//ex: //input[@type='email']
			//ex: //input[@class='form-control private-form__control login-email']
			//ex: //input[@name='username']
		
		
		
		
		
		//2.syntax: //htmltag[@attr1='value' and @attr2='value']
			//ex: //input[@type='email' and @id]
			//ex: //input[@type='email' and @id='username']
			//ex: //input[@id='username' and @type]
			//ex: //input[@id='username' and @type='email']
		
		
		
		//3. text(): it is function, not an attribute
		// syntax: //htmltag[text()='value']
			//ex: //h1[text()='Delight your customers, from wherever you are']
			//ex: //a[text()='Mobiles']
			//ex: //div[text()='Connect with Us']
			
		
	//4. syntax: (//htmltag[@attribute])[index] - index start from 1
			//ex: (//input[@type])[2] - hubspot password field
		
			
		
	//5. position() : is a function
		//syntax: (//htmltag[@attribute])[position()=index] - index starts from 1
			//ex: (//input[@type])[position()=1] - hubspot username filed
			//ex: (//input[@type='text'])[position()=4] - OrangeHRM site 30 days trail
		
	//6. last(): it is a function, which locates last element from the list of element
		//syntax: (//htmltag[@attribute])[last()]
			//ex: (//input[@type])[last()] - hubspot remember me checkbox
			//ex: (//input[@type='text'])[last()] - OrangeHRM site 30 days trail
		
		
	//7. contains(): is a function and used for dynamic attribute
		
		//syntax: //htmltag[contains(@attribute,'value')]
			//ex: //input[contains(@id,'username')] - hubspot username field
			//ex: //input[contains(@id,'user')] -hubspot username field
		
		//syntax: //htmltag[contains(text(),'value']
			//ex: //h3[contains(text(),'Calls')] - crmpro site
		
		//syntax: (//htmltag[contains(@attr.'value')])[index]
			//ex: (//h3[contains(text(),'Contact')])[2] - crmpro site
		
		//syntax: (//htmltag[contains(@attr.'value')])[position()=n] - n represents position number like 1 , 2 , 3 ...n
			//ex: (//h3[contains(text(),'Contact')])[position()=1] - crmpro site
		
		//syntax: (//htmltag[contains(@attr.'value')])[last()]
			//ex: (//h3[contains(text(),'Contact')])[last()] - crmpro site
		
	//8. starts-with(): 
		//syntax: //htmltag[starts-with(@attribute, 'value')] - values is must be starting part/wholepart from value
			//ex: //input[starts-with(@name,'user')]
		
		//syntax: //htmltag[starts-with(text(),'value')]
			//ex: //h3[starts-with(text(),'Contact')] - crmpro site
		
		//syntax: (//htmltag[starts-with(@attr,'value')])[index]
		//syntax: (//htmltag[starts-with(@attr,'value')])[position()= n]
		//syntax: (//htmltag[starts-with(@attr,'value')])[last()]
	
	//9. ends-with(): may or may not support
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
