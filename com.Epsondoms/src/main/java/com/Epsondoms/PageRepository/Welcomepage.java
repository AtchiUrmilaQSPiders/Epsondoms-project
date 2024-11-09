package com.Epsondoms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	// initialization
		public Welcomepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// declaration
		@FindBy(id = "name")
		private WebElement name;
		@FindBy(id = "email")
		private WebElement email;
		@FindBy(xpath = "//input[@type='password']")
		private WebElement password;
		@FindBy(id = "mobile")
		private WebElement mobileno;
		@FindBy(xpath = "//input[@id='female']")
		private WebElement gender;
		//@FindBy(xpath = "//input[@id='banglore']")
		@FindBy(id = "bangalore")
		private WebElement place;
		//@FindBy(xpath = "//textarea[@id='feedback']")
		@FindBy(id = "feedback")
		private WebElement feedback;
		@FindBy(xpath = "//input[@name='photo']")
		private WebElement file;
		@FindBy(xpath = "//input[@id='reg']")
		private WebElement reg;
		@FindBy(name = "country1")
		private WebElement country;
		@FindBy(name = "dob")
		private WebElement date;
		@FindBy(partialLinkText = "Contact Us")
		private WebElement contactus;

		// Utilization
		public WebElement getName() {
			return name;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getMobileno() {
			return mobileno;
		}

		public WebElement getContactus() {
			return contactus;
		}

		public WebElement getGender() {
			return gender;
		}

		public WebElement getPlace() {
			return place;
		}

		public WebElement getFeedback() {
			return feedback;
		}

		public WebElement getFile() {
			return file;
		}

		public WebElement getReg() {
			return reg;
		}

		public WebElement getCountry() {
			return country;
		}

		public WebElement getDate() {
			return date;
		}

	}

	
