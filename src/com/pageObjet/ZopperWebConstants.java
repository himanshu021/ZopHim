package com.pageObjet;

public interface ZopperWebConstants 

{
	
	String ZopperURL= "http://mstage.zopper.com:9900/";
	//String SelectBanglore= "//a[@cities='["Bengaluru"]']";
	//String selectDelhi= "//a[@cities='["Delhi"]']";
	String selectDelhiLoc= "//a[@regionname= 'Delhi']";
	String selectLocalityDelhi= "//a[@locationname='Alaknanda']";
	String selectBengaluruLoc= "//a[@regionname= 'Bengaluru']";
	String selectLocalityBanglore= "//a[@locationname='BTM']";
	
	
	
	// Login elements
	
	
	
	String tapOnRegisterUser= "//a[@href='/signup']";
	String tapOnMyAccount= "//a[@href='/myaccount']";
	String selectSignInTab= "//a[contains(.,'sign in')]";
	String selectEmailPhonne= "//input[contains(@placeholder, 'Email/Mobile no')]";
	String selectPassword= "//input[contains(@placeholder, 'Password')]";
	String tapOnSignButton= "//input[contains(@value, 'sign in')]";
	String tapOnCheckOutButton="//a[contains(.,'Check Out')]";
	String tapOnAddressOkButton= "//div[contains(@id,'address-ok')]";
	String selectOnCOD= "//span[contains(.,'CASH ON DELIVERY')]";
	String tapOnPlaceOrder= "//a[@href='/success']";
	String tapForOrder= "html/body/div[1]/div[4]/div[5]/a";
	
	String myOrder= "//span[contains(.,'Orders')]";
	
	
	String selectMobileTablets= "//span[contains(.,'Mobiles and Tablets')]";
	String selectAndroidPhones= "//span[contains(.,'Android Phones')]";
	String selectlistandroidProduct= "//h2[contains(.,'Samsung Galaxy A5 SM-A500GZWD Pearl White')]";
	
	
	//Social Login
	
	String fbLogin= "id('facebookSignIn')";
	String fbEmail= "id('email')";
	String fbPass= "id('pass')";
	String logInButton= "id('u_0_2')";
	String yatraOk= "id('platformDialogForm')/x:div[3]/x:div/x:table/x:tbody/x:tr/x:td[2]/x:button[2]";
	
	String gpLogin= "id('gSignInWrapper')";
	String gpEmail= "id('Email')";
	String gpNext= "id('next')";
	String gpPass= "id('Passwd')";
	String gpSignInButton= "id('signIn')";
	
	
	
	
	
	

}
