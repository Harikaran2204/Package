package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class DuplicateLeadPage extends Annotations{
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName") WebElement eleCompanyName;
	@FindBy(how=How.NAME, using="submitButton") WebElement eleCreateLead;	
	public DuplicateLeadPage enterCompanyName(String CompanyName) {
		clearAndType(eleCompanyName, CompanyName);
		return this;
	}	
		public ViewLeadPage clickCreateLead() {
			click(eleCreateLead);
			return new ViewLeadPage();
		
	}

}