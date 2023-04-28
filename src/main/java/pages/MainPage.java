package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseTests;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainPage {

    protected  WebDriver driver = BaseTests.getDriver();


     WebElement nameField = driver.findElement(By.id("firstName"));

        public void nameFieldInput(){
            nameField.sendKeys("John");
        }
    WebElement lastNameField = driver.findElement(By.id("lastName"));

        public void lastNameFieldInput() {
            lastNameField.sendKeys("Doe");
        }

    // Find and fill the Email field
    WebElement emailField = driver.findElement(By.id("userEmail"));

        public void emailFieldInput() {
            emailField.sendKeys("test@test.test");
        }
    // Find and select the Male radio button for Gender
//        WebElement maleRadioButton = driver.findElement(By.id("gender-radio-1"));
//        maleRadioButton.click();

    // Find and fill the Mobile field
    WebElement mobileField = driver.findElement(By.id("userNumber"));

        public void mobileFieldInput() {
            mobileField.sendKeys("123456789");
        }
    // Find and select the Date of Birth field and enter a date
    WebElement dateOfBirthField = driver.findElement(By.id("dateOfBirthInput"));
        public void dateOfBirthFieldInput() {
            dateOfBirthField.click();
        }
    WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
       public void monthDropdownInput() {
        monthDropdown.sendKeys("January");
       }
    WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
       public void yearDropdownInput(){
        yearDropdown.sendKeys("1980");
       }
    WebElement dateOfMonth = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--001']"));
       public void dateOfMonthInput(){
       dateOfMonth.click();
       }

    // Find and select the Automation Testing Modules checkbox for Subjects
    WebElement automationTestingModulesCheckbox = driver.findElement(By.xpath("//label[text()='Automation Testing']"));

       public void automationTestingModulesCheckboxClick() {
           automationTestingModulesCheckbox.click();
       }
    // Find and fill the Current Address field
    WebElement currentAddressField = driver.findElement(By.id("currentAddress"));

       public void currentAddressFieldInput() {
           currentAddressField.sendKeys("Somewhere Str., 1, Worldwide");
       }
    // Find and click the Submit button
    WebElement submitButton = driver.findElement(By.id("submit"));
       public void sumbitButtonClick() {
           submitButton.click();
       }
}