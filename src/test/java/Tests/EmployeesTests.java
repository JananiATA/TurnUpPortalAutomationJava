package Tests;

import Pages.EmployeesPage;
import Pages.Homepage;
import Pages.LoginPage;
import Utilities.Commondriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmployeesTests extends Commondriver
    {
        @BeforeTest
        public void EmployeesSetUp()
        {
            driver = new ChromeDriver();

            //login page object initialization and Definition
            LoginPage loginPageObj = new LoginPage();
            loginPageObj.LoginActions(driver);

            //Home page object initialization and definition
            Homepage homePageObj = new Homepage();
            homePageObj.GoToEmployeesPage(driver);
        }

        @Test
        public void CreateEmployeeTest()
        {
            EmployeesPage employeesPageObj = new EmployeesPage();
            employeesPageObj.CreateEmployee(driver);
        }

        @Test
        public void EditEmployeeTest()
        {
            EmployeesPage employeesPageObj = new EmployeesPage();
            employeesPageObj.EditEmployee(driver);
        }

        @Test

        public void DeleteEmployeeTest()
        {
            EmployeesPage employeePageObj = new EmployeesPage();
            employeePageObj.DeleteEmployee(driver);
        }

        @AfterTest

      public void TearDown()


        {
            driver.quit();
        }


    }

