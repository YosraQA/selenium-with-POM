package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utility.ConfigFileReader;
import com.e2etests.automation.utility.Setup;

public class AuthenticationPage {
	
	private ConfigFileReader configFileReader;

	/*@FindBy WebElements*/
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Open Menu')]")
	public static WebElement menuList;
	
	public AuthenticationPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create methods*/
	
	public void goToUrl () {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	
	public void fillUsername(String txt_Username) {
		username.sendKeys(txt_Username);
	}
	
	public void fillPassword(String txt_Password) {
		password.sendKeys(txt_Password);
	}
	
	public void clickOnBtnLogin () {
		btnLogin.submit();
		
	}

}
