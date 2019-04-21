package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindLeadPage extends Annotations{
	
	public FindLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH, using="(//input[@class=' x-form-text x-form-field'])[24]")  WebElement eleEnterLeadID;
	@FindBy(how=How.XPATH, using="(//a[@class=\"linktext\"])[4]") WebElement eleClickLeadID;
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']") WebElement eleFindLead;
	
	
	public FindLeadPage enterLeadID(String LeadID) {
		clearAndType(eleEnterLeadID, LeadID);
		return this;
	}
	
	public FindLeadPage clickFindLead() throws InterruptedException {
		click(eleFindLead);
		Thread.sleep(3000);
		return this;
	}
	
	public ViewLeadPage clickLeadID() {
		click(eleClickLeadID);
		return new ViewLeadPage();
	}
}
