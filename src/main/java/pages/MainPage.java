package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseTests;

public class MainPage {

    protected  WebDriver driver = BaseTests.getDriver();
    public WebElement lastNameField = driver.findElement(By.id("lastName"));
    public WebElement nameField = driver.findElement(By.id("firstName"));
    public WebElement emailField = driver.findElement(By.id("userEmail"));
    public WebElement mobileField = driver.findElement(By.id("userNumber"));
    public WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
    public WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
    public WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
    public WebElement dateOfMonth = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--001']"));
    public WebElement automationTestingModulesCheckbox = driver.findElement(By.xpath("//label[text()='Automation Testing']"));
    public  WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
    public WebElement submitButton = driver.findElement(By.id("submit"));

    public void enterFirstName(String firstName) {
        nameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterMobileNumber(String mobileNumber) {
        mobileField.sendKeys(mobileNumber);
    }

    public void clickDateOfBirthField() {
        dateOfBirthField.click();
    }

    public void selectMonthOfBirth(String month) {
        monthDropdown.sendKeys(month);
    }

    public void selectYearOfBirth(String year) {
        yearDropdown.sendKeys(year);
    }

    public void selectDateOfMonth() {
        dateOfMonth.click();
    }

    public void selectAutomationTestingModulesCheckbox() {
        automationTestingModulesCheckbox.click();
    }

    public void enterCurrentAddress(String address) {
        currentAddressField.sendKeys(address);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

}