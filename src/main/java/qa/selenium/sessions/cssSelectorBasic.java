package qa.selenium.sessions;

public class cssSelectorBasic {

	public static void main(String[] args) {

	//1. syntax: htmltag[attribute = 'value']
			//ex: input[id='username']
			//ex: input[name='username']
		
	//2. syntax: htmltag[attribute='value'][attribute='value'] -multiple attributes
			//ex: input[name='username'][type='text']
		
	//3. cssSelector with id : syntax: #id OR htmltag#id
			//ex: #username 
			//ex: input#username
		
	
	//4. cssSelector with class: syntax: .classname OR htmltag.classname
		//if one class: .C1 OR htmltag.C1
		//if multiple classes: .C1.C2.C3...Cn   OR  htmltag.C1.C2.C3...Cn
			//ex: .form-control.private-form__control.login-email
			//ex: input..form-control.private-form__control.login-email
			//ex: input.login-email
			//ex: .login-email
		
		
	//5. cssSelector with Id and Classname : 
		
		//syntax: htmltag#id.classname OR  htmltag.classname#id
			//ex: input.login-email#username
			//ex: input#username.login-email
				
		//syntax: #id.classname OR .classname#id
			//ex: .login-email#username
			//ex: #username.login-email
		
		//syntax: .c1.c2.c3...Cn#id OR #id.c1.c2.c3...Cn
			//ex: #username.form-control.private-form__control.login-email
			//ex: .form-control.private-form__control.login-email#username
		
		//syntax: htmltag.c1.c2.c3...cn#id OR htmltag#id.c1.c2.c3....cn
			//ex: input#username.form-control.private-form__control.login-email
			//ex: input.form-control.private-form__control.login-email#username
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
