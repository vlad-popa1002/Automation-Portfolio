package mainPageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTests;

public class MainPageTests extends BaseTests {

    @Test
    public void testEnterFirstName() {
        String firstName = "John";
        mainPage.enterFirstName(firstName);
        Assert.assertEquals(mainPage.nameField.getAttribute("value"), firstName);
    }

    @Test
    public void testEnterLastName() {
        String lastName = "Doe";
        mainPage.enterLastName(lastName);
        Assert.assertEquals(mainPage.lastNameField.getAttribute("value"), lastName);
    }

    @Test
    public void testEnterEmail() {
        String email = "test@test.test";
        mainPage.enterEmail(email);
        Assert.assertEquals(mainPage.emailField.getAttribute("value"), email);
    }

    @Test
    public void testEnterMobileNumber() {
        String mobileNumber = "123456789";
        mainPage.enterMobileNumber(mobileNumber);
        Assert.assertEquals(mainPage.mobileField.getAttribute("value"), mobileNumber);
    }

    @Test
    public void testClickDateOfBirthField() {
        mainPage.clickDateOfBirthField();
        Assert.assertTrue(mainPage.dateOfBirthField.isDisplayed());
    }

    @Test
    public void testSelectMonthOfBirth() {
        String month = "January";
        mainPage.selectMonthOfBirth(month);
        Assert.assertEquals(mainPage.monthDropdown.getAttribute("value"), month);
    }

    @Test
    public void testSelectYearOfBirth() {
        String year = "1980";
        mainPage.selectYearOfBirth(year);
        Assert.assertEquals(mainPage.yearDropdown.getAttribute("value"), year);
    }

    @Test
    public void testSelectDateOfMonth() {
        mainPage.selectDateOfMonth();
        Assert.assertTrue(mainPage.dateOfMonth.getAttribute("class").contains("react-datepicker__day--selected"));
    }

    @Test
    public void testSelectAutomationTestingModulesCheckbox() {
        mainPage.selectAutomationTestingModulesCheckbox();
        Assert.assertTrue(mainPage.automationTestingModulesCheckbox.isSelected());
    }

    @Test
    public void testEnterCurrentAddress() {
        String address = "Somewhere Str., 1, Worldwide";
        mainPage.enterCurrentAddress(address);
        Assert.assertEquals(mainPage.currentAddressField.getAttribute("value"), address);
    }

}
